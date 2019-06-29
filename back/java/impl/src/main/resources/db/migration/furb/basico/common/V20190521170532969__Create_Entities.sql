/* Database: PostgreSql. Generation date: 2019-05-21 17:05:32:969 */
/* Entity Cliente */
create table cliente (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BOOLEAN /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	qtPedidos INTEGER,
	ext JSONB
);


/* Creating index for customization column */
create index cliente_ext on cliente using gin (ext);

/* Entity Item */
create table produto (
	id UUID NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	valor_unitario NUMERIC(19,4) NOT NULL /* valorUnitario */,
	ext JSONB
);


/* Creating index for customization column */
create index produto_ext on produto using gin (ext);

/* Entity ItemPedido */
create table item_pedido (
	id UUID NOT NULL,
	quantidade NUMERIC(19,4) NOT NULL /* valorUnitario */,
	valor_total NUMERIC(19,4) NOT NULL /* valor_total */,
	produto UUID NOT NULL,
	ext JSONB
);


/* Creating index for customization column */
create index item_pedido_ext on item_pedido using gin (ext);

/* Entity Pedido */
create table pedido (
	id UUID NOT NULL,
	data DATE NOT NULL,
	observacoes VARCHAR(255),
	cliente UUID NOT NULL,
	ext JSONB
);

/* Creating index for customization column */
create index pedido_ext on pedido using gin (ext);

/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id UUID NOT NULL,
	itens_id UUID NOT NULL
);

/* Entity movimentoestoque */
create table movimento_estoque (
	id UUID NOT NULL,
	produto UUID NOT NULL,
	quantidade NUMERIC(19,4) NOT NULL /* valorUnitario */,
	ext JSONB
);

/* Creating index for customization column */
create index movimento_estoque_ext on movimento_estoque using gin (ext);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table produto add constraint pk_iproduto_id primary key(id);
alter table item_pedido add constraint pk_ipedido_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table movimento_estoque add constraint pk_movimento_estoque_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fkpu6md6noxs312mrofc67lihqojguomh foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkzhczc82gjgjgo321dgvyblcqufcqe6y foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkeq7flbcrelniprfu12fkycpzutydvj foreign key (itens_id) references item_pedido (id);
alter table item_pedido add constraint fkzhczc82gjgjgodgvyblc411cqe61 foreign key (produto) references produto (id);
alter table movimento_estoque add constraint fkz2gjgjgodg13214vyblc411cqe4441421241 foreign key (produto) references produto (id);
/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
