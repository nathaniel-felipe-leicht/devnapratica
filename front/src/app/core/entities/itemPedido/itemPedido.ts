import * as moment from 'moment';
import { ItemPedidoDto } from './itemPedido-dto';
import { Produto } from '../produto/produto';


export class ItemPedido {
    public id?: string;
    public produto: Produto;
    public quantidade: number;
    public valorTotal: number;
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(itemPedidoDto: ItemPedidoDto, originEntity?: string): ItemPedido {
        const model: any = { ...itemPedidoDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as ItemPedido;
    }

    public static toDto(itemPedido: ItemPedido, originEntity?: string): ItemPedidoDto {
        const dto: any = { ...itemPedido };

        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
