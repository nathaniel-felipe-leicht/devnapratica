/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.function.Supplier;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

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

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.BasicoException;
import br.com.senior.furb.basico.BasicoConstants;

/**
* 
*/
public class BasicoStubImpl  implements BasicoStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #BasicoStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public BasicoStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public BasicoStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método getSaldo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de saldo do produto
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetSaldoOutput getSaldo(GetSaldoInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetSaldoImpl impl = new br.com.senior.furb.basico.impl.GetSaldoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getSaldo(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getSaldo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de saldo do produto
	 */
	@Override
	public void getSaldo(GetSaldoInput input) {
		br.com.senior.furb.basico.impl.GetSaldoImpl impl = new br.com.senior.furb.basico.impl.GetSaldoImpl(messengerSupplier, userId, messageSupplier);
		impl.getSaldo(input);
	}
	
	/**
	 * Chamada assíncrona para o método getSaldo
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a quantidade de saldo do produto
	 */
	@Override
	public CompletableFuture<GetSaldoOutput> getSaldoRequest(GetSaldoInput input) {
		br.com.senior.furb.basico.impl.GetSaldoImpl impl = new br.com.senior.furb.basico.impl.GetSaldoImpl(messengerSupplier, userId, messageSupplier);
		return impl.getSaldoRequest(input);
	}
	/**
	 * Chamada síncrona para o método getGastoTotalCliente
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém o valor total gasto pelo cliente em pedidos
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetGastoTotalClienteOutput getGastoTotalCliente(GetGastoTotalClienteInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetGastoTotalClienteImpl impl = new br.com.senior.furb.basico.impl.GetGastoTotalClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.getGastoTotalCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getGastoTotalCliente
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém o valor total gasto pelo cliente em pedidos
	 */
	@Override
	public void getGastoTotalCliente(GetGastoTotalClienteInput input) {
		br.com.senior.furb.basico.impl.GetGastoTotalClienteImpl impl = new br.com.senior.furb.basico.impl.GetGastoTotalClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.getGastoTotalCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método getGastoTotalCliente
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém o valor total gasto pelo cliente em pedidos
	 */
	@Override
	public CompletableFuture<GetGastoTotalClienteOutput> getGastoTotalClienteRequest(GetGastoTotalClienteInput input) {
		br.com.senior.furb.basico.impl.GetGastoTotalClienteImpl impl = new br.com.senior.furb.basico.impl.GetGastoTotalClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.getGastoTotalClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método refreshStatusCredito
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Verifica se o cliente já efetuou um pedido e habilita o crédito
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public RefreshStatusCreditoOutput refreshStatusCredito(RefreshStatusCreditoInput input, long timeout) {
		br.com.senior.furb.basico.impl.RefreshStatusCreditoImpl impl = new br.com.senior.furb.basico.impl.RefreshStatusCreditoImpl(messengerSupplier, userId, messageSupplier);
		return impl.refreshStatusCredito(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método refreshStatusCredito
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Verifica se o cliente já efetuou um pedido e habilita o crédito
	 */
	@Override
	public void refreshStatusCredito(RefreshStatusCreditoInput input) {
		br.com.senior.furb.basico.impl.RefreshStatusCreditoImpl impl = new br.com.senior.furb.basico.impl.RefreshStatusCreditoImpl(messengerSupplier, userId, messageSupplier);
		impl.refreshStatusCredito(input);
	}
	
	/**
	 * Chamada assíncrona para o método refreshStatusCredito
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Verifica se o cliente já efetuou um pedido e habilita o crédito
	 */
	@Override
	public CompletableFuture<RefreshStatusCreditoOutput> refreshStatusCreditoRequest(RefreshStatusCreditoInput input) {
		br.com.senior.furb.basico.impl.RefreshStatusCreditoImpl impl = new br.com.senior.furb.basico.impl.RefreshStatusCreditoImpl(messengerSupplier, userId, messageSupplier);
		return impl.refreshStatusCreditoRequest(input);
	}
	/**
	 * Chamada síncrona para o método refreshQtdPedidosCliente
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Atualiza a quantidade de pedidos realizado pelo cliente
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public RefreshQtdPedidosClienteOutput refreshQtdPedidosCliente(RefreshQtdPedidosClienteInput input, long timeout) {
		br.com.senior.furb.basico.impl.RefreshQtdPedidosClienteImpl impl = new br.com.senior.furb.basico.impl.RefreshQtdPedidosClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.refreshQtdPedidosCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método refreshQtdPedidosCliente
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Atualiza a quantidade de pedidos realizado pelo cliente
	 */
	@Override
	public void refreshQtdPedidosCliente(RefreshQtdPedidosClienteInput input) {
		br.com.senior.furb.basico.impl.RefreshQtdPedidosClienteImpl impl = new br.com.senior.furb.basico.impl.RefreshQtdPedidosClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.refreshQtdPedidosCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método refreshQtdPedidosCliente
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Atualiza a quantidade de pedidos realizado pelo cliente
	 */
	@Override
	public CompletableFuture<RefreshQtdPedidosClienteOutput> refreshQtdPedidosClienteRequest(RefreshQtdPedidosClienteInput input) {
		br.com.senior.furb.basico.impl.RefreshQtdPedidosClienteImpl impl = new br.com.senior.furb.basico.impl.RefreshQtdPedidosClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.refreshQtdPedidosClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input);
	}
	/**
	 * Chamada síncrona para o método importCliente
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportClienteOutput importCliente(ImportClienteInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportClienteImpl impl = new br.com.senior.furb.basico.impl.ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.importCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importCliente
	 * This is a public operation
	 * 
	 */
	@Override
	public void importCliente(ImportClienteInput input) {
		br.com.senior.furb.basico.impl.ImportClienteImpl impl = new br.com.senior.furb.basico.impl.ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.importCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método importCliente
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportClienteOutput> importClienteRequest(ImportClienteInput input) {
		br.com.senior.furb.basico.impl.ImportClienteImpl impl = new br.com.senior.furb.basico.impl.ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.importClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportCliente
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportClienteOutput exportCliente(ExportClienteInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportClienteImpl impl = new br.com.senior.furb.basico.impl.ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportCliente
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportCliente(ExportClienteInput input) {
		br.com.senior.furb.basico.impl.ExportClienteImpl impl = new br.com.senior.furb.basico.impl.ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.exportCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportCliente
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportClienteOutput> exportClienteRequest(ExportClienteInput input) {
		br.com.senior.furb.basico.impl.ExportClienteImpl impl = new br.com.senior.furb.basico.impl.ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método importProduto
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportProdutoOutput importProduto(ImportProdutoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportProdutoImpl impl = new br.com.senior.furb.basico.impl.ImportProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importProduto
	 * This is a public operation
	 * 
	 */
	@Override
	public void importProduto(ImportProdutoInput input) {
		br.com.senior.furb.basico.impl.ImportProdutoImpl impl = new br.com.senior.furb.basico.impl.ImportProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.importProduto(input);
	}
	
	/**
	 * Chamada assíncrona para o método importProduto
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportProdutoOutput> importProdutoRequest(ImportProdutoInput input) {
		br.com.senior.furb.basico.impl.ImportProdutoImpl impl = new br.com.senior.furb.basico.impl.ImportProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importProdutoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportProduto
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportProdutoOutput exportProduto(ExportProdutoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportProdutoImpl impl = new br.com.senior.furb.basico.impl.ExportProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportProduto
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportProduto(ExportProdutoInput input) {
		br.com.senior.furb.basico.impl.ExportProdutoImpl impl = new br.com.senior.furb.basico.impl.ExportProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportProduto(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportProduto
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportProdutoOutput> exportProdutoRequest(ExportProdutoInput input) {
		br.com.senior.furb.basico.impl.ExportProdutoImpl impl = new br.com.senior.furb.basico.impl.ExportProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportProdutoRequest(input);
	}
	/**
	 * Chamada síncrona para o método importItemPedido
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportItemPedidoOutput importItemPedido(ImportItemPedidoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportItemPedidoImpl impl = new br.com.senior.furb.basico.impl.ImportItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importItemPedido
	 * This is a public operation
	 * 
	 */
	@Override
	public void importItemPedido(ImportItemPedidoInput input) {
		br.com.senior.furb.basico.impl.ImportItemPedidoImpl impl = new br.com.senior.furb.basico.impl.ImportItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.importItemPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método importItemPedido
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportItemPedidoOutput> importItemPedidoRequest(ImportItemPedidoInput input) {
		br.com.senior.furb.basico.impl.ImportItemPedidoImpl impl = new br.com.senior.furb.basico.impl.ImportItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importItemPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportItemPedido
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportItemPedidoOutput exportItemPedido(ExportItemPedidoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportItemPedidoImpl impl = new br.com.senior.furb.basico.impl.ExportItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportItemPedido
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportItemPedido(ExportItemPedidoInput input) {
		br.com.senior.furb.basico.impl.ExportItemPedidoImpl impl = new br.com.senior.furb.basico.impl.ExportItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportItemPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportItemPedido
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportItemPedidoOutput> exportItemPedidoRequest(ExportItemPedidoInput input) {
		br.com.senior.furb.basico.impl.ExportItemPedidoImpl impl = new br.com.senior.furb.basico.impl.ExportItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportItemPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método importPedido
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportPedidoOutput importPedido(ImportPedidoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportPedidoImpl impl = new br.com.senior.furb.basico.impl.ImportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importPedido
	 * This is a public operation
	 * 
	 */
	@Override
	public void importPedido(ImportPedidoInput input) {
		br.com.senior.furb.basico.impl.ImportPedidoImpl impl = new br.com.senior.furb.basico.impl.ImportPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.importPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método importPedido
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportPedidoOutput> importPedidoRequest(ImportPedidoInput input) {
		br.com.senior.furb.basico.impl.ImportPedidoImpl impl = new br.com.senior.furb.basico.impl.ImportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportPedido
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportPedidoOutput exportPedido(ExportPedidoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportPedidoImpl impl = new br.com.senior.furb.basico.impl.ExportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportPedido
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportPedido(ExportPedidoInput input) {
		br.com.senior.furb.basico.impl.ExportPedidoImpl impl = new br.com.senior.furb.basico.impl.ExportPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportPedido
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportPedidoOutput> exportPedidoRequest(ExportPedidoInput input) {
		br.com.senior.furb.basico.impl.ExportPedidoImpl impl = new br.com.senior.furb.basico.impl.ExportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método importMovimentoEstoque
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportMovimentoEstoqueOutput importMovimentoEstoque(ImportMovimentoEstoqueInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.ImportMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.importMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importMovimentoEstoque
	 * This is a public operation
	 * 
	 */
	@Override
	public void importMovimentoEstoque(ImportMovimentoEstoqueInput input) {
		br.com.senior.furb.basico.impl.ImportMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.ImportMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.importMovimentoEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método importMovimentoEstoque
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportMovimentoEstoqueOutput> importMovimentoEstoqueRequest(ImportMovimentoEstoqueInput input) {
		br.com.senior.furb.basico.impl.ImportMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.ImportMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.importMovimentoEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportMovimentoEstoque
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportMovimentoEstoqueOutput exportMovimentoEstoque(ExportMovimentoEstoqueInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.ExportMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportMovimentoEstoque
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportMovimentoEstoque(ExportMovimentoEstoqueInput input) {
		br.com.senior.furb.basico.impl.ExportMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.ExportMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.exportMovimentoEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportMovimentoEstoque
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportMovimentoEstoqueOutput> exportMovimentoEstoqueRequest(ExportMovimentoEstoqueInput input) {
		br.com.senior.furb.basico.impl.ExportMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.ExportMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportMovimentoEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método listCliente
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente.PagedResults listCliente(Cliente.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListClienteImpl impl = new br.com.senior.furb.basico.impl.ListClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.listCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listCliente
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 */
	@Override
	public void listCliente(Cliente.PageRequest input) {
		br.com.senior.furb.basico.impl.ListClienteImpl impl = new br.com.senior.furb.basico.impl.ListClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.listCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método listCliente
	 * This is a public operation
	 * The 'list' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente.PagedResults> listClienteRequest(Cliente.PageRequest input) {
		br.com.senior.furb.basico.impl.ListClienteImpl impl = new br.com.senior.furb.basico.impl.ListClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.listClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método listProduto
	 * This is a public operation
	 * The 'list' request primitive for the Produto entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Produto.PagedResults listProduto(Produto.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListProdutoImpl impl = new br.com.senior.furb.basico.impl.ListProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listProduto
	 * This is a public operation
	 * The 'list' request primitive for the Produto entity.
	 */
	@Override
	public void listProduto(Produto.PageRequest input) {
		br.com.senior.furb.basico.impl.ListProdutoImpl impl = new br.com.senior.furb.basico.impl.ListProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.listProduto(input);
	}
	
	/**
	 * Chamada assíncrona para o método listProduto
	 * This is a public operation
	 * The 'list' request primitive for the Produto entity.
	 */
	@Override
	public CompletableFuture<Produto.PagedResults> listProdutoRequest(Produto.PageRequest input) {
		br.com.senior.furb.basico.impl.ListProdutoImpl impl = new br.com.senior.furb.basico.impl.ListProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listProdutoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listItemPedido
	 * This is a public operation
	 * The 'list' request primitive for the ItemPedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ItemPedido.PagedResults listItemPedido(ItemPedido.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListItemPedidoImpl impl = new br.com.senior.furb.basico.impl.ListItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listItemPedido
	 * This is a public operation
	 * The 'list' request primitive for the ItemPedido entity.
	 */
	@Override
	public void listItemPedido(ItemPedido.PageRequest input) {
		br.com.senior.furb.basico.impl.ListItemPedidoImpl impl = new br.com.senior.furb.basico.impl.ListItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.listItemPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método listItemPedido
	 * This is a public operation
	 * The 'list' request primitive for the ItemPedido entity.
	 */
	@Override
	public CompletableFuture<ItemPedido.PagedResults> listItemPedidoRequest(ItemPedido.PageRequest input) {
		br.com.senior.furb.basico.impl.ListItemPedidoImpl impl = new br.com.senior.furb.basico.impl.ListItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listItemPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listPedido
	 * This is a public operation
	 * The 'list' request primitive for the Pedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido.PagedResults listPedido(Pedido.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListPedidoImpl impl = new br.com.senior.furb.basico.impl.ListPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listPedido
	 * This is a public operation
	 * The 'list' request primitive for the Pedido entity.
	 */
	@Override
	public void listPedido(Pedido.PageRequest input) {
		br.com.senior.furb.basico.impl.ListPedidoImpl impl = new br.com.senior.furb.basico.impl.ListPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.listPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método listPedido
	 * This is a public operation
	 * The 'list' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido.PagedResults> listPedidoRequest(Pedido.PageRequest input) {
		br.com.senior.furb.basico.impl.ListPedidoImpl impl = new br.com.senior.furb.basico.impl.ListPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listMovimentoEstoque
	 * This is a public operation
	 * The 'list' request primitive for the MovimentoEstoque entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public MovimentoEstoque.PagedResults listMovimentoEstoque(MovimentoEstoque.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.ListMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.listMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listMovimentoEstoque
	 * This is a public operation
	 * The 'list' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public void listMovimentoEstoque(MovimentoEstoque.PageRequest input) {
		br.com.senior.furb.basico.impl.ListMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.ListMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.listMovimentoEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método listMovimentoEstoque
	 * This is a public operation
	 * The 'list' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public CompletableFuture<MovimentoEstoque.PagedResults> listMovimentoEstoqueRequest(MovimentoEstoque.PageRequest input) {
		br.com.senior.furb.basico.impl.ListMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.ListMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.listMovimentoEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest();
	}
	/**
	 * Chamada síncrona para o método createCliente
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente createCliente(Cliente input, long timeout) {
		br.com.senior.furb.basico.impl.CreateClienteImpl impl = new br.com.senior.furb.basico.impl.CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createCliente
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 */
	@Override
	public void createCliente(Cliente input) {
		br.com.senior.furb.basico.impl.CreateClienteImpl impl = new br.com.senior.furb.basico.impl.CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método createCliente
	 * This is a public operation
	 * The 'create' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> createClienteRequest(Cliente input) {
		br.com.senior.furb.basico.impl.CreateClienteImpl impl = new br.com.senior.furb.basico.impl.CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkCliente
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkClienteImpl impl = new br.com.senior.furb.basico.impl.CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkCliente
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 */
	@Override
	public void createBulkCliente(CreateBulkClienteInput input) {
		br.com.senior.furb.basico.impl.CreateBulkClienteImpl impl = new br.com.senior.furb.basico.impl.CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkCliente
	 * This is a public operation
	 * The 'createBulk' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<CreateBulkClienteOutput> createBulkClienteRequest(CreateBulkClienteInput input) {
		br.com.senior.furb.basico.impl.CreateBulkClienteImpl impl = new br.com.senior.furb.basico.impl.CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeCliente
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente createMergeCliente(Cliente input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeClienteImpl impl = new br.com.senior.furb.basico.impl.CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeCliente
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 */
	@Override
	public void createMergeCliente(Cliente input) {
		br.com.senior.furb.basico.impl.CreateMergeClienteImpl impl = new br.com.senior.furb.basico.impl.CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeCliente
	 * This is a public operation
	 * The 'createMerge' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> createMergeClienteRequest(Cliente input) {
		br.com.senior.furb.basico.impl.CreateMergeClienteImpl impl = new br.com.senior.furb.basico.impl.CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveCliente
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente retrieveCliente(Cliente.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveClienteImpl impl = new br.com.senior.furb.basico.impl.RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveCliente
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 */
	@Override
	public void retrieveCliente(Cliente.Id input) {
		br.com.senior.furb.basico.impl.RetrieveClienteImpl impl = new br.com.senior.furb.basico.impl.RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveCliente
	 * This is a public operation
	 * The 'retrieve' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> retrieveClienteRequest(Cliente.Id input) {
		br.com.senior.furb.basico.impl.RetrieveClienteImpl impl = new br.com.senior.furb.basico.impl.RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateCliente
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente updateCliente(Cliente input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateClienteImpl impl = new br.com.senior.furb.basico.impl.UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateCliente
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 */
	@Override
	public void updateCliente(Cliente input) {
		br.com.senior.furb.basico.impl.UpdateClienteImpl impl = new br.com.senior.furb.basico.impl.UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.updateCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateCliente
	 * This is a public operation
	 * The 'update' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> updateClienteRequest(Cliente input) {
		br.com.senior.furb.basico.impl.UpdateClienteImpl impl = new br.com.senior.furb.basico.impl.UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeCliente
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Cliente updateMergeCliente(Cliente input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeClienteImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeCliente
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 */
	@Override
	public void updateMergeCliente(Cliente input) {
		br.com.senior.furb.basico.impl.UpdateMergeClienteImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeCliente(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeCliente
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Cliente entity.
	 */
	@Override
	public CompletableFuture<Cliente> updateMergeClienteRequest(Cliente input) {
		br.com.senior.furb.basico.impl.UpdateMergeClienteImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeClienteRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteCliente
	 * This is a public operation
	 * The 'delete' request primitive for the Cliente entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteCliente(Cliente.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteClienteImpl impl = new br.com.senior.furb.basico.impl.DeleteClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteCliente(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteCliente
	 * This is a public operation
	 * The 'delete' request primitive for the Cliente entity.
	 */
	@Override
	public void deleteCliente(Cliente.Id input) {
		br.com.senior.furb.basico.impl.DeleteClienteImpl impl = new br.com.senior.furb.basico.impl.DeleteClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteCliente(input);
	}
	
	/**
	 * Chamada síncrona para o método createProduto
	 * This is a public operation
	 * The 'create' request primitive for the Produto entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Produto createProduto(Produto input, long timeout) {
		br.com.senior.furb.basico.impl.CreateProdutoImpl impl = new br.com.senior.furb.basico.impl.CreateProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createProduto
	 * This is a public operation
	 * The 'create' request primitive for the Produto entity.
	 */
	@Override
	public void createProduto(Produto input) {
		br.com.senior.furb.basico.impl.CreateProdutoImpl impl = new br.com.senior.furb.basico.impl.CreateProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.createProduto(input);
	}
	
	/**
	 * Chamada assíncrona para o método createProduto
	 * This is a public operation
	 * The 'create' request primitive for the Produto entity.
	 */
	@Override
	public CompletableFuture<Produto> createProdutoRequest(Produto input) {
		br.com.senior.furb.basico.impl.CreateProdutoImpl impl = new br.com.senior.furb.basico.impl.CreateProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createProdutoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkProduto
	 * This is a public operation
	 * The 'createBulk' request primitive for the Produto entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkProdutoOutput createBulkProduto(CreateBulkProdutoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkProdutoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkProduto
	 * This is a public operation
	 * The 'createBulk' request primitive for the Produto entity.
	 */
	@Override
	public void createBulkProduto(CreateBulkProdutoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkProdutoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkProduto(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkProduto
	 * This is a public operation
	 * The 'createBulk' request primitive for the Produto entity.
	 */
	@Override
	public CompletableFuture<CreateBulkProdutoOutput> createBulkProdutoRequest(CreateBulkProdutoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkProdutoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkProdutoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeProduto
	 * This is a public operation
	 * The 'createMerge' request primitive for the Produto entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Produto createMergeProduto(Produto input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeProdutoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeProduto
	 * This is a public operation
	 * The 'createMerge' request primitive for the Produto entity.
	 */
	@Override
	public void createMergeProduto(Produto input) {
		br.com.senior.furb.basico.impl.CreateMergeProdutoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeProduto(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeProduto
	 * This is a public operation
	 * The 'createMerge' request primitive for the Produto entity.
	 */
	@Override
	public CompletableFuture<Produto> createMergeProdutoRequest(Produto input) {
		br.com.senior.furb.basico.impl.CreateMergeProdutoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeProdutoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveProduto
	 * This is a public operation
	 * The 'retrieve' request primitive for the Produto entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Produto retrieveProduto(Produto.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveProdutoImpl impl = new br.com.senior.furb.basico.impl.RetrieveProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveProduto
	 * This is a public operation
	 * The 'retrieve' request primitive for the Produto entity.
	 */
	@Override
	public void retrieveProduto(Produto.Id input) {
		br.com.senior.furb.basico.impl.RetrieveProdutoImpl impl = new br.com.senior.furb.basico.impl.RetrieveProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveProduto(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveProduto
	 * This is a public operation
	 * The 'retrieve' request primitive for the Produto entity.
	 */
	@Override
	public CompletableFuture<Produto> retrieveProdutoRequest(Produto.Id input) {
		br.com.senior.furb.basico.impl.RetrieveProdutoImpl impl = new br.com.senior.furb.basico.impl.RetrieveProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveProdutoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateProduto
	 * This is a public operation
	 * The 'update' request primitive for the Produto entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Produto updateProduto(Produto input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateProdutoImpl impl = new br.com.senior.furb.basico.impl.UpdateProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateProduto
	 * This is a public operation
	 * The 'update' request primitive for the Produto entity.
	 */
	@Override
	public void updateProduto(Produto input) {
		br.com.senior.furb.basico.impl.UpdateProdutoImpl impl = new br.com.senior.furb.basico.impl.UpdateProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateProduto(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateProduto
	 * This is a public operation
	 * The 'update' request primitive for the Produto entity.
	 */
	@Override
	public CompletableFuture<Produto> updateProdutoRequest(Produto input) {
		br.com.senior.furb.basico.impl.UpdateProdutoImpl impl = new br.com.senior.furb.basico.impl.UpdateProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateProdutoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeProduto
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Produto entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Produto updateMergeProduto(Produto input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeProdutoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeProduto
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Produto entity.
	 */
	@Override
	public void updateMergeProduto(Produto input) {
		br.com.senior.furb.basico.impl.UpdateMergeProdutoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeProduto(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeProduto
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Produto entity.
	 */
	@Override
	public CompletableFuture<Produto> updateMergeProdutoRequest(Produto input) {
		br.com.senior.furb.basico.impl.UpdateMergeProdutoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeProdutoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeProdutoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteProduto
	 * This is a public operation
	 * The 'delete' request primitive for the Produto entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteProduto(Produto.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteProdutoImpl impl = new br.com.senior.furb.basico.impl.DeleteProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteProduto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteProduto
	 * This is a public operation
	 * The 'delete' request primitive for the Produto entity.
	 */
	@Override
	public void deleteProduto(Produto.Id input) {
		br.com.senior.furb.basico.impl.DeleteProdutoImpl impl = new br.com.senior.furb.basico.impl.DeleteProdutoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteProduto(input);
	}
	
	/**
	 * Chamada síncrona para o método createItemPedido
	 * This is a public operation
	 * The 'create' request primitive for the ItemPedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ItemPedido createItemPedido(ItemPedido input, long timeout) {
		br.com.senior.furb.basico.impl.CreateItemPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createItemPedido
	 * This is a public operation
	 * The 'create' request primitive for the ItemPedido entity.
	 */
	@Override
	public void createItemPedido(ItemPedido input) {
		br.com.senior.furb.basico.impl.CreateItemPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createItemPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método createItemPedido
	 * This is a public operation
	 * The 'create' request primitive for the ItemPedido entity.
	 */
	@Override
	public CompletableFuture<ItemPedido> createItemPedidoRequest(ItemPedido input) {
		br.com.senior.furb.basico.impl.CreateItemPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createItemPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkItemPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the ItemPedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkItemPedidoOutput createBulkItemPedido(CreateBulkItemPedidoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkItemPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkItemPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the ItemPedido entity.
	 */
	@Override
	public void createBulkItemPedido(CreateBulkItemPedidoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkItemPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkItemPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkItemPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the ItemPedido entity.
	 */
	@Override
	public CompletableFuture<CreateBulkItemPedidoOutput> createBulkItemPedidoRequest(CreateBulkItemPedidoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkItemPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkItemPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeItemPedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the ItemPedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ItemPedido createMergeItemPedido(ItemPedido input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeItemPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeItemPedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the ItemPedido entity.
	 */
	@Override
	public void createMergeItemPedido(ItemPedido input) {
		br.com.senior.furb.basico.impl.CreateMergeItemPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeItemPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeItemPedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the ItemPedido entity.
	 */
	@Override
	public CompletableFuture<ItemPedido> createMergeItemPedidoRequest(ItemPedido input) {
		br.com.senior.furb.basico.impl.CreateMergeItemPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeItemPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveItemPedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the ItemPedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ItemPedido retrieveItemPedido(ItemPedido.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveItemPedidoImpl impl = new br.com.senior.furb.basico.impl.RetrieveItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveItemPedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the ItemPedido entity.
	 */
	@Override
	public void retrieveItemPedido(ItemPedido.Id input) {
		br.com.senior.furb.basico.impl.RetrieveItemPedidoImpl impl = new br.com.senior.furb.basico.impl.RetrieveItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveItemPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveItemPedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the ItemPedido entity.
	 */
	@Override
	public CompletableFuture<ItemPedido> retrieveItemPedidoRequest(ItemPedido.Id input) {
		br.com.senior.furb.basico.impl.RetrieveItemPedidoImpl impl = new br.com.senior.furb.basico.impl.RetrieveItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveItemPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateItemPedido
	 * This is a public operation
	 * The 'update' request primitive for the ItemPedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ItemPedido updateItemPedido(ItemPedido input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateItemPedidoImpl impl = new br.com.senior.furb.basico.impl.UpdateItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateItemPedido
	 * This is a public operation
	 * The 'update' request primitive for the ItemPedido entity.
	 */
	@Override
	public void updateItemPedido(ItemPedido input) {
		br.com.senior.furb.basico.impl.UpdateItemPedidoImpl impl = new br.com.senior.furb.basico.impl.UpdateItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateItemPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateItemPedido
	 * This is a public operation
	 * The 'update' request primitive for the ItemPedido entity.
	 */
	@Override
	public CompletableFuture<ItemPedido> updateItemPedidoRequest(ItemPedido input) {
		br.com.senior.furb.basico.impl.UpdateItemPedidoImpl impl = new br.com.senior.furb.basico.impl.UpdateItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateItemPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeItemPedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the ItemPedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ItemPedido updateMergeItemPedido(ItemPedido input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeItemPedidoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeItemPedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the ItemPedido entity.
	 */
	@Override
	public void updateMergeItemPedido(ItemPedido input) {
		br.com.senior.furb.basico.impl.UpdateMergeItemPedidoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeItemPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeItemPedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the ItemPedido entity.
	 */
	@Override
	public CompletableFuture<ItemPedido> updateMergeItemPedidoRequest(ItemPedido input) {
		br.com.senior.furb.basico.impl.UpdateMergeItemPedidoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeItemPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteItemPedido
	 * This is a public operation
	 * The 'delete' request primitive for the ItemPedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteItemPedido(ItemPedido.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteItemPedidoImpl impl = new br.com.senior.furb.basico.impl.DeleteItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteItemPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteItemPedido
	 * This is a public operation
	 * The 'delete' request primitive for the ItemPedido entity.
	 */
	@Override
	public void deleteItemPedido(ItemPedido.Id input) {
		br.com.senior.furb.basico.impl.DeleteItemPedidoImpl impl = new br.com.senior.furb.basico.impl.DeleteItemPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteItemPedido(input);
	}
	
	/**
	 * Chamada síncrona para o método createPedido
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido createPedido(Pedido input, long timeout) {
		br.com.senior.furb.basico.impl.CreatePedidoImpl impl = new br.com.senior.furb.basico.impl.CreatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createPedido
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 */
	@Override
	public void createPedido(Pedido input) {
		br.com.senior.furb.basico.impl.CreatePedidoImpl impl = new br.com.senior.furb.basico.impl.CreatePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método createPedido
	 * This is a public operation
	 * The 'create' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> createPedidoRequest(Pedido input) {
		br.com.senior.furb.basico.impl.CreatePedidoImpl impl = new br.com.senior.furb.basico.impl.CreatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkPedidoOutput createBulkPedido(CreateBulkPedidoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkPedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 */
	@Override
	public void createBulkPedido(CreateBulkPedidoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkPedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkPedido
	 * This is a public operation
	 * The 'createBulk' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<CreateBulkPedidoOutput> createBulkPedidoRequest(CreateBulkPedidoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkPedidoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkPedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergePedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido createMergePedido(Pedido input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergePedidoImpl impl = new br.com.senior.furb.basico.impl.CreateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergePedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 */
	@Override
	public void createMergePedido(Pedido input) {
		br.com.senior.furb.basico.impl.CreateMergePedidoImpl impl = new br.com.senior.furb.basico.impl.CreateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergePedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergePedido
	 * This is a public operation
	 * The 'createMerge' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> createMergePedidoRequest(Pedido input) {
		br.com.senior.furb.basico.impl.CreateMergePedidoImpl impl = new br.com.senior.furb.basico.impl.CreateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergePedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrievePedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido retrievePedido(Pedido.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrievePedidoImpl impl = new br.com.senior.furb.basico.impl.RetrievePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrievePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrievePedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 */
	@Override
	public void retrievePedido(Pedido.Id input) {
		br.com.senior.furb.basico.impl.RetrievePedidoImpl impl = new br.com.senior.furb.basico.impl.RetrievePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrievePedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrievePedido
	 * This is a public operation
	 * The 'retrieve' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> retrievePedidoRequest(Pedido.Id input) {
		br.com.senior.furb.basico.impl.RetrievePedidoImpl impl = new br.com.senior.furb.basico.impl.RetrievePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrievePedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updatePedido
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido updatePedido(Pedido input, long timeout) {
		br.com.senior.furb.basico.impl.UpdatePedidoImpl impl = new br.com.senior.furb.basico.impl.UpdatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updatePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updatePedido
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 */
	@Override
	public void updatePedido(Pedido input) {
		br.com.senior.furb.basico.impl.UpdatePedidoImpl impl = new br.com.senior.furb.basico.impl.UpdatePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.updatePedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método updatePedido
	 * This is a public operation
	 * The 'update' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> updatePedidoRequest(Pedido input) {
		br.com.senior.furb.basico.impl.UpdatePedidoImpl impl = new br.com.senior.furb.basico.impl.UpdatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updatePedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergePedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Pedido updateMergePedido(Pedido input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergePedidoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergePedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 */
	@Override
	public void updateMergePedido(Pedido input) {
		br.com.senior.furb.basico.impl.UpdateMergePedidoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergePedido(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergePedido
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Pedido entity.
	 */
	@Override
	public CompletableFuture<Pedido> updateMergePedidoRequest(Pedido input) {
		br.com.senior.furb.basico.impl.UpdateMergePedidoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergePedidoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deletePedido
	 * This is a public operation
	 * The 'delete' request primitive for the Pedido entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deletePedido(Pedido.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeletePedidoImpl impl = new br.com.senior.furb.basico.impl.DeletePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.deletePedido(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deletePedido
	 * This is a public operation
	 * The 'delete' request primitive for the Pedido entity.
	 */
	@Override
	public void deletePedido(Pedido.Id input) {
		br.com.senior.furb.basico.impl.DeletePedidoImpl impl = new br.com.senior.furb.basico.impl.DeletePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.deletePedido(input);
	}
	
	/**
	 * Chamada síncrona para o método createMovimentoEstoque
	 * This is a public operation
	 * The 'create' request primitive for the MovimentoEstoque entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public MovimentoEstoque createMovimentoEstoque(MovimentoEstoque input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.CreateMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMovimentoEstoque
	 * This is a public operation
	 * The 'create' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public void createMovimentoEstoque(MovimentoEstoque input) {
		br.com.senior.furb.basico.impl.CreateMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.CreateMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.createMovimentoEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMovimentoEstoque
	 * This is a public operation
	 * The 'create' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public CompletableFuture<MovimentoEstoque> createMovimentoEstoqueRequest(MovimentoEstoque input) {
		br.com.senior.furb.basico.impl.CreateMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.CreateMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMovimentoEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkMovimentoEstoque
	 * This is a public operation
	 * The 'createBulk' request primitive for the MovimentoEstoque entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkMovimentoEstoqueOutput createBulkMovimentoEstoque(CreateBulkMovimentoEstoqueInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.CreateBulkMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkMovimentoEstoque
	 * This is a public operation
	 * The 'createBulk' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public void createBulkMovimentoEstoque(CreateBulkMovimentoEstoqueInput input) {
		br.com.senior.furb.basico.impl.CreateBulkMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.CreateBulkMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkMovimentoEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkMovimentoEstoque
	 * This is a public operation
	 * The 'createBulk' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public CompletableFuture<CreateBulkMovimentoEstoqueOutput> createBulkMovimentoEstoqueRequest(CreateBulkMovimentoEstoqueInput input) {
		br.com.senior.furb.basico.impl.CreateBulkMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.CreateBulkMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkMovimentoEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeMovimentoEstoque
	 * This is a public operation
	 * The 'createMerge' request primitive for the MovimentoEstoque entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public MovimentoEstoque createMergeMovimentoEstoque(MovimentoEstoque input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.CreateMergeMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeMovimentoEstoque
	 * This is a public operation
	 * The 'createMerge' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public void createMergeMovimentoEstoque(MovimentoEstoque input) {
		br.com.senior.furb.basico.impl.CreateMergeMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.CreateMergeMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeMovimentoEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeMovimentoEstoque
	 * This is a public operation
	 * The 'createMerge' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public CompletableFuture<MovimentoEstoque> createMergeMovimentoEstoqueRequest(MovimentoEstoque input) {
		br.com.senior.furb.basico.impl.CreateMergeMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.CreateMergeMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeMovimentoEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveMovimentoEstoque
	 * This is a public operation
	 * The 'retrieve' request primitive for the MovimentoEstoque entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public MovimentoEstoque retrieveMovimentoEstoque(MovimentoEstoque.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.RetrieveMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveMovimentoEstoque
	 * This is a public operation
	 * The 'retrieve' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public void retrieveMovimentoEstoque(MovimentoEstoque.Id input) {
		br.com.senior.furb.basico.impl.RetrieveMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.RetrieveMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveMovimentoEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveMovimentoEstoque
	 * This is a public operation
	 * The 'retrieve' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public CompletableFuture<MovimentoEstoque> retrieveMovimentoEstoqueRequest(MovimentoEstoque.Id input) {
		br.com.senior.furb.basico.impl.RetrieveMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.RetrieveMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveMovimentoEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMovimentoEstoque
	 * This is a public operation
	 * The 'update' request primitive for the MovimentoEstoque entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public MovimentoEstoque updateMovimentoEstoque(MovimentoEstoque input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.UpdateMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMovimentoEstoque
	 * This is a public operation
	 * The 'update' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public void updateMovimentoEstoque(MovimentoEstoque input) {
		br.com.senior.furb.basico.impl.UpdateMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.UpdateMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMovimentoEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMovimentoEstoque
	 * This is a public operation
	 * The 'update' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public CompletableFuture<MovimentoEstoque> updateMovimentoEstoqueRequest(MovimentoEstoque input) {
		br.com.senior.furb.basico.impl.UpdateMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.UpdateMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMovimentoEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeMovimentoEstoque
	 * This is a public operation
	 * The 'updateMerge' request primitive for the MovimentoEstoque entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public MovimentoEstoque updateMergeMovimentoEstoque(MovimentoEstoque input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeMovimentoEstoque
	 * This is a public operation
	 * The 'updateMerge' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public void updateMergeMovimentoEstoque(MovimentoEstoque input) {
		br.com.senior.furb.basico.impl.UpdateMergeMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeMovimentoEstoque(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeMovimentoEstoque
	 * This is a public operation
	 * The 'updateMerge' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public CompletableFuture<MovimentoEstoque> updateMergeMovimentoEstoqueRequest(MovimentoEstoque input) {
		br.com.senior.furb.basico.impl.UpdateMergeMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeMovimentoEstoqueRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteMovimentoEstoque
	 * This is a public operation
	 * The 'delete' request primitive for the MovimentoEstoque entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteMovimentoEstoque(MovimentoEstoque.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.DeleteMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteMovimentoEstoque(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteMovimentoEstoque
	 * This is a public operation
	 * The 'delete' request primitive for the MovimentoEstoque entity.
	 */
	@Override
	public void deleteMovimentoEstoque(MovimentoEstoque.Id input) {
		br.com.senior.furb.basico.impl.DeleteMovimentoEstoqueImpl impl = new br.com.senior.furb.basico.impl.DeleteMovimentoEstoqueImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteMovimentoEstoque(input);
	}
	


	/**
	* Chamada assíncrona para o método publishServiceStarted
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishServiceStarted( ServiceStartedPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.SERVICE_STARTED, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.NOTIFY_USER_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportClienteEvent
	* This is a public operation
	*/
	public void publishImportClienteEvent( ImportClienteEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_CLIENTE_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportClienteEvent
	* This is a public operation
	*/
	public void publishExportClienteEvent( ExportClienteEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_CLIENTE_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportProdutoEvent
	* This is a public operation
	*/
	public void publishImportProdutoEvent( ImportProdutoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_PRODUTO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportProdutoEvent
	* This is a public operation
	*/
	public void publishExportProdutoEvent( ExportProdutoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_PRODUTO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportItemPedidoEvent
	* This is a public operation
	*/
	public void publishImportItemPedidoEvent( ImportItemPedidoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_ITEM_PEDIDO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportItemPedidoEvent
	* This is a public operation
	*/
	public void publishExportItemPedidoEvent( ExportItemPedidoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_ITEM_PEDIDO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportPedidoEvent
	* This is a public operation
	*/
	public void publishImportPedidoEvent( ImportPedidoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_PEDIDO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportPedidoEvent
	* This is a public operation
	*/
	public void publishExportPedidoEvent( ExportPedidoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_PEDIDO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportMovimentoEstoqueEvent
	* This is a public operation
	*/
	public void publishImportMovimentoEstoqueEvent( ImportMovimentoEstoqueEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_MOVIMENTO_ESTOQUE_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportMovimentoEstoqueEvent
	* This is a public operation
	*/
	public void publishExportMovimentoEstoqueEvent( ExportMovimentoEstoqueEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_MOVIMENTO_ESTOQUE_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	

	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
