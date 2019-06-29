import { ClienteDto } from '../cliente/cliente-dto';
import { ItemPedidoDto } from '../itemPedido/itemPedido-dto';

export interface PedidoDto {
  id?: string;
  data: Date;
  observacoes: string;
  cliente: ClienteDto;
  itens: ItemPedidoDto[];
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
