/* Database: SqlServer. Generation date: 2019-06-29 04:49:25:497 */
/* Entity Cliente */
create table cliente (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BIT /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	qt_pedidos NUMERIC(19) NOT NULL /* qtPedidos */
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
	produto UNIQUEIDENTIFIER NOT NULL,
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
/* master: Pedido as pedido, detail: ItemPedido as item_pedido */
create table pedido_itens (
	pedido_id UNIQUEIDENTIFIER NOT NULL,
	itens_id UNIQUEIDENTIFIER NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table produto add constraint pk_produto_id primary key(id);
alter table item_pedido add constraint pk_item_pedido_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table movimento_estoque add constraint pk_movimento_estoque_id primary key(id);

/* Foreign Key Constraints */
alter table item_pedido add constraint fkd8eni7ful4scbavtbqarqdnb6ow5 foreign key (produto) references produto (id);
alter table pedido add constraint fkl0oc3xnkjpuxghsg2tqxs2wjybiv foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fknuvnxpu8uhm3ypujd1imfh2ta6c8 foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkrwuwskeu8mi4v8daycidbxv7jjlm foreign key (itens_id) references item_pedido (id);
alter table movimento_estoque add constraint fkhzl2bomixjcrz79y1wxjiiodqqhs foreign key (produto) references produto (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
