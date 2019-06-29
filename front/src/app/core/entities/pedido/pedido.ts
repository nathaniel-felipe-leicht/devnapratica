import * as moment from 'moment';
import { PedidoDto } from './pedido-dto';
import { Cliente } from '../cliente/cliente';
import { ItemPedido } from '../itemPedido/itemPedido';

export class Pedido {
    public id?: string;
    public data: Date;
    public observacoes: string;
    public cliente: Cliente;
    public itens: ItemPedido[];
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(pedidoDto: PedidoDto, originEntity?: string): Pedido {
        const model: any = { ...pedidoDto };

        model.data = model.data && moment(model.data).toDate();
        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Pedido;
    }

    public static toDto(pedido: Pedido, originEntity?: string): PedidoDto {
        const dto: any = { ...pedido };

        dto.data = dto.data && moment(dto.data).format('YYYY-MM-DD');
        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
