import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeaturesRouterModule } from './features.routing';
import { ClienteModule } from './cliente/cliente.module';
import { ProdutoModule } from './produto/produto.module';
import { RouterModule } from '@angular/router';
import { MovimentoEstoqueModule } from './movimentoEstoque/movimentoEstoque.module';
import { PedidoModule } from './pedido/pedido.module'
import { FormsModule }   from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms'; 
import { AutoCompleteModule } from 'primeng/primeng';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FeaturesRouterModule,
    ClienteModule,
    ProdutoModule,
    MovimentoEstoqueModule,
    PedidoModule,
    FormsModule,
    ReactiveFormsModule,
    AutoCompleteModule
  ],
  exports: [
    RouterModule
  ]
})
export class FeaturesModule { }
