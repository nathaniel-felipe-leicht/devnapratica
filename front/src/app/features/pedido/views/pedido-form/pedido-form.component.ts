import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Pedido } from 'src/app/core/entities/pedido/pedido';
import { PedidoService } from 'src/app/core/entities/pedido/pedido.service';
import { catchError, takeUntil } from 'rxjs/operators';
import { throwError, Subject } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { ProdutoService } from 'src/app/core/entities/produto/produto.service';
import { Produto } from 'src/app/core/entities/produto/produto';
import { ClienteService } from 'src/app/core/entities/cliente/cliente.service';
import { Cliente } from 'src/app/core/entities/cliente/cliente';
import { ItemPedidoService } from 'src/app/core/entities/itemPedido/itemPedido.service'
import { ItemPedido } from 'src/app/core/entities/itemPedido/itemPedido';
import { ActionsService } from 'src/app/core/actions/actions.service';

@Component({
  selector: 'app-pedido-form',
  templateUrl: './pedido-form.component.html',
  styleUrls: ['./pedido-form.component.scss']
})
export class PedidoFormComponent implements OnInit {
  public pedidoForm: FormGroup;
  public itemPedidoForm: FormGroup;
  @Input() pedido: Pedido;
  private routeParams: any;
  private ngUnsubscribe = new Subject();
  public listProdutos: Produto[];
  public listClientes: Cliente[];
  
  //Itens pedido
  public itensColumns: any[];
  public itensPedido: ItemPedido[];

  constructor(
    private pedidoService: PedidoService,
    private produtoService: ProdutoService,
    private clienteService: ClienteService,
    private itemPedidoService: ItemPedidoService,
    private formBuilder: FormBuilder,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute,
    private actionsService: ActionsService
    ) { }

  
  ngOnInit() {
    this.pedidoForm = this.getFormGroup();

    //Item Pedido
    this.itensPedido = [];
    this.itensColumns = this.getItensGridColumns();
    this.itemPedidoForm = this.getFormGroupItemPedido();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));
  }

  private getFormGroup() {
    return this.formBuilder.group({
      cliente: new FormControl(undefined, Validators.compose([Validators.required])),
      data:  new FormControl(undefined, Validators.compose([Validators.required])),
      observacoes:  new FormControl(undefined, Validators.compose([Validators.required])),
    });
  }

  private validateAllFormFields(formGroup: FormGroup) {
    Object.keys(formGroup.controls).forEach(field => {
        const control = formGroup.get(field);
        if (control instanceof FormControl) {
          control.markAsDirty({ onlySelf: true });
        } else if (control instanceof FormGroup) {
          this.validateAllFormFields(control);
        }
    });
  }

  public onSave() {
    if (!this.pedidoForm.valid) {
      return this.validateAllFormFields(this.pedidoForm);
    }

    if (this.itensPedido.length === 0) {
      this.messageService.add({
        key: 'form-toast',
        severity: 'error',
        summary: `Erro!`,
        detail: `Deve ser informado ao menos um item para o pedido!`,
        sticky: true
      });

      return this.validateAllFormFields(this.pedidoForm);
    }


    this.getSaveObservable()
    .pipe(
      catchError((err: any) => {
      console.log(err);
      return throwError(err);
    })
    ).subscribe((data) => {
      console.log(data);

      this.actionsService.refreshQtdPedidosCliente(data.cliente.id).subscribe( () => {
        this.actionsService.refreshStatusCredito(data.cliente.id).subscribe( () => {
          this.goBack();
        });
      });
      console.log(`Saved`);
    });
  }

  public isNew() {
    return this.routeParams.id === undefined;
  }

  private goBack() {
    const previousRoute = '/pedido/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Pedido.fromDto(entity);
        this.pedidoForm.patchValue(value);
    } else {
        this.pedidoForm.patchValue(new Pedido());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
  }

  private getSaveObservable() {
    const { value } = this.pedidoForm;
    const pedidoDto = Pedido.toDto(value);
    pedidoDto.itens = [];

    this.itensPedido.forEach(itemPedido => pedidoDto.itens.push(itemPedido));

    let observable;

    if (this.isNew()) {
        observable = this.pedidoService.insert(pedidoDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O movimento de estoque foi inserido com sucesso!`,
          sticky: true
        });
    } else {
        const id = this.routeParams.id;
        observable = this.pedidoService.update(id, pedidoDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O movimento de estoque foi atualizado com sucesso!`,
          sticky: true
        });
    }

    return observable;
  }

  private filterProduto(query, produtos: any[]):any[] {
    let filtered : any[] = [];
    for(let i = 0; i < produtos.length; i++) {
        let produto = produtos[i];
        if(produto.descricao.toLowerCase().indexOf(query.toLowerCase()) == 0) {
            filtered.push(produto);
        }
    }
    return filtered;
  }

  public searchProduto(event) {
    let query = event.query;

    this.produtoService.list()
    .pipe(this.listProdutosErrorCatch())
    .subscribe(({ contents }) => {
      this.listProdutos = this.filterProduto(query, contents);
    });
  }

  private listProdutosErrorCatch() {
    return catchError((err: any) => {
      if (err) {
        this.messageService.add({
          key: 'remove-toast',
          severity: 'error',
          summary: 'Erro!',
          detail: `Erro ao carregar a lista de produtos!`
        });
      }
      return throwError(err);
    });
  }

  private filterCliente(query, clientes: any[]):any[] {
    let filtered : any[] = [];
    for(let i = 0; i < clientes.length; i++) {
        let cliente = clientes[i];
        if(cliente.nome.toLowerCase().indexOf(query.toLowerCase()) == 0) {
            filtered.push(cliente);
        }
    }
    return filtered;
  }
  
  public searchCliente(event) {
    let query = event.query;

    this.clienteService.list()
    .pipe(this.listClientesErrorCatch())
    .subscribe(({ contents }) => {
      this.listClientes = this.filterCliente(query, contents);
    });
  }

  private listClientesErrorCatch() {
    return catchError((err: any) => {
      if (err) {
        this.messageService.add({
          key: 'remove-toast',
          severity: 'error',
          summary: 'Erro!',
          detail: `Erro ao carregar a lista de clientes!`
        });
      }
      return throwError(err);
    });
  }

  //Item pedido

  private getItensGridColumns() {
    const gridcloumns = [
      { field: 'produto.descricao', header: 'Produto' },
      { field: 'quantidade', header: 'Quantidade' },
      { field: 'valorTotal', header: 'Valor Total' },
      { field: '', header: '' },
    ];

    return gridcloumns;
  }

  private getFormGroupItemPedido() {
    return this.formBuilder.group({
      produto: new FormControl(undefined, Validators.compose([Validators.required])),
      quantidade: new FormControl(undefined, Validators.compose([Validators.required])),
      valorTotal:  new FormControl(undefined, Validators.compose([Validators.required])),
    });
  }

  public onRemoveItemPedido(itemPedido: ItemPedido) {
    const id = itemPedido.id;

    this.itensPedido = this.itensPedido.filter(itemPedido => itemPedido.id !== id);
    this.messageService.clear('removeConfirmItemPedido');

    this.messageService.add({
      key: 'form-toast',
      severity: 'success',
      summary: `Sucesso!`,
      detail: `O item foi removido com sucesso!`,
      sticky: false
    });
  }

  public clearPedidosFields() {
    this.itemPedidoForm.patchValue(new ItemPedido());
  }

  public onAddItemPedido(){
    if (!this.itemPedidoForm.valid) {
      return this.validateAllFormFields(this.itemPedidoForm);
    }

    this.getSaveObservableItemPedido()
    .pipe(
      catchError((err: any) => {
      console.log(err);
      return throwError(err);
    })
    ).subscribe((itemPedido: ItemPedido) => {
      this.itensPedido.push(itemPedido);
      this.clearPedidosFields();
      console.log(`Saved`);
      this.messageService.add({
        key: 'form-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `O item foi inserido com sucesso!`,
        sticky: false
      });
    });
  }

  private getSaveObservableItemPedido() {
    const { value } = this.itemPedidoForm;
    const itemPedidoDto = ItemPedido.toDto(value);

    let observable;

    observable = this.itemPedidoService.insert(itemPedidoDto);
   

    return observable;
  }
}
