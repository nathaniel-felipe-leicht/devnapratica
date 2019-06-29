/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

public interface BasicoConstants {
    String DOMAIN = "furb";
    String SERVICE = "basico";
    
    interface Commands {
    	/**
    	 * Obtém a quantidade de saldo do produto
    	 * @see GetSaldoInput the request payload
    	 */
    	String GET_SALDO = "getSaldo";
    	/**
    	 * The success response primitive for getSaldo.
    	 *
    	 * @see #GET_SALDO the request primitive
    	 * @see GetSaldoOutput the response payload
    	 */
    	String GET_SALDO_RESPONSE = "getSaldoResponse";
    	/**
    	 * An error response primitive for getSaldo.
    	 *
    	 * @see #GET_SALDO the request primitive
    	 */
    	String GET_SALDO_ERROR = "getSaldoError";
    	/**
    	 * Obtém o valor total gasto pelo cliente em pedidos
    	 * @see GetGastoTotalClienteInput the request payload
    	 */
    	String GET_GASTO_TOTAL_CLIENTE = "getGastoTotalCliente";
    	/**
    	 * The success response primitive for getGastoTotalCliente.
    	 *
    	 * @see #GET_GASTO_TOTAL_CLIENTE the request primitive
    	 * @see GetGastoTotalClienteOutput the response payload
    	 */
    	String GET_GASTO_TOTAL_CLIENTE_RESPONSE = "getGastoTotalClienteResponse";
    	/**
    	 * An error response primitive for getGastoTotalCliente.
    	 *
    	 * @see #GET_GASTO_TOTAL_CLIENTE the request primitive
    	 */
    	String GET_GASTO_TOTAL_CLIENTE_ERROR = "getGastoTotalClienteError";
    	/**
    	 * Verifica se o cliente já efetuou um pedido e habilita o crédito
    	 * @see RefreshStatusCreditoInput the request payload
    	 */
    	String REFRESH_STATUS_CREDITO = "refreshStatusCredito";
    	/**
    	 * The success response primitive for refreshStatusCredito.
    	 *
    	 * @see #REFRESH_STATUS_CREDITO the request primitive
    	 * @see RefreshStatusCreditoOutput the response payload
    	 */
    	String REFRESH_STATUS_CREDITO_RESPONSE = "refreshStatusCreditoResponse";
    	/**
    	 * An error response primitive for refreshStatusCredito.
    	 *
    	 * @see #REFRESH_STATUS_CREDITO the request primitive
    	 */
    	String REFRESH_STATUS_CREDITO_ERROR = "refreshStatusCreditoError";
    	/**
    	 * Atualiza a quantidade de pedidos realizado pelo cliente
    	 * @see RefreshQtdPedidosClienteInput the request payload
    	 */
    	String REFRESH_QTD_PEDIDOS_CLIENTE = "refreshQtdPedidosCliente";
    	/**
    	 * The success response primitive for refreshQtdPedidosCliente.
    	 *
    	 * @see #REFRESH_QTD_PEDIDOS_CLIENTE the request primitive
    	 * @see RefreshQtdPedidosClienteOutput the response payload
    	 */
    	String REFRESH_QTD_PEDIDOS_CLIENTE_RESPONSE = "refreshQtdPedidosClienteResponse";
    	/**
    	 * An error response primitive for refreshQtdPedidosCliente.
    	 *
    	 * @see #REFRESH_QTD_PEDIDOS_CLIENTE the request primitive
    	 */
    	String REFRESH_QTD_PEDIDOS_CLIENTE_ERROR = "refreshQtdPedidosClienteError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	/**
    	 * @see ImportClienteInput the request payload
    	 */
    	String IMPORT_CLIENTE = "importCliente";
    	/**
    	 * The success response primitive for importCliente.
    	 *
    	 * @see #IMPORT_CLIENTE the request primitive
    	 * @see ImportClienteOutput the response payload
    	 */
    	String IMPORT_CLIENTE_RESPONSE = "importClienteResponse";
    	/**
    	 * An error response primitive for importCliente.
    	 *
    	 * @see #IMPORT_CLIENTE the request primitive
    	 */
    	String IMPORT_CLIENTE_ERROR = "importClienteError";
    	/**
    	 * @see ExportClienteInput the request payload
    	 */
    	String EXPORT_CLIENTE = "exportCliente";
    	/**
    	 * The success response primitive for exportCliente.
    	 *
    	 * @see #EXPORT_CLIENTE the request primitive
    	 * @see ExportClienteOutput the response payload
    	 */
    	String EXPORT_CLIENTE_RESPONSE = "exportClienteResponse";
    	/**
    	 * An error response primitive for exportCliente.
    	 *
    	 * @see #EXPORT_CLIENTE the request primitive
    	 */
    	String EXPORT_CLIENTE_ERROR = "exportClienteError";
    	/**
    	 * @see ImportProdutoInput the request payload
    	 */
    	String IMPORT_PRODUTO = "importProduto";
    	/**
    	 * The success response primitive for importProduto.
    	 *
    	 * @see #IMPORT_PRODUTO the request primitive
    	 * @see ImportProdutoOutput the response payload
    	 */
    	String IMPORT_PRODUTO_RESPONSE = "importProdutoResponse";
    	/**
    	 * An error response primitive for importProduto.
    	 *
    	 * @see #IMPORT_PRODUTO the request primitive
    	 */
    	String IMPORT_PRODUTO_ERROR = "importProdutoError";
    	/**
    	 * @see ExportProdutoInput the request payload
    	 */
    	String EXPORT_PRODUTO = "exportProduto";
    	/**
    	 * The success response primitive for exportProduto.
    	 *
    	 * @see #EXPORT_PRODUTO the request primitive
    	 * @see ExportProdutoOutput the response payload
    	 */
    	String EXPORT_PRODUTO_RESPONSE = "exportProdutoResponse";
    	/**
    	 * An error response primitive for exportProduto.
    	 *
    	 * @see #EXPORT_PRODUTO the request primitive
    	 */
    	String EXPORT_PRODUTO_ERROR = "exportProdutoError";
    	/**
    	 * @see ImportItemPedidoInput the request payload
    	 */
    	String IMPORT_ITEM_PEDIDO = "importItemPedido";
    	/**
    	 * The success response primitive for importItemPedido.
    	 *
    	 * @see #IMPORT_ITEM_PEDIDO the request primitive
    	 * @see ImportItemPedidoOutput the response payload
    	 */
    	String IMPORT_ITEM_PEDIDO_RESPONSE = "importItemPedidoResponse";
    	/**
    	 * An error response primitive for importItemPedido.
    	 *
    	 * @see #IMPORT_ITEM_PEDIDO the request primitive
    	 */
    	String IMPORT_ITEM_PEDIDO_ERROR = "importItemPedidoError";
    	/**
    	 * @see ExportItemPedidoInput the request payload
    	 */
    	String EXPORT_ITEM_PEDIDO = "exportItemPedido";
    	/**
    	 * The success response primitive for exportItemPedido.
    	 *
    	 * @see #EXPORT_ITEM_PEDIDO the request primitive
    	 * @see ExportItemPedidoOutput the response payload
    	 */
    	String EXPORT_ITEM_PEDIDO_RESPONSE = "exportItemPedidoResponse";
    	/**
    	 * An error response primitive for exportItemPedido.
    	 *
    	 * @see #EXPORT_ITEM_PEDIDO the request primitive
    	 */
    	String EXPORT_ITEM_PEDIDO_ERROR = "exportItemPedidoError";
    	/**
    	 * @see ImportPedidoInput the request payload
    	 */
    	String IMPORT_PEDIDO = "importPedido";
    	/**
    	 * The success response primitive for importPedido.
    	 *
    	 * @see #IMPORT_PEDIDO the request primitive
    	 * @see ImportPedidoOutput the response payload
    	 */
    	String IMPORT_PEDIDO_RESPONSE = "importPedidoResponse";
    	/**
    	 * An error response primitive for importPedido.
    	 *
    	 * @see #IMPORT_PEDIDO the request primitive
    	 */
    	String IMPORT_PEDIDO_ERROR = "importPedidoError";
    	/**
    	 * @see ExportPedidoInput the request payload
    	 */
    	String EXPORT_PEDIDO = "exportPedido";
    	/**
    	 * The success response primitive for exportPedido.
    	 *
    	 * @see #EXPORT_PEDIDO the request primitive
    	 * @see ExportPedidoOutput the response payload
    	 */
    	String EXPORT_PEDIDO_RESPONSE = "exportPedidoResponse";
    	/**
    	 * An error response primitive for exportPedido.
    	 *
    	 * @see #EXPORT_PEDIDO the request primitive
    	 */
    	String EXPORT_PEDIDO_ERROR = "exportPedidoError";
    	/**
    	 * @see ImportMovimentoEstoqueInput the request payload
    	 */
    	String IMPORT_MOVIMENTO_ESTOQUE = "importMovimentoEstoque";
    	/**
    	 * The success response primitive for importMovimentoEstoque.
    	 *
    	 * @see #IMPORT_MOVIMENTO_ESTOQUE the request primitive
    	 * @see ImportMovimentoEstoqueOutput the response payload
    	 */
    	String IMPORT_MOVIMENTO_ESTOQUE_RESPONSE = "importMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for importMovimentoEstoque.
    	 *
    	 * @see #IMPORT_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String IMPORT_MOVIMENTO_ESTOQUE_ERROR = "importMovimentoEstoqueError";
    	/**
    	 * @see ExportMovimentoEstoqueInput the request payload
    	 */
    	String EXPORT_MOVIMENTO_ESTOQUE = "exportMovimentoEstoque";
    	/**
    	 * The success response primitive for exportMovimentoEstoque.
    	 *
    	 * @see #EXPORT_MOVIMENTO_ESTOQUE the request primitive
    	 * @see ExportMovimentoEstoqueOutput the response payload
    	 */
    	String EXPORT_MOVIMENTO_ESTOQUE_RESPONSE = "exportMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for exportMovimentoEstoque.
    	 *
    	 * @see #EXPORT_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String EXPORT_MOVIMENTO_ESTOQUE_ERROR = "exportMovimentoEstoqueError";
    	/**
    	 * The 'list' request primitive for the Cliente entity.
    	 * @see cliente.pageRequest the request payload
    	 */
    	String LIST_CLIENTE = "listCliente";
    	/**
    	 * The success response primitive for listCliente.
    	 *
    	 * @see #LIST_CLIENTE the request primitive
    	 * @see Cliente.PagedResults the response payload
    	 */
    	String LIST_CLIENTE_RESPONSE = "listClienteResponse";
    	/**
    	 * An error response primitive for listCliente.
    	 *
    	 * @see #LIST_CLIENTE the request primitive
    	 */
    	String LIST_CLIENTE_ERROR = "listClienteError";
    	/**
    	 * The 'list' request primitive for the Produto entity.
    	 * @see produto.pageRequest the request payload
    	 */
    	String LIST_PRODUTO = "listProduto";
    	/**
    	 * The success response primitive for listProduto.
    	 *
    	 * @see #LIST_PRODUTO the request primitive
    	 * @see Produto.PagedResults the response payload
    	 */
    	String LIST_PRODUTO_RESPONSE = "listProdutoResponse";
    	/**
    	 * An error response primitive for listProduto.
    	 *
    	 * @see #LIST_PRODUTO the request primitive
    	 */
    	String LIST_PRODUTO_ERROR = "listProdutoError";
    	/**
    	 * The 'list' request primitive for the ItemPedido entity.
    	 * @see itemPedido.pageRequest the request payload
    	 */
    	String LIST_ITEM_PEDIDO = "listItemPedido";
    	/**
    	 * The success response primitive for listItemPedido.
    	 *
    	 * @see #LIST_ITEM_PEDIDO the request primitive
    	 * @see ItemPedido.PagedResults the response payload
    	 */
    	String LIST_ITEM_PEDIDO_RESPONSE = "listItemPedidoResponse";
    	/**
    	 * An error response primitive for listItemPedido.
    	 *
    	 * @see #LIST_ITEM_PEDIDO the request primitive
    	 */
    	String LIST_ITEM_PEDIDO_ERROR = "listItemPedidoError";
    	/**
    	 * The 'list' request primitive for the Pedido entity.
    	 * @see pedido.pageRequest the request payload
    	 */
    	String LIST_PEDIDO = "listPedido";
    	/**
    	 * The success response primitive for listPedido.
    	 *
    	 * @see #LIST_PEDIDO the request primitive
    	 * @see Pedido.PagedResults the response payload
    	 */
    	String LIST_PEDIDO_RESPONSE = "listPedidoResponse";
    	/**
    	 * An error response primitive for listPedido.
    	 *
    	 * @see #LIST_PEDIDO the request primitive
    	 */
    	String LIST_PEDIDO_ERROR = "listPedidoError";
    	/**
    	 * The 'list' request primitive for the MovimentoEstoque entity.
    	 * @see movimentoEstoque.pageRequest the request payload
    	 */
    	String LIST_MOVIMENTO_ESTOQUE = "listMovimentoEstoque";
    	/**
    	 * The success response primitive for listMovimentoEstoque.
    	 *
    	 * @see #LIST_MOVIMENTO_ESTOQUE the request primitive
    	 * @see MovimentoEstoque.PagedResults the response payload
    	 */
    	String LIST_MOVIMENTO_ESTOQUE_RESPONSE = "listMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for listMovimentoEstoque.
    	 *
    	 * @see #LIST_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String LIST_MOVIMENTO_ESTOQUE_ERROR = "listMovimentoEstoqueError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    	/**
    	 * The 'create' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String CREATE_CLIENTE = "createCliente";
    	/**
    	 * The success response primitive for createCliente.
    	 *
    	 * @see #CREATE_CLIENTE the request primitive
    	 */
    	String CREATE_CLIENTE_RESPONSE = "createClienteResponse";
    	/**
    	 * An error response primitive for createCliente.
    	 *
    	 * @see #CREATE_CLIENTE the request primitive
    	 */
    	String CREATE_CLIENTE_ERROR = "createClienteError";
    	/**
    	 * The 'createBulk' request primitive for the Cliente entity.
    	 * @see CreateBulkClienteInput the request payload
    	 */
    	String CREATE_BULK_CLIENTE = "createBulkCliente";
    	/**
    	 * The success response primitive for createBulkCliente.
    	 *
    	 * @see #CREATE_BULK_CLIENTE the request primitive
    	 * @see CreateBulkClienteOutput the response payload
    	 */
    	String CREATE_BULK_CLIENTE_RESPONSE = "createBulkClienteResponse";
    	/**
    	 * An error response primitive for createBulkCliente.
    	 *
    	 * @see #CREATE_BULK_CLIENTE the request primitive
    	 */
    	String CREATE_BULK_CLIENTE_ERROR = "createBulkClienteError";
    	/**
    	 * The 'createMerge' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String CREATE_MERGE_CLIENTE = "createMergeCliente";
    	/**
    	 * The success response primitive for createMergeCliente.
    	 *
    	 * @see #CREATE_MERGE_CLIENTE the request primitive
    	 */
    	String CREATE_MERGE_CLIENTE_RESPONSE = "createMergeClienteResponse";
    	/**
    	 * An error response primitive for createMergeCliente.
    	 *
    	 * @see #CREATE_MERGE_CLIENTE the request primitive
    	 */
    	String CREATE_MERGE_CLIENTE_ERROR = "createMergeClienteError";
    	/**
    	 * The 'retrieve' request primitive for the Cliente entity.
    	 * @see Cliente.Id the request payload
    	 */
    	String RETRIEVE_CLIENTE = "retrieveCliente";
    	/**
    	 * The success response primitive for retrieveCliente.
    	 *
    	 * @see #RETRIEVE_CLIENTE the request primitive
    	 */
    	String RETRIEVE_CLIENTE_RESPONSE = "retrieveClienteResponse";
    	/**
    	 * An error response primitive for retrieveCliente.
    	 *
    	 * @see #RETRIEVE_CLIENTE the request primitive
    	 */
    	String RETRIEVE_CLIENTE_ERROR = "retrieveClienteError";
    	/**
    	 * The 'update' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String UPDATE_CLIENTE = "updateCliente";
    	/**
    	 * The success response primitive for updateCliente.
    	 *
    	 * @see #UPDATE_CLIENTE the request primitive
    	 */
    	String UPDATE_CLIENTE_RESPONSE = "updateClienteResponse";
    	/**
    	 * An error response primitive for updateCliente.
    	 *
    	 * @see #UPDATE_CLIENTE the request primitive
    	 */
    	String UPDATE_CLIENTE_ERROR = "updateClienteError";
    	/**
    	 * The 'updateMerge' request primitive for the Cliente entity.
    	 * @see Cliente the request payload
    	 */
    	String UPDATE_MERGE_CLIENTE = "updateMergeCliente";
    	/**
    	 * The success response primitive for updateMergeCliente.
    	 *
    	 * @see #UPDATE_MERGE_CLIENTE the request primitive
    	 */
    	String UPDATE_MERGE_CLIENTE_RESPONSE = "updateMergeClienteResponse";
    	/**
    	 * An error response primitive for updateMergeCliente.
    	 *
    	 * @see #UPDATE_MERGE_CLIENTE the request primitive
    	 */
    	String UPDATE_MERGE_CLIENTE_ERROR = "updateMergeClienteError";
    	/**
    	 * The 'delete' request primitive for the Cliente entity.
    	 * @see Cliente.Id the request payload
    	 */
    	String DELETE_CLIENTE = "deleteCliente";
    	/**
    	 * The success response primitive for deleteCliente.
    	 *
    	 * @see #DELETE_CLIENTE the request primitive
    	 */
    	String DELETE_CLIENTE_RESPONSE = "deleteClienteResponse";
    	/**
    	 * An error response primitive for deleteCliente.
    	 *
    	 * @see #DELETE_CLIENTE the request primitive
    	 */
    	String DELETE_CLIENTE_ERROR = "deleteClienteError";
    	/**
    	 * The 'create' request primitive for the Produto entity.
    	 * @see Produto the request payload
    	 */
    	String CREATE_PRODUTO = "createProduto";
    	/**
    	 * The success response primitive for createProduto.
    	 *
    	 * @see #CREATE_PRODUTO the request primitive
    	 */
    	String CREATE_PRODUTO_RESPONSE = "createProdutoResponse";
    	/**
    	 * An error response primitive for createProduto.
    	 *
    	 * @see #CREATE_PRODUTO the request primitive
    	 */
    	String CREATE_PRODUTO_ERROR = "createProdutoError";
    	/**
    	 * The 'createBulk' request primitive for the Produto entity.
    	 * @see CreateBulkProdutoInput the request payload
    	 */
    	String CREATE_BULK_PRODUTO = "createBulkProduto";
    	/**
    	 * The success response primitive for createBulkProduto.
    	 *
    	 * @see #CREATE_BULK_PRODUTO the request primitive
    	 * @see CreateBulkProdutoOutput the response payload
    	 */
    	String CREATE_BULK_PRODUTO_RESPONSE = "createBulkProdutoResponse";
    	/**
    	 * An error response primitive for createBulkProduto.
    	 *
    	 * @see #CREATE_BULK_PRODUTO the request primitive
    	 */
    	String CREATE_BULK_PRODUTO_ERROR = "createBulkProdutoError";
    	/**
    	 * The 'createMerge' request primitive for the Produto entity.
    	 * @see Produto the request payload
    	 */
    	String CREATE_MERGE_PRODUTO = "createMergeProduto";
    	/**
    	 * The success response primitive for createMergeProduto.
    	 *
    	 * @see #CREATE_MERGE_PRODUTO the request primitive
    	 */
    	String CREATE_MERGE_PRODUTO_RESPONSE = "createMergeProdutoResponse";
    	/**
    	 * An error response primitive for createMergeProduto.
    	 *
    	 * @see #CREATE_MERGE_PRODUTO the request primitive
    	 */
    	String CREATE_MERGE_PRODUTO_ERROR = "createMergeProdutoError";
    	/**
    	 * The 'retrieve' request primitive for the Produto entity.
    	 * @see Produto.Id the request payload
    	 */
    	String RETRIEVE_PRODUTO = "retrieveProduto";
    	/**
    	 * The success response primitive for retrieveProduto.
    	 *
    	 * @see #RETRIEVE_PRODUTO the request primitive
    	 */
    	String RETRIEVE_PRODUTO_RESPONSE = "retrieveProdutoResponse";
    	/**
    	 * An error response primitive for retrieveProduto.
    	 *
    	 * @see #RETRIEVE_PRODUTO the request primitive
    	 */
    	String RETRIEVE_PRODUTO_ERROR = "retrieveProdutoError";
    	/**
    	 * The 'update' request primitive for the Produto entity.
    	 * @see Produto the request payload
    	 */
    	String UPDATE_PRODUTO = "updateProduto";
    	/**
    	 * The success response primitive for updateProduto.
    	 *
    	 * @see #UPDATE_PRODUTO the request primitive
    	 */
    	String UPDATE_PRODUTO_RESPONSE = "updateProdutoResponse";
    	/**
    	 * An error response primitive for updateProduto.
    	 *
    	 * @see #UPDATE_PRODUTO the request primitive
    	 */
    	String UPDATE_PRODUTO_ERROR = "updateProdutoError";
    	/**
    	 * The 'updateMerge' request primitive for the Produto entity.
    	 * @see Produto the request payload
    	 */
    	String UPDATE_MERGE_PRODUTO = "updateMergeProduto";
    	/**
    	 * The success response primitive for updateMergeProduto.
    	 *
    	 * @see #UPDATE_MERGE_PRODUTO the request primitive
    	 */
    	String UPDATE_MERGE_PRODUTO_RESPONSE = "updateMergeProdutoResponse";
    	/**
    	 * An error response primitive for updateMergeProduto.
    	 *
    	 * @see #UPDATE_MERGE_PRODUTO the request primitive
    	 */
    	String UPDATE_MERGE_PRODUTO_ERROR = "updateMergeProdutoError";
    	/**
    	 * The 'delete' request primitive for the Produto entity.
    	 * @see Produto.Id the request payload
    	 */
    	String DELETE_PRODUTO = "deleteProduto";
    	/**
    	 * The success response primitive for deleteProduto.
    	 *
    	 * @see #DELETE_PRODUTO the request primitive
    	 */
    	String DELETE_PRODUTO_RESPONSE = "deleteProdutoResponse";
    	/**
    	 * An error response primitive for deleteProduto.
    	 *
    	 * @see #DELETE_PRODUTO the request primitive
    	 */
    	String DELETE_PRODUTO_ERROR = "deleteProdutoError";
    	/**
    	 * The 'create' request primitive for the ItemPedido entity.
    	 * @see ItemPedido the request payload
    	 */
    	String CREATE_ITEM_PEDIDO = "createItemPedido";
    	/**
    	 * The success response primitive for createItemPedido.
    	 *
    	 * @see #CREATE_ITEM_PEDIDO the request primitive
    	 */
    	String CREATE_ITEM_PEDIDO_RESPONSE = "createItemPedidoResponse";
    	/**
    	 * An error response primitive for createItemPedido.
    	 *
    	 * @see #CREATE_ITEM_PEDIDO the request primitive
    	 */
    	String CREATE_ITEM_PEDIDO_ERROR = "createItemPedidoError";
    	/**
    	 * The 'createBulk' request primitive for the ItemPedido entity.
    	 * @see CreateBulkItemPedidoInput the request payload
    	 */
    	String CREATE_BULK_ITEM_PEDIDO = "createBulkItemPedido";
    	/**
    	 * The success response primitive for createBulkItemPedido.
    	 *
    	 * @see #CREATE_BULK_ITEM_PEDIDO the request primitive
    	 * @see CreateBulkItemPedidoOutput the response payload
    	 */
    	String CREATE_BULK_ITEM_PEDIDO_RESPONSE = "createBulkItemPedidoResponse";
    	/**
    	 * An error response primitive for createBulkItemPedido.
    	 *
    	 * @see #CREATE_BULK_ITEM_PEDIDO the request primitive
    	 */
    	String CREATE_BULK_ITEM_PEDIDO_ERROR = "createBulkItemPedidoError";
    	/**
    	 * The 'createMerge' request primitive for the ItemPedido entity.
    	 * @see ItemPedido the request payload
    	 */
    	String CREATE_MERGE_ITEM_PEDIDO = "createMergeItemPedido";
    	/**
    	 * The success response primitive for createMergeItemPedido.
    	 *
    	 * @see #CREATE_MERGE_ITEM_PEDIDO the request primitive
    	 */
    	String CREATE_MERGE_ITEM_PEDIDO_RESPONSE = "createMergeItemPedidoResponse";
    	/**
    	 * An error response primitive for createMergeItemPedido.
    	 *
    	 * @see #CREATE_MERGE_ITEM_PEDIDO the request primitive
    	 */
    	String CREATE_MERGE_ITEM_PEDIDO_ERROR = "createMergeItemPedidoError";
    	/**
    	 * The 'retrieve' request primitive for the ItemPedido entity.
    	 * @see ItemPedido.Id the request payload
    	 */
    	String RETRIEVE_ITEM_PEDIDO = "retrieveItemPedido";
    	/**
    	 * The success response primitive for retrieveItemPedido.
    	 *
    	 * @see #RETRIEVE_ITEM_PEDIDO the request primitive
    	 */
    	String RETRIEVE_ITEM_PEDIDO_RESPONSE = "retrieveItemPedidoResponse";
    	/**
    	 * An error response primitive for retrieveItemPedido.
    	 *
    	 * @see #RETRIEVE_ITEM_PEDIDO the request primitive
    	 */
    	String RETRIEVE_ITEM_PEDIDO_ERROR = "retrieveItemPedidoError";
    	/**
    	 * The 'update' request primitive for the ItemPedido entity.
    	 * @see ItemPedido the request payload
    	 */
    	String UPDATE_ITEM_PEDIDO = "updateItemPedido";
    	/**
    	 * The success response primitive for updateItemPedido.
    	 *
    	 * @see #UPDATE_ITEM_PEDIDO the request primitive
    	 */
    	String UPDATE_ITEM_PEDIDO_RESPONSE = "updateItemPedidoResponse";
    	/**
    	 * An error response primitive for updateItemPedido.
    	 *
    	 * @see #UPDATE_ITEM_PEDIDO the request primitive
    	 */
    	String UPDATE_ITEM_PEDIDO_ERROR = "updateItemPedidoError";
    	/**
    	 * The 'updateMerge' request primitive for the ItemPedido entity.
    	 * @see ItemPedido the request payload
    	 */
    	String UPDATE_MERGE_ITEM_PEDIDO = "updateMergeItemPedido";
    	/**
    	 * The success response primitive for updateMergeItemPedido.
    	 *
    	 * @see #UPDATE_MERGE_ITEM_PEDIDO the request primitive
    	 */
    	String UPDATE_MERGE_ITEM_PEDIDO_RESPONSE = "updateMergeItemPedidoResponse";
    	/**
    	 * An error response primitive for updateMergeItemPedido.
    	 *
    	 * @see #UPDATE_MERGE_ITEM_PEDIDO the request primitive
    	 */
    	String UPDATE_MERGE_ITEM_PEDIDO_ERROR = "updateMergeItemPedidoError";
    	/**
    	 * The 'delete' request primitive for the ItemPedido entity.
    	 * @see ItemPedido.Id the request payload
    	 */
    	String DELETE_ITEM_PEDIDO = "deleteItemPedido";
    	/**
    	 * The success response primitive for deleteItemPedido.
    	 *
    	 * @see #DELETE_ITEM_PEDIDO the request primitive
    	 */
    	String DELETE_ITEM_PEDIDO_RESPONSE = "deleteItemPedidoResponse";
    	/**
    	 * An error response primitive for deleteItemPedido.
    	 *
    	 * @see #DELETE_ITEM_PEDIDO the request primitive
    	 */
    	String DELETE_ITEM_PEDIDO_ERROR = "deleteItemPedidoError";
    	/**
    	 * The 'create' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String CREATE_PEDIDO = "createPedido";
    	/**
    	 * The success response primitive for createPedido.
    	 *
    	 * @see #CREATE_PEDIDO the request primitive
    	 */
    	String CREATE_PEDIDO_RESPONSE = "createPedidoResponse";
    	/**
    	 * An error response primitive for createPedido.
    	 *
    	 * @see #CREATE_PEDIDO the request primitive
    	 */
    	String CREATE_PEDIDO_ERROR = "createPedidoError";
    	/**
    	 * The 'createBulk' request primitive for the Pedido entity.
    	 * @see CreateBulkPedidoInput the request payload
    	 */
    	String CREATE_BULK_PEDIDO = "createBulkPedido";
    	/**
    	 * The success response primitive for createBulkPedido.
    	 *
    	 * @see #CREATE_BULK_PEDIDO the request primitive
    	 * @see CreateBulkPedidoOutput the response payload
    	 */
    	String CREATE_BULK_PEDIDO_RESPONSE = "createBulkPedidoResponse";
    	/**
    	 * An error response primitive for createBulkPedido.
    	 *
    	 * @see #CREATE_BULK_PEDIDO the request primitive
    	 */
    	String CREATE_BULK_PEDIDO_ERROR = "createBulkPedidoError";
    	/**
    	 * The 'createMerge' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String CREATE_MERGE_PEDIDO = "createMergePedido";
    	/**
    	 * The success response primitive for createMergePedido.
    	 *
    	 * @see #CREATE_MERGE_PEDIDO the request primitive
    	 */
    	String CREATE_MERGE_PEDIDO_RESPONSE = "createMergePedidoResponse";
    	/**
    	 * An error response primitive for createMergePedido.
    	 *
    	 * @see #CREATE_MERGE_PEDIDO the request primitive
    	 */
    	String CREATE_MERGE_PEDIDO_ERROR = "createMergePedidoError";
    	/**
    	 * The 'retrieve' request primitive for the Pedido entity.
    	 * @see Pedido.Id the request payload
    	 */
    	String RETRIEVE_PEDIDO = "retrievePedido";
    	/**
    	 * The success response primitive for retrievePedido.
    	 *
    	 * @see #RETRIEVE_PEDIDO the request primitive
    	 */
    	String RETRIEVE_PEDIDO_RESPONSE = "retrievePedidoResponse";
    	/**
    	 * An error response primitive for retrievePedido.
    	 *
    	 * @see #RETRIEVE_PEDIDO the request primitive
    	 */
    	String RETRIEVE_PEDIDO_ERROR = "retrievePedidoError";
    	/**
    	 * The 'update' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String UPDATE_PEDIDO = "updatePedido";
    	/**
    	 * The success response primitive for updatePedido.
    	 *
    	 * @see #UPDATE_PEDIDO the request primitive
    	 */
    	String UPDATE_PEDIDO_RESPONSE = "updatePedidoResponse";
    	/**
    	 * An error response primitive for updatePedido.
    	 *
    	 * @see #UPDATE_PEDIDO the request primitive
    	 */
    	String UPDATE_PEDIDO_ERROR = "updatePedidoError";
    	/**
    	 * The 'updateMerge' request primitive for the Pedido entity.
    	 * @see Pedido the request payload
    	 */
    	String UPDATE_MERGE_PEDIDO = "updateMergePedido";
    	/**
    	 * The success response primitive for updateMergePedido.
    	 *
    	 * @see #UPDATE_MERGE_PEDIDO the request primitive
    	 */
    	String UPDATE_MERGE_PEDIDO_RESPONSE = "updateMergePedidoResponse";
    	/**
    	 * An error response primitive for updateMergePedido.
    	 *
    	 * @see #UPDATE_MERGE_PEDIDO the request primitive
    	 */
    	String UPDATE_MERGE_PEDIDO_ERROR = "updateMergePedidoError";
    	/**
    	 * The 'delete' request primitive for the Pedido entity.
    	 * @see Pedido.Id the request payload
    	 */
    	String DELETE_PEDIDO = "deletePedido";
    	/**
    	 * The success response primitive for deletePedido.
    	 *
    	 * @see #DELETE_PEDIDO the request primitive
    	 */
    	String DELETE_PEDIDO_RESPONSE = "deletePedidoResponse";
    	/**
    	 * An error response primitive for deletePedido.
    	 *
    	 * @see #DELETE_PEDIDO the request primitive
    	 */
    	String DELETE_PEDIDO_ERROR = "deletePedidoError";
    	/**
    	 * The 'create' request primitive for the MovimentoEstoque entity.
    	 * @see MovimentoEstoque the request payload
    	 */
    	String CREATE_MOVIMENTO_ESTOQUE = "createMovimentoEstoque";
    	/**
    	 * The success response primitive for createMovimentoEstoque.
    	 *
    	 * @see #CREATE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String CREATE_MOVIMENTO_ESTOQUE_RESPONSE = "createMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for createMovimentoEstoque.
    	 *
    	 * @see #CREATE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String CREATE_MOVIMENTO_ESTOQUE_ERROR = "createMovimentoEstoqueError";
    	/**
    	 * The 'createBulk' request primitive for the MovimentoEstoque entity.
    	 * @see CreateBulkMovimentoEstoqueInput the request payload
    	 */
    	String CREATE_BULK_MOVIMENTO_ESTOQUE = "createBulkMovimentoEstoque";
    	/**
    	 * The success response primitive for createBulkMovimentoEstoque.
    	 *
    	 * @see #CREATE_BULK_MOVIMENTO_ESTOQUE the request primitive
    	 * @see CreateBulkMovimentoEstoqueOutput the response payload
    	 */
    	String CREATE_BULK_MOVIMENTO_ESTOQUE_RESPONSE = "createBulkMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for createBulkMovimentoEstoque.
    	 *
    	 * @see #CREATE_BULK_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String CREATE_BULK_MOVIMENTO_ESTOQUE_ERROR = "createBulkMovimentoEstoqueError";
    	/**
    	 * The 'createMerge' request primitive for the MovimentoEstoque entity.
    	 * @see MovimentoEstoque the request payload
    	 */
    	String CREATE_MERGE_MOVIMENTO_ESTOQUE = "createMergeMovimentoEstoque";
    	/**
    	 * The success response primitive for createMergeMovimentoEstoque.
    	 *
    	 * @see #CREATE_MERGE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String CREATE_MERGE_MOVIMENTO_ESTOQUE_RESPONSE = "createMergeMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for createMergeMovimentoEstoque.
    	 *
    	 * @see #CREATE_MERGE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String CREATE_MERGE_MOVIMENTO_ESTOQUE_ERROR = "createMergeMovimentoEstoqueError";
    	/**
    	 * The 'retrieve' request primitive for the MovimentoEstoque entity.
    	 * @see MovimentoEstoque.Id the request payload
    	 */
    	String RETRIEVE_MOVIMENTO_ESTOQUE = "retrieveMovimentoEstoque";
    	/**
    	 * The success response primitive for retrieveMovimentoEstoque.
    	 *
    	 * @see #RETRIEVE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String RETRIEVE_MOVIMENTO_ESTOQUE_RESPONSE = "retrieveMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for retrieveMovimentoEstoque.
    	 *
    	 * @see #RETRIEVE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String RETRIEVE_MOVIMENTO_ESTOQUE_ERROR = "retrieveMovimentoEstoqueError";
    	/**
    	 * The 'update' request primitive for the MovimentoEstoque entity.
    	 * @see MovimentoEstoque the request payload
    	 */
    	String UPDATE_MOVIMENTO_ESTOQUE = "updateMovimentoEstoque";
    	/**
    	 * The success response primitive for updateMovimentoEstoque.
    	 *
    	 * @see #UPDATE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String UPDATE_MOVIMENTO_ESTOQUE_RESPONSE = "updateMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for updateMovimentoEstoque.
    	 *
    	 * @see #UPDATE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String UPDATE_MOVIMENTO_ESTOQUE_ERROR = "updateMovimentoEstoqueError";
    	/**
    	 * The 'updateMerge' request primitive for the MovimentoEstoque entity.
    	 * @see MovimentoEstoque the request payload
    	 */
    	String UPDATE_MERGE_MOVIMENTO_ESTOQUE = "updateMergeMovimentoEstoque";
    	/**
    	 * The success response primitive for updateMergeMovimentoEstoque.
    	 *
    	 * @see #UPDATE_MERGE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String UPDATE_MERGE_MOVIMENTO_ESTOQUE_RESPONSE = "updateMergeMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for updateMergeMovimentoEstoque.
    	 *
    	 * @see #UPDATE_MERGE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String UPDATE_MERGE_MOVIMENTO_ESTOQUE_ERROR = "updateMergeMovimentoEstoqueError";
    	/**
    	 * The 'delete' request primitive for the MovimentoEstoque entity.
    	 * @see MovimentoEstoque.Id the request payload
    	 */
    	String DELETE_MOVIMENTO_ESTOQUE = "deleteMovimentoEstoque";
    	/**
    	 * The success response primitive for deleteMovimentoEstoque.
    	 *
    	 * @see #DELETE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String DELETE_MOVIMENTO_ESTOQUE_RESPONSE = "deleteMovimentoEstoqueResponse";
    	/**
    	 * An error response primitive for deleteMovimentoEstoque.
    	 *
    	 * @see #DELETE_MOVIMENTO_ESTOQUE the request primitive
    	 */
    	String DELETE_MOVIMENTO_ESTOQUE_ERROR = "deleteMovimentoEstoqueError";
    }
    
    interface Events {
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    	String IMPORT_CLIENTE_EVENT = "importClienteEvent";
    	String EXPORT_CLIENTE_EVENT = "exportClienteEvent";
    	String IMPORT_PRODUTO_EVENT = "importProdutoEvent";
    	String EXPORT_PRODUTO_EVENT = "exportProdutoEvent";
    	String IMPORT_ITEM_PEDIDO_EVENT = "importItemPedidoEvent";
    	String EXPORT_ITEM_PEDIDO_EVENT = "exportItemPedidoEvent";
    	String IMPORT_PEDIDO_EVENT = "importPedidoEvent";
    	String EXPORT_PEDIDO_EVENT = "exportPedidoEvent";
    	String IMPORT_MOVIMENTO_ESTOQUE_EVENT = "importMovimentoEstoqueEvent";
    	String EXPORT_MOVIMENTO_ESTOQUE_EVENT = "exportMovimentoEstoqueEvent";
    }
    
}
