/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the ItemPedido entity.
 */
@CommandDescription(name="retrieveItemPedido", kind=CommandKind.Retrieve, requestPrimitive="retrieveItemPedido", responsePrimitive="retrieveItemPedidoResponse")
public interface RetrieveItemPedido extends MessageHandler {
    
    public ItemPedido retrieveItemPedido(ItemPedido.Id id);
    
}
