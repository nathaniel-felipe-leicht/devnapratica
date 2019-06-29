import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { MovimentoEstoque } from 'src/app/core/entities/movimentoEstoque/movimentoEstoque';
import { MovimentoEstoqueService } from 'src/app/core/entities/movimentoEstoque/movimentoEstoque.service';


@Injectable()
export class MovimentoEstoqueResolver implements Resolve<MovimentoEstoque []> {

    constructor(private service: MovimentoEstoqueService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
