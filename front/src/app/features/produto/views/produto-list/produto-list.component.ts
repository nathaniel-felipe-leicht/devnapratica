import { Component, OnInit } from '@angular/core';
import { ProdutoService } from 'src/app/core/entities/produto/produto.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Produto } from 'src/app/core/entities/produto/produto';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-produto-list',
  templateUrl: './produto-list.component.html',
  styleUrls: ['./produto-list.component.scss']
})
export class ProdutoListComponent implements OnInit {

  produtos: Produto[];
  columns: any[];

  constructor(
    private produtoService: ProdutoService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.produtoService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.produtos = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'descricao', header: 'Descrição' },
      { field: 'valorUnitario', header: 'Valor Unitário' },
      { field: '', header: '' },
    ];

    return gridcloumns;
  }

  public onRemove(produto: Produto) {
    this.messageService.add({
      key: 'removeConfirm',
      data: produto, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/produto/create'], { relativeTo: this.route });
  }

  public editProduto(produto: Produto) {
    this.router.navigate([`/produto/edit/${produto.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(produto: any) {
    const { id, nome } = produto.data;

    this.produtoService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.produtos = this.produtos.filter(produto => produto.id !== id);
      this.produtos.find((produto: Produto) => produto.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Produto ${nome} deletado!`
      });
    });
  }

  public onRemoveReject() {
    this.messageService.clear('removeConfirm');
  }

  private listErrorCatch() {
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
