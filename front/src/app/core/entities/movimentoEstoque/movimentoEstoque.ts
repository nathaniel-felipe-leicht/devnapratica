import * as moment from 'moment';
import { MovimentoEstoqueDto } from './movimentoEstoque-dto';
import { Produto } from '../produto/produto';

export class MovimentoEstoque {
    public id?: string;
    public produto: Produto;
    public quantidade: number;
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(movimentoEstoqueDto: MovimentoEstoqueDto, originEntity?: string): MovimentoEstoque {
        const model: any = { ...movimentoEstoqueDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as MovimentoEstoque;
    }

    public static toDto(movimentoEstoque: MovimentoEstoque, originEntity?: string): MovimentoEstoqueDto {
        const dto: any = { ...movimentoEstoque };

        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
