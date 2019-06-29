import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClienteModule } from './entities/cliente/cliente.module';
import { ProdutoModule } from './entities/produto/produto.module';
import { MovimentoEstoqueModule } from './entities/movimentoEstoque/movimentoEstoque.module';
import { PedidoModule } from './entities/pedido/pedido.module'
import { ItemPedidoModule } from './entities/itemPedido/itemPedido.module'
import { FormsModule }   from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms'; 
import { AutoCompleteModule } from 'primeng/primeng';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    ClienteModule,
    ProdutoModule,
    MovimentoEstoqueModule,
    ItemPedidoModule,
    PedidoModule,
    FormsModule,
    ReactiveFormsModule,
    AutoCompleteModule
  ]
})
export class CoreModule { }
