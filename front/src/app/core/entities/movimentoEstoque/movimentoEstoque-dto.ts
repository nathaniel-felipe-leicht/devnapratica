import { ProdutoDto } from '../produto/produto-dto';

export interface MovimentoEstoqueDto {
  id?: string;
  produto: ProdutoDto;
  quantidade: number;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
