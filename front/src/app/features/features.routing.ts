import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [{
  path: 'clientes', redirectTo: 'cliente/list'
},
{
  path: 'produtos', redirectTo: 'produto/list'
},
{
  path: 'movimentosEstoque', redirectTo: 'movimentoEstoque/list'
},
{
  path: 'pedidos', redirectTo: 'pedido/list'
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class FeaturesRouterModule { }
