export interface ProdutoDto {
  id?: string;
  descricao: string;
  valorUnitario: number;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
