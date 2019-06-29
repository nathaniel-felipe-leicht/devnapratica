import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { ItemPedidoService } from './itemPedido.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'itemPedido',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/itemPedido`,
            },
        ]),
    ],
    providers: [
        ItemPedidoService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class ItemPedidoModule {}
