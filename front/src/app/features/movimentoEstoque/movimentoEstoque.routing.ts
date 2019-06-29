import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MovimentoEstoqueFormComponent } from './views/movimentoEstoque-form/movimentoEstoque-form.component';
import { MovimentoEstoqueListComponent } from './views/movimentoEstoque-list/movimentoEstoque-list.component';
import { MovimentoEstoqueResolver } from './views/movimentoEstoque-form/movimentoEstoque.resolver';

const routes: Routes = [{
  path: 'movimentoEstoque',  children: [
    {
      path: 'create', component: MovimentoEstoqueFormComponent
    },
    {
      path: 'list', component: MovimentoEstoqueListComponent
    },
    {
      path: 'edit/:id', component: MovimentoEstoqueFormComponent, resolve: [MovimentoEstoqueResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class MovimentoEstoqueRouterModule { }
