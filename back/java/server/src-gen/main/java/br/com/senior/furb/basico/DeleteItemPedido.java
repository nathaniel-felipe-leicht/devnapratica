/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the ItemPedido entity.
 */
@CommandDescription(name="deleteItemPedido", kind=CommandKind.Delete, requestPrimitive="deleteItemPedido", responsePrimitive="deleteItemPedidoResponse")
public interface DeleteItemPedido extends MessageHandler {
    
    public void deleteItemPedido(ItemPedido.Id id);
    
}
