/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.RefreshQtdPedidosClienteOutput;

/**
 * Response method for refreshQtdPedidosCliente
 */
@CommandDescription(name="refreshQtdPedidosClienteResponse", kind=CommandKind.ResponseCommand, requestPrimitive="refreshQtdPedidosClienteResponse")
public interface RefreshQtdPedidosClienteResponse extends MessageHandler {

	void refreshQtdPedidosClienteResponse(RefreshQtdPedidosClienteOutput response);
	
	void refreshQtdPedidosClienteResponseError(ErrorPayload error);

}
