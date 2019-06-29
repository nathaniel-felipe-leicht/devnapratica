/* Database: Oracle. Generation date: 2019-06-18 21:00:12:638 */
/* Entity Cliente */
create table cliente (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado NUMBER(1) /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
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
	item RAW(16) NOT NULL,
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

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table produto add constraint pk_produto_id primary key(id);
alter table item_pedido add constraint pk_item_pedido_id primary key(id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table movimento_estoque add constraint pk_movimento_estoque_id primary key(id);

/* Foreign Key Constraints */
alter table item_pedido add constraint fklllmjacuf1sp48jqxr6yoh8b038n foreign key (item) references produto (id);
alter table pedido add constraint fkbcugjoka7tgcvqjnznz9euhlkkq4 foreign key (cliente) references cliente (id);
alter table movimento_estoque add constraint fkcuom9oyfkza5pmtwnryxcukbts3m foreign key (produto) references produto (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
