/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.concurrent.CompletableFuture;

import br.com.senior.furb.basico.GetSaldoInput;
import br.com.senior.furb.basico.GetSaldoOutput;
import br.com.senior.furb.basico.GetGastoTotalClienteInput;
import br.com.senior.furb.basico.GetGastoTotalClienteOutput;
import br.com.senior.furb.basico.RefreshStatusCreditoInput;
import br.com.senior.furb.basico.RefreshStatusCreditoOutput;
import br.com.senior.furb.basico.RefreshQtdPedidosClienteInput;
import br.com.senior.furb.basico.RefreshQtdPedidosClienteOutput;
import br.com.senior.furb.basico.GetMetadataInput;
import br.com.senior.furb.basico.GetMetadataOutput;
import br.com.senior.furb.basico.ImportClienteInput;
import br.com.senior.furb.basico.ImportClienteOutput;
import br.com.senior.furb.basico.ExportClienteInput;
import br.com.senior.furb.basico.ExportClienteOutput;
import br.com.senior.furb.basico.ImportProdutoInput;
import br.com.senior.furb.basico.ImportProdutoOutput;
import br.com.senior.furb.basico.ExportProdutoInput;
import br.com.senior.furb.basico.ExportProdutoOutput;
import br.com.senior.furb.basico.ImportItemPedidoInput;
import br.com.senior.furb.basico.ImportItemPedidoOutput;
import br.com.senior.furb.basico.ExportItemPedidoInput;
import br.com.senior.furb.basico.ExportItemPedidoOutput;
import br.com.senior.furb.basico.ImportPedidoInput;
import br.com.senior.furb.basico.ImportPedidoOutput;
import br.com.senior.furb.basico.ExportPedidoInput;
import br.com.senior.furb.basico.ExportPedidoOutput;
import br.com.senior.furb.basico.ImportMovimentoEstoqueInput;
import br.com.senior.furb.basico.ImportMovimentoEstoqueOutput;
import br.com.senior.furb.basico.ExportMovimentoEstoqueInput;
import br.com.senior.furb.basico.ExportMovimentoEstoqueOutput;
import br.com.senior.furb.basico.GetDependenciesOutput;
import br.com.senior.furb.basico.Cliente;
import br.com.senior.furb.basico.CreateBulkClienteInput;
import br.com.senior.furb.basico.CreateBulkClienteOutput;
import br.com.senior.furb.basico.Produto;
import br.com.senior.furb.basico.CreateBulkProdutoInput;
import br.com.senior.furb.basico.CreateBulkProdutoOutput;
import br.com.senior.furb.basico.ItemPedido;
import br.com.senior.furb.basico.CreateBulkItemPedidoInput;
import br.com.senior.furb.basico.CreateBulkItemPedidoOutput;
import br.com.senior.furb.basico.Pedido;
import br.com.senior.furb.basico.CreateBulkPedidoInput;
import br.com.senior.furb.basico.CreateBulkPedidoOutput;
import br.com.senior.furb.basico.MovimentoEstoque;
import br.com.senior.furb.basico.CreateBulkMovimentoEstoqueInput;
import br.com.senior.furb.basico.CreateBulkMovimentoEstoqueOutput;
import br.com.senior.furb.basico.ServiceStartedPayload;
import br.com.senior.furb.basico.NotifyUserEventPayload;
import br.com.senior.furb.basico.ImportClienteEventPayload;
import br.com.senior.furb.basico.ExportClienteEventPayload;
import br.com.senior.furb.basico.ImportProdutoEventPayload;
import br.com.senior.furb.basico.ExportProdutoEventPayload;
import br.com.senior.furb.basico.ImportItemPedidoEventPayload;
import br.com.senior.furb.basico.ExportItemPedidoEventPayload;
import br.com.senior.furb.basico.ImportPedidoEventPayload;
import br.com.senior.furb.basico.ExportPedidoEventPayload;
import br.com.senior.furb.basico.ImportMovimentoEstoqueEventPayload;
import br.com.senior.furb.basico.ExportMovimentoEstoqueEventPayload;

/**
* 
*/
public interface BasicoStub {

	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de saldo do produto
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetSaldoOutput getSaldo(GetSaldoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de saldo do produto
	 * Chamada assíncrona
	 */
	void getSaldo(GetSaldoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de saldo do produto
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetSaldoOutput> getSaldoRequest(GetSaldoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém o valor total gasto pelo cliente em pedidos
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetGastoTotalClienteOutput getGastoTotalCliente(GetGastoTotalClienteInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém o valor total gasto pelo cliente em pedidos
	 * Chamada assíncrona
	 */
	void getGastoTotalCliente(GetGastoTotalClienteInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém o valor total gasto pelo cliente em pedidos
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetGastoTotalClienteOutput> getGastoTotalClienteRequest(GetGastoTotalClienteInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Verifica se o cliente já efetuou um pedido e habilita o crédito
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	RefreshStatusCreditoOutput refreshStatusCredito(RefreshStatusCreditoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Verifica se o cliente já efetuou um pedido e habilita o crédito
	 * Chamada assíncrona
	 */
	void refreshStatusCredito(RefreshStatusCreditoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Verifica se o cliente já efetuou um pedido e habilita o crédito
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<RefreshStatusCreditoOutput> refreshStatusCreditoRequest(RefreshStatusCreditoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Atualiza a quantidade de pedidos realizado pelo cliente
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	RefreshQtdPedidosClienteOutput refreshQtdPedidosCliente(RefreshQtdPedidosClienteInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Atualiza a quantidade de pedidos realizado pelo cliente
	 * Chamada assíncrona
	 */
	void refreshQtdPedidosCliente(RefreshQtdPedidosClienteInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Atualiza a quantidade de pedidos realizado pelo cliente
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<RefreshQtdPedidosClienteOutput> refreshQtdPedidosClienteRequest(RefreshQtdPedidosClienteInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona
	 */
	void getMetadata(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportClienteOutput importCliente(ImportClienteInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importCliente(ImportClienteInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportClienteOutput> importClienteRequest(ImportClienteInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportClienteOutput exportCliente(ExportClienteInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportCliente(ExportClienteInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportClienteOutput> exportClienteRequest(ExportClienteInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportProdutoOutput importProduto(ImportProdutoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importProduto(ImportProdutoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportProdutoOutput> importProdutoRequest(ImportProdutoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportProdutoOutput exportProduto(ExportProdutoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportProduto(ExportProdutoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportProdutoOutput> exportProdutoRequest(ExportProdutoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportItemPedidoOutput importItemPedido(ImportItemPedidoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importItemPedido(ImportItemPedidoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportItemPedidoOutput> importItemPedidoRequest(ImportItemPedidoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportItemPedidoOutput exportItemPedido(ExportItemPedidoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportItemPedido(ExportItemPedidoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportItemPedidoOutput> exportItemPedidoRequest(ExportItemPedidoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportPedidoOutput importPedido(ImportPedidoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importPedido(ImportPedidoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportPedidoOutput> importPedidoRequest(ImportPedidoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportPedidoOutput exportPedido(ExportPedidoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportPedido(ExportPedidoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportPedidoOutput> exportPedidoRequest(ExportPedidoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportMovimentoEstoqueOutput importMovimentoEstoque(ImportMovimentoEstoqueInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importMovimentoEstoque(ImportMovimentoEstoqueInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportMovimentoEstoqueOutput> importMovimentoEstoqueRequest(ImportMovimentoEstoqueInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportMovimentoEstoqueOutput exportMovimentoEstoque(ExportMovimentoEstoqueInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportMovimentoEstoque(ExportMovimentoEstoqueInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportMovimentoEstoqueOutput> exportMovimentoEstoqueRequest(ExportMovimentoEstoqueInput input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente.PagedResults listCliente(Cliente.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void listCliente(Cliente.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente.PagedResults> listClienteRequest(Cliente.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Produto entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Produto.PagedResults listProduto(Produto.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Produto entity.
	 * Chamada assíncrona
	 */
	void listProduto(Produto.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Produto entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Produto.PagedResults> listProdutoRequest(Produto.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the ItemPedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ItemPedido.PagedResults listItemPedido(ItemPedido.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the ItemPedido entity.
	 * Chamada assíncrona
	 */
	void listItemPedido(ItemPedido.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the ItemPedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ItemPedido.PagedResults> listItemPedidoRequest(ItemPedido.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido.PagedResults listPedido(Pedido.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void listPedido(Pedido.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido.PagedResults> listPedidoRequest(Pedido.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the MovimentoEstoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	MovimentoEstoque.PagedResults listMovimentoEstoque(MovimentoEstoque.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona
	 */
	void listMovimentoEstoque(MovimentoEstoque.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<MovimentoEstoque.PagedResults> listMovimentoEstoqueRequest(MovimentoEstoque.PageRequest input);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona
	 */
	void getDependencies();
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente createCliente(Cliente input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void createCliente(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> createClienteRequest(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void createBulkCliente(CreateBulkClienteInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkClienteOutput> createBulkClienteRequest(CreateBulkClienteInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente createMergeCliente(Cliente input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void createMergeCliente(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> createMergeClienteRequest(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente retrieveCliente(Cliente.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void retrieveCliente(Cliente.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> retrieveClienteRequest(Cliente.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente updateCliente(Cliente input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void updateCliente(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> updateClienteRequest(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Cliente updateMergeCliente(Cliente input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void updateMergeCliente(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Cliente> updateMergeClienteRequest(Cliente input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Cliente entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteCliente(Cliente.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Cliente entity.
	 * Chamada assíncrona
	 */
	void deleteCliente(Cliente.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Produto entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Produto createProduto(Produto input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Produto entity.
	 * Chamada assíncrona
	 */
	void createProduto(Produto input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Produto entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Produto> createProdutoRequest(Produto input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Produto entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkProdutoOutput createBulkProduto(CreateBulkProdutoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Produto entity.
	 * Chamada assíncrona
	 */
	void createBulkProduto(CreateBulkProdutoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Produto entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkProdutoOutput> createBulkProdutoRequest(CreateBulkProdutoInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Produto entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Produto createMergeProduto(Produto input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Produto entity.
	 * Chamada assíncrona
	 */
	void createMergeProduto(Produto input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Produto entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Produto> createMergeProdutoRequest(Produto input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Produto entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Produto retrieveProduto(Produto.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Produto entity.
	 * Chamada assíncrona
	 */
	void retrieveProduto(Produto.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Produto entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Produto> retrieveProdutoRequest(Produto.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Produto entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Produto updateProduto(Produto input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Produto entity.
	 * Chamada assíncrona
	 */
	void updateProduto(Produto input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Produto entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Produto> updateProdutoRequest(Produto input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Produto entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Produto updateMergeProduto(Produto input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Produto entity.
	 * Chamada assíncrona
	 */
	void updateMergeProduto(Produto input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Produto entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Produto> updateMergeProdutoRequest(Produto input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Produto entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteProduto(Produto.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Produto entity.
	 * Chamada assíncrona
	 */
	void deleteProduto(Produto.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the ItemPedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ItemPedido createItemPedido(ItemPedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the ItemPedido entity.
	 * Chamada assíncrona
	 */
	void createItemPedido(ItemPedido input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the ItemPedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ItemPedido> createItemPedidoRequest(ItemPedido input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the ItemPedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkItemPedidoOutput createBulkItemPedido(CreateBulkItemPedidoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the ItemPedido entity.
	 * Chamada assíncrona
	 */
	void createBulkItemPedido(CreateBulkItemPedidoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the ItemPedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkItemPedidoOutput> createBulkItemPedidoRequest(CreateBulkItemPedidoInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the ItemPedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ItemPedido createMergeItemPedido(ItemPedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the ItemPedido entity.
	 * Chamada assíncrona
	 */
	void createMergeItemPedido(ItemPedido input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the ItemPedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ItemPedido> createMergeItemPedidoRequest(ItemPedido input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the ItemPedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ItemPedido retrieveItemPedido(ItemPedido.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the ItemPedido entity.
	 * Chamada assíncrona
	 */
	void retrieveItemPedido(ItemPedido.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the ItemPedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ItemPedido> retrieveItemPedidoRequest(ItemPedido.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the ItemPedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ItemPedido updateItemPedido(ItemPedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the ItemPedido entity.
	 * Chamada assíncrona
	 */
	void updateItemPedido(ItemPedido input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the ItemPedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ItemPedido> updateItemPedidoRequest(ItemPedido input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the ItemPedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ItemPedido updateMergeItemPedido(ItemPedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the ItemPedido entity.
	 * Chamada assíncrona
	 */
	void updateMergeItemPedido(ItemPedido input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the ItemPedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ItemPedido> updateMergeItemPedidoRequest(ItemPedido input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the ItemPedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteItemPedido(ItemPedido.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the ItemPedido entity.
	 * Chamada assíncrona
	 */
	void deleteItemPedido(ItemPedido.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido createPedido(Pedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void createPedido(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> createPedidoRequest(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkPedidoOutput createBulkPedido(CreateBulkPedidoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void createBulkPedido(CreateBulkPedidoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkPedidoOutput> createBulkPedidoRequest(CreateBulkPedidoInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido createMergePedido(Pedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void createMergePedido(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> createMergePedidoRequest(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido retrievePedido(Pedido.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void retrievePedido(Pedido.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> retrievePedidoRequest(Pedido.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido updatePedido(Pedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void updatePedido(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> updatePedidoRequest(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Pedido updateMergePedido(Pedido input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void updateMergePedido(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Pedido> updateMergePedidoRequest(Pedido input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Pedido entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deletePedido(Pedido.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Pedido entity.
	 * Chamada assíncrona
	 */
	void deletePedido(Pedido.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the MovimentoEstoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	MovimentoEstoque createMovimentoEstoque(MovimentoEstoque input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona
	 */
	void createMovimentoEstoque(MovimentoEstoque input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<MovimentoEstoque> createMovimentoEstoqueRequest(MovimentoEstoque input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the MovimentoEstoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkMovimentoEstoqueOutput createBulkMovimentoEstoque(CreateBulkMovimentoEstoqueInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona
	 */
	void createBulkMovimentoEstoque(CreateBulkMovimentoEstoqueInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkMovimentoEstoqueOutput> createBulkMovimentoEstoqueRequest(CreateBulkMovimentoEstoqueInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the MovimentoEstoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	MovimentoEstoque createMergeMovimentoEstoque(MovimentoEstoque input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona
	 */
	void createMergeMovimentoEstoque(MovimentoEstoque input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<MovimentoEstoque> createMergeMovimentoEstoqueRequest(MovimentoEstoque input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the MovimentoEstoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	MovimentoEstoque retrieveMovimentoEstoque(MovimentoEstoque.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona
	 */
	void retrieveMovimentoEstoque(MovimentoEstoque.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<MovimentoEstoque> retrieveMovimentoEstoqueRequest(MovimentoEstoque.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the MovimentoEstoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	MovimentoEstoque updateMovimentoEstoque(MovimentoEstoque input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona
	 */
	void updateMovimentoEstoque(MovimentoEstoque input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<MovimentoEstoque> updateMovimentoEstoqueRequest(MovimentoEstoque input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the MovimentoEstoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	MovimentoEstoque updateMergeMovimentoEstoque(MovimentoEstoque input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona
	 */
	void updateMergeMovimentoEstoque(MovimentoEstoque input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<MovimentoEstoque> updateMergeMovimentoEstoqueRequest(MovimentoEstoque input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the MovimentoEstoque entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteMovimentoEstoque(MovimentoEstoque.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the MovimentoEstoque entity.
	 * Chamada assíncrona
	 */
	void deleteMovimentoEstoque(MovimentoEstoque.Id input);
	


	/**
	* Chamada assíncrona para o método publishServiceStarted 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportClienteEvent 
	* This is a public operation
	*/
	void publishImportClienteEvent( ImportClienteEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportClienteEvent 
	* This is a public operation
	*/
	void publishExportClienteEvent( ExportClienteEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportProdutoEvent 
	* This is a public operation
	*/
	void publishImportProdutoEvent( ImportProdutoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportProdutoEvent 
	* This is a public operation
	*/
	void publishExportProdutoEvent( ExportProdutoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportItemPedidoEvent 
	* This is a public operation
	*/
	void publishImportItemPedidoEvent( ImportItemPedidoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportItemPedidoEvent 
	* This is a public operation
	*/
	void publishExportItemPedidoEvent( ExportItemPedidoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportPedidoEvent 
	* This is a public operation
	*/
	void publishImportPedidoEvent( ImportPedidoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportPedidoEvent 
	* This is a public operation
	*/
	void publishExportPedidoEvent( ExportPedidoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportMovimentoEstoqueEvent 
	* This is a public operation
	*/
	void publishImportMovimentoEstoqueEvent( ImportMovimentoEstoqueEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportMovimentoEstoqueEvent 
	* This is a public operation
	*/
	void publishExportMovimentoEstoqueEvent( ExportMovimentoEstoqueEventPayload input );
			
	

}
