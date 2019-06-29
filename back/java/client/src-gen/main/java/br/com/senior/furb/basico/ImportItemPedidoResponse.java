/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportItemPedidoOutput;

/**
 * Response method for importItemPedido
 */
@CommandDescription(name="importItemPedidoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importItemPedidoResponse")
public interface ImportItemPedidoResponse extends MessageHandler {

	void importItemPedidoResponse(ImportItemPedidoOutput response);
	
	void importItemPedidoResponseError(ErrorPayload error);

}
