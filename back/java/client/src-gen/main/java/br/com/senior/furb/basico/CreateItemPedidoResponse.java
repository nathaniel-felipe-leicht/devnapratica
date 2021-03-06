/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ItemPedido;

/**
 * Response method for createItemPedido
 */
@CommandDescription(name="createItemPedidoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createItemPedidoResponse")
public interface CreateItemPedidoResponse extends MessageHandler {

	void createItemPedidoResponse(ItemPedido response);
	
	void createItemPedidoResponseError(ErrorPayload error);

}
