/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the ItemPedido entity.
 */
@CommandDescription(name="updateMergeItemPedido", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeItemPedido", responsePrimitive="updateMergeItemPedidoResponse")
public interface UpdateMergeItemPedido extends MessageHandler {
    
    public ItemPedido updateMergeItemPedido(ItemPedido toUpdateMerge);
    
}
