import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { MovimentoEstoqueService } from './movimentoEstoque.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'movimentoEstoque',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/movimentoEstoque`,
            },
        ]),
    ],
    providers: [
        MovimentoEstoqueService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class MovimentoEstoqueModule {}
