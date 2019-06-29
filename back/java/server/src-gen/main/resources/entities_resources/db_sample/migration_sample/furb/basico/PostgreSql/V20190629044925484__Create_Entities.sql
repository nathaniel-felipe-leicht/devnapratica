/* Database: PostgreSql. Generation date: 2019-06-29 04:49:25:484 */
/* Entity Cliente */
create table cliente (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BOOLEAN /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	qt_pedidos NUMERIC(19) NOT NULL /* qtPedidos */
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
	produto UUID NOT NULL,
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
/* master: Pedido as pedido, detail: ItemPedido as item_pedido */
create table pedido_itens (
	pedido_id UUID NOT NULL,
	itens_id UUID NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table produto add constraint pk_produto_id primary key(id);
alter table item_pedido add constraint pk_item_pedido_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table movimento_estoque add constraint pk_movimento_estoque_id primary key(id);

/* Foreign Key Constraints */
alter table item_pedido add constraint fklvrjmtao8whsjobe8lczruxx83eb foreign key (produto) references produto (id);
alter table pedido add constraint fkohfb1ct6y0nlm2aztn7voz5kmsbm foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkkxlwcedbs7th8kfokdgbojarmqx0 foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkfxeddnwecf0z0zwnwasd9pyfcdxv foreign key (itens_id) references item_pedido (id);
alter table movimento_estoque add constraint fkksm1tjrtwpww1kvey3msljnenvel foreign key (produto) references produto (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
