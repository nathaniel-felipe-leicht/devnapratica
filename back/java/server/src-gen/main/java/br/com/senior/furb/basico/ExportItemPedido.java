/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportItemPedido", kind=CommandKind.Query, requestPrimitive="exportItemPedido", responsePrimitive="exportItemPedidoResponse")
public interface ExportItemPedido extends MessageHandler {
    
    public ExportItemPedidoOutput exportItemPedido(ExportItemPedidoInput request);
    
}
