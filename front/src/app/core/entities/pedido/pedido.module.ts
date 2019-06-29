import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { PedidoService } from './pedido.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'pedido',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/pedido`,
            },
        ]),
    ],
    providers: [
        PedidoService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class PedidoModule {}
