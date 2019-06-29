/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the ItemPedido entity.
 */
@CommandDescription(name="createItemPedido", kind=CommandKind.Create, requestPrimitive="createItemPedido", responsePrimitive="createItemPedidoResponse")
public interface CreateItemPedido extends MessageHandler {
    
    public ItemPedido createItemPedido(ItemPedido toCreate);
    
}
