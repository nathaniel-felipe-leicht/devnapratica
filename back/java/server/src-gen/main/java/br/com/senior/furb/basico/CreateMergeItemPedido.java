/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the ItemPedido entity.
 */
@CommandDescription(name="createMergeItemPedido", kind=CommandKind.CreateMerge, requestPrimitive="createMergeItemPedido", responsePrimitive="createMergeItemPedidoResponse")
public interface CreateMergeItemPedido extends MessageHandler {
    
    public ItemPedido createMergeItemPedido(ItemPedido toCreateMerge);
    
}
