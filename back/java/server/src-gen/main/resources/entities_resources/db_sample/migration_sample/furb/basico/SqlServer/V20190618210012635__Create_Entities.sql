/* Database: SqlServer. Generation date: 2019-06-18 21:00:12:635 */
/* Entity Cliente */
create table cliente (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BIT /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Produto */
create table produto (
	id UNIQUEIDENTIFIER NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	valor_unitario FLOAT(32) NOT NULL /* valorUnitario */
);



/* Entity ItemPedido */
create table item_pedido (
	id UNIQUEIDENTIFIER NOT NULL,
	item UNIQUEIDENTIFIER NOT NULL,
	quantidade FLOAT(32) NOT NULL,
	valor_total FLOAT(32) NOT NULL /* valorTotal */
);



/* Entity Pedido */
create table pedido (
	id UNIQUEIDENTIFIER NOT NULL,
	data DATE NOT NULL,
	observacoes VARCHAR(255),
	cliente UNIQUEIDENTIFIER NOT NULL
);



/* Entity MovimentoEstoque */
create table movimento_estoque (
	id UNIQUEIDENTIFIER NOT NULL,
	produto UNIQUEIDENTIFIER NOT NULL,
	quantidade FLOAT(32) NOT NULL
);



/* Join Tables */

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table produto add constraint pk_produto_id primary key(id);
alter table item_pedido add constraint pk_item_pedido_id primary key(id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table movimento_estoque add constraint pk_movimento_estoque_id primary key(id);

/* Foreign Key Constraints */
alter table item_pedido add constraint fkwy2qllntwimgxihlckszwvzfxsmc foreign key (item) references produto (id);
alter table pedido add constraint fkzkl88u08gqk1moh3gecq3jk2gisf foreign key (cliente) references cliente (id);
alter table movimento_estoque add constraint fki6kki176vaot4b1gascksr8ge6cn foreign key (produto) references produto (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
