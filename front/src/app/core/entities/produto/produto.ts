import * as moment from 'moment';
import { ProdutoDto } from './produto-dto';

export class Produto {
    public id?: string;
    public descricao: string;
    public valorUnitario: number;
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(produtoDto: ProdutoDto, originEntity?: string): Produto {
        const model: any = { ...produtoDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Produto;
    }

    public static toDto(produto: Produto, originEntity?: string): ProdutoDto {
        const dto: any = { ...produto };

        dto.data = dto.data && moment(dto.data).format('YYYY-MM-DD');
        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
