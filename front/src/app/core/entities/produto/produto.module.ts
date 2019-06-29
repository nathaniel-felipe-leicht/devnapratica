import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { ProdutoService } from './produto.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'produto',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/produto`,
            },
        ]),
    ],
    providers: [
        ProdutoService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class ProdutoModule {}
