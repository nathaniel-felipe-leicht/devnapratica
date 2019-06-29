/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the ItemPedido entity.
 */
@CommandDescription(name="listItemPedido", kind=CommandKind.List, requestPrimitive="listItemPedido", responsePrimitive="listItemPedidoResponse")
public interface ListItemPedido extends MessageHandler {
    
    public ItemPedido.PagedResults listItemPedido(ItemPedido.PageRequest pageRequest);
    
}
