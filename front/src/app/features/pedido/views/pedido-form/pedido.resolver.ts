import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pedido } from 'src/app/core/entities/pedido/pedido';
import { PedidoService } from 'src/app/core/entities/pedido/pedido.service';


@Injectable()
export class PedidoResolver implements Resolve<Pedido []> {

    constructor(private service: PedidoService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
