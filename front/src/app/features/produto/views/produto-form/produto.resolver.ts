import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Produto } from 'src/app/core/entities/produto/produto';
import { ProdutoService } from 'src/app/core/entities/produto/produto.service';


@Injectable()
export class ProdutoResolver implements Resolve<Produto []> {

    constructor(private service: ProdutoService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
