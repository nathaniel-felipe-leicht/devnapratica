import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { MessageService } from 'primeng/components/common/messageservice';
import { RequestHelper } from '../request.helper';

@Injectable()
export class ActionsService extends RequestHelper {

    public baseURL: string;

    constructor(protected http: HttpClient, protected messageService: MessageService) {
        super(
            http
        );
        this.baseURL = `https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/actions/`; 
    }

    public refreshQtdPedidosCliente(idCliente: string)
    {
        return this.http.post(this.baseURL + "refreshQtdPedidosCliente", {idCliente}, {headers: this.headers}).pipe(this.defaultCatch());
    }

    public refreshStatusCredito(idCliente: string)
    {
        return this.http.post(this.baseURL + "refreshStatusCredito", {idCliente}, {headers: this.headers}).pipe(this.defaultCatch());
    }
}
