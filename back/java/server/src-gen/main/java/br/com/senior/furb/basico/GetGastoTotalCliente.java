/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Obtém o valor total gasto pelo cliente em pedidos
 */
@CommandDescription(name="getGastoTotalCliente", kind=CommandKind.Query, requestPrimitive="getGastoTotalCliente", responsePrimitive="getGastoTotalClienteResponse")
public interface GetGastoTotalCliente extends MessageHandler {
    
    public GetGastoTotalClienteOutput getGastoTotalCliente(GetGastoTotalClienteInput request);
    
}
