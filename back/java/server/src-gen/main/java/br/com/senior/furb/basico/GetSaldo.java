/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Obtém a quantidade de saldo do produto
 */
@CommandDescription(name="getSaldo", kind=CommandKind.Query, requestPrimitive="getSaldo", responsePrimitive="getSaldoResponse")
public interface GetSaldo extends MessageHandler {
    
    public GetSaldoOutput getSaldo(GetSaldoInput request);
    
}
