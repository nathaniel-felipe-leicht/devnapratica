/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportItemPedidoOutput;

/**
 * Response method for exportItemPedido
 */
@CommandDescription(name="exportItemPedidoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportItemPedidoResponse")
public interface ExportItemPedidoResponse extends MessageHandler {

	void exportItemPedidoResponse(ExportItemPedidoOutput response);
	
	void exportItemPedidoResponseError(ErrorPayload error);

}
