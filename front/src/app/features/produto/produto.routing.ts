import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProdutoFormComponent } from './views/produto-form/produto-form.component';
import { ProdutoListComponent } from './views/produto-list/produto-list.component';
import { ProdutoResolver } from './views/produto-form/produto.resolver';

const routes: Routes = [{
  path: 'produto',  children: [
    {
      path: 'create', component: ProdutoFormComponent
    },
    {
      path: 'list', component: ProdutoListComponent
    },
    {
      path: 'edit/:id', component: ProdutoFormComponent, resolve: [ProdutoResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class ProdutoRouterModule { }
