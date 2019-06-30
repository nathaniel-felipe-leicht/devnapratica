/* Database: Oracle. Generation date: 2019-06-30 04:58:01:307 */
/* Entity Cliente */
create table cliente (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado NUMBER(1) /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	qt_pedidos NUMBER(19) /* qtPedidos */
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
alter table item_pedido add constraint fkvoohnif1vxk5kjjlbyrno8j6co1y foreign key (produto) references produto (id);
alter table pedido add constraint fkazwdq2e5izhgk14xowcqicm5qzgu foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkaqjvf0dvi4xgisvdxvqtkkjw0ud2 foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkx71xmduv9imrce7fjhhxgiskwyaq foreign key (itens_id) references item_pedido (id);
alter table movimento_estoque add constraint fkskkpnoikecvuchfndg2guhyawxbq foreign key (produto) references produto (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
