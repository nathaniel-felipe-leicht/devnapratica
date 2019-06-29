/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Atualiza a quantidade de pedidos realizado pelo cliente
 */
@CommandDescription(name="refreshQtdPedidosCliente", kind=CommandKind.Action, requestPrimitive="refreshQtdPedidosCliente", responsePrimitive="refreshQtdPedidosClienteResponse")
public interface RefreshQtdPedidosCliente extends MessageHandler {
    
    public RefreshQtdPedidosClienteOutput refreshQtdPedidosCliente(RefreshQtdPedidosClienteInput request);
    
}
