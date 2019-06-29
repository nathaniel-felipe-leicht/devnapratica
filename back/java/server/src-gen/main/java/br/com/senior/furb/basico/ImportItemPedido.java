/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importItemPedido", kind=CommandKind.Action, requestPrimitive="importItemPedido", responsePrimitive="importItemPedidoResponse")
public interface ImportItemPedido extends MessageHandler {
    
    public ImportItemPedidoOutput importItemPedido(ImportItemPedidoInput request);
    
}
