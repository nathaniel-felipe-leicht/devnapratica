/* Database: Oracle. Generation date: 2019-06-29 04:49:25:514 */
/* Entity Cliente */
create table cliente (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado NUMBER(1) /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	qt_pedidos NUMBER(19) NOT NULL /* qtPedidos */
);



/* Entity Produto */
create table produto (
	id RAW(16) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	valor_unitario NUMBER(19,4) NOT NULL /* valorUnitario */
);



/* Entity ItemPedido */
create table item_pedido (
	id RAW(16) NOT NULL,
	produto RAW(16) NOT NULL,
	quantidade NUMBER(19,4) NOT NULL,
	valor_total NUMBER(19,4) NOT NULL /* valorTotal */
);



/* Entity Pedido */
create table pedido (
	id RAW(16) NOT NULL,
	data DATE NOT NULL,
	observacoes VARCHAR(255),
	cliente RAW(16) NOT NULL
);



/* Entity MovimentoEstoque */
create table movimento_estoque (
	id RAW(16) NOT NULL,
	produto RAW(16) NOT NULL,
	quantidade NUMBER(19,4) NOT NULL
);



/* Join Tables */
/* master: Pedido as pedido, detail: ItemPedido as item_pedido */
create table pedido_itens (
	pedido_id RAW(16) NOT NULL,
	itens_id RAW(16) NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table produto add constraint pk_produto_id primary key(id);
alter table item_pedido add constraint pk_item_pedido_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table movimento_estoque add constraint pk_movimento_estoque_id primary key(id);

/* Foreign Key Constraints */
alter table item_pedido add constraint fkjuwpx18us9hwhoqsfzf1ddsayjwb foreign key (produto) references produto (id);
alter table pedido add constraint fk9qajjytg0d3l8qkxmer9f0zyv04v foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkikw7wng80lbv3xs9mm97fsyyqhsn foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fk8li7gzs4foegiqqiupil1mf0yzu2 foreign key (itens_id) references item_pedido (id);
alter table movimento_estoque add constraint fkujas3tkwybcqtgtmsut8xylhcc8q foreign key (produto) references produto (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
