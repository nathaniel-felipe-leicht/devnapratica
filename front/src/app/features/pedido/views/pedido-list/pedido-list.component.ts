import { Component, OnInit } from '@angular/core';
import { PedidoService } from 'src/app/core/entities/pedido/pedido.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Pedido } from 'src/app/core/entities/pedido/pedido';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-pedido-list',
  templateUrl: './pedido-list.component.html',
  styleUrls: ['./pedido-list.component.scss']
})
export class PedidoListComponent implements OnInit {

  pedidos: Pedido[];
  columns: any[];

  constructor(
    private pedidoService: PedidoService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.pedidoService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.pedidos = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'cliente.nome', header: 'Cliente' },
      { field: 'data', header: 'Data' },
      { field: '', header: '' },
    ];

    return gridcloumns;
  }

  public onRemove(item: Pedido) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/pedido/create'], { relativeTo: this.route });
  }

  public editItem(pedido: Pedido) {
    this.router.navigate([`/pedido/edit/${pedido.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id } = item.data;

    this.pedidoService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.pedidos =  this.pedidos.filter(pedido => pedido.id !== id);
      this.pedidos.find((pedido: Pedido) => pedido.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `O Pedido foi deletado!`
      });
    });
  }

  public onRemoveReject() {
    this.messageService.clear('removeConfirm');
  }

  public listErrorCatch() {
      return catchError((err: any) => {
        if (err) {
          this.messageService.add({
            key: 'remove-toast',
            severity: 'error',
            summary: 'Erro!',
            detail: `Erro ao carregar a lista!`
          });
        }
        return throwError(err);
      });
  }

}
