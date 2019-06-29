/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * Verifica se o cliente já efetuou um pedido e habilita o crédito
 */
@CommandDescription(name="refreshStatusCredito", kind=CommandKind.Action, requestPrimitive="refreshStatusCredito", responsePrimitive="refreshStatusCreditoResponse")
public interface RefreshStatusCredito extends MessageHandler {
    
    public RefreshStatusCreditoOutput refreshStatusCredito(RefreshStatusCreditoInput request);
    
}
