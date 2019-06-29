import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PedidoFormComponent } from './views/pedido-form/pedido-form.component';
import { PedidoListComponent } from './views/pedido-list/pedido-list.component';
import { PedidoResolver } from './views/pedido-form/pedido.resolver';

const routes: Routes = [{
  path: 'pedido',  children: [
    {
      path: 'create', component: PedidoFormComponent
    },
    {
      path: 'list', component: PedidoListComponent
    },
    {
      path: 'edit/:id', component: PedidoFormComponent, resolve: [PedidoResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class PedidoRouterModule { }
