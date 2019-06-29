/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the ItemPedido entity.
 */
@CommandDescription(name="updateItemPedido", kind=CommandKind.Update, requestPrimitive="updateItemPedido", responsePrimitive="updateItemPedidoResponse")
public interface UpdateItemPedido extends MessageHandler {
    
    public ItemPedido updateItemPedido(ItemPedido toUpdate);
    
}
