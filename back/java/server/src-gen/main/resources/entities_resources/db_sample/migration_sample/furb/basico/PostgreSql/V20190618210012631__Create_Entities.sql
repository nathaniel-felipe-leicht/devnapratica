/* Database: PostgreSql. Generation date: 2019-06-18 21:00:12:631 */
/* Entity Cliente */
create table cliente (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BOOLEAN /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Produto */
create table produto (
	id UUID NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	valor_unitario NUMERIC(19,4) NOT NULL /* valorUnitario */
);



/* Entity ItemPedido */
create table item_pedido (
	id UUID NOT NULL,
	item UUID NOT NULL,
	quantidade NUMERIC(19,4) NOT NULL,
	valor_total NUMERIC(19,4) NOT NULL /* valorTotal */
);



/* Entity Pedido */
create table pedido (
	id UUID NOT NULL,
	data DATE NOT NULL,
	observacoes VARCHAR(255),
	cliente UUID NOT NULL
);



/* Entity MovimentoEstoque */
create table movimento_estoque (
	id UUID NOT NULL,
	produto UUID NOT NULL,
	quantidade NUMERIC(19,4) NOT NULL
);



/* Join Tables */

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table produto add constraint pk_produto_id primary key(id);
alter table item_pedido add constraint pk_item_pedido_id primary key(id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table movimento_estoque add constraint pk_movimento_estoque_id primary key(id);

/* Foreign Key Constraints */
alter table item_pedido add constraint fkabymkwcpecod1jdfxniyel28hukz foreign key (item) references produto (id);
alter table pedido add constraint fk64p3nnvklpedhh8milaoxxu1wwc6 foreign key (cliente) references cliente (id);
alter table movimento_estoque add constraint fkcsrfopsd5iu08hij3ymdvfdily1t foreign key (produto) references produto (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
