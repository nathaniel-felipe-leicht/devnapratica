import { Component, OnInit } from '@angular/core';
import { MovimentoEstoqueService } from 'src/app/core/entities/movimentoEstoque/movimentoEstoque.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { MovimentoEstoque } from 'src/app/core/entities/movimentoEstoque/movimentoEstoque';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-movimentoEstoque-list',
  templateUrl: './movimentoEstoque-list.component.html',
  styleUrls: ['./movimentoEstoque-list.component.scss']
})
export class MovimentoEstoqueListComponent implements OnInit {

  movimentosEstoque: MovimentoEstoque[];
  columns: any[];

  constructor(
    private movimentoEstoqueService: MovimentoEstoqueService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.movimentoEstoqueService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.movimentosEstoque = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'produto.descricao', header: 'Produto' },
      { field: 'quantidade', header: 'Quantidade' },
      { field: '', header: '' },
    ];

    return gridcloumns;
  }

  public onRemove(item: MovimentoEstoque) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/movimentoEstoque/create'], { relativeTo: this.route });
  }

  public editItem(movimentoEstoque: MovimentoEstoque) {
    this.router.navigate([`/movimentoEstoque/edit/${movimentoEstoque.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.movimentoEstoqueService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.movimentosEstoque =  this.movimentosEstoque.filter(movimentoEstoque => movimentoEstoque.id !== id);
      this.movimentosEstoque.find((movimentoEstoque: MovimentoEstoque) => movimentoEstoque.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `O Movimento de Estoque foi deletado!`
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
