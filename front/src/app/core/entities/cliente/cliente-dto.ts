export interface ClienteDto {
  id?: string;
  nome: string;
  dataNascimento: string;
  creditoHabilitado: string;
  cpf: string;
  qtPedidos: number;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
