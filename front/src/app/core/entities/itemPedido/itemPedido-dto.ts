import { ProdutoDto } from '../produto/produto-dto';

export interface ItemPedidoDto {
  id?: string;
  produto: ProdutoDto
  quantidade: number;
  valorTotal: number;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
