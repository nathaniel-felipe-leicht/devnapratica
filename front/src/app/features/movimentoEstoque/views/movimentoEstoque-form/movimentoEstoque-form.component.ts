import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { MovimentoEstoque } from 'src/app/core/entities/movimentoEstoque/movimentoEstoque';
import { MovimentoEstoqueService } from 'src/app/core/entities/movimentoEstoque/movimentoEstoque.service';
import { catchError, takeUntil } from 'rxjs/operators';
import { throwError, Subject } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { ProdutoService } from 'src/app/core/entities/produto/produto.service';
import { Produto } from 'src/app/core/entities/produto/produto';

@Component({
  selector: 'app-movimentoEstoque-form',
  templateUrl: './movimentoEstoque-form.component.html',
  styleUrls: ['./movimentoEstoque-form.component.scss']
})
export class MovimentoEstoqueFormComponent implements OnInit {
  public movimentoEstoqueForm: FormGroup;
  @Input() movimentoEstoque: MovimentoEstoque;
  private routeParams: any;
  private ngUnsubscribe = new Subject();
  public listProdutos: Produto[];

  constructor(
    private movimentoEstoqueService: MovimentoEstoqueService,
    private produtoService: ProdutoService,
    private formBuilder: FormBuilder,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.movimentoEstoqueForm = this.getFormGroup();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));
  }

  private getFormGroup() {
    return this.formBuilder.group({
      produto: new FormControl(undefined, Validators.compose([Validators.required])),
      quantidade: new FormControl(undefined, Validators.compose([Validators.required])),
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
    if (!this.movimentoEstoqueForm.valid) {
      return this.validateAllFormFields(this.movimentoEstoqueForm);
    }

    this.getSaveObservable()
    .pipe(
      catchError((err: any) => {
      console.log(err);
      return throwError(err);
    })
    ).subscribe(() => {
      this.goBack();
      console.log(`Saved`);
    });
  }

  public isNew() {
    return this.routeParams.id === undefined;
  }

  private goBack() {
    const previousRoute = '/movimentoEstoque/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = MovimentoEstoque.fromDto(entity);
        this.movimentoEstoqueForm.patchValue(value);
    } else {
        this.movimentoEstoqueForm.patchValue(new MovimentoEstoque());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
  }

  private getSaveObservable() {
    const { value } = this.movimentoEstoqueForm;
    const movimentoEstoqueDto = MovimentoEstoque.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.movimentoEstoqueService.insert(movimentoEstoqueDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O movimento de estoque foi inserido com sucesso!`,
          sticky: true
        });
    } else {
        const id = this.routeParams.id;
        observable = this.movimentoEstoqueService.update(id, movimentoEstoqueDto);
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

}
