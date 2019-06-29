/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listItemPedido
 */
@CommandDescription(name="listItemPedidoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listItemPedidoResponse")
public interface ListItemPedidoResponse extends MessageHandler {

	void listItemPedidoResponse(ItemPedido.PagedResults response);
	
	void listItemPedidoResponseError(ErrorPayload error);

}
