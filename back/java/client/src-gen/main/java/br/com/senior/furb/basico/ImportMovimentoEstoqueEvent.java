/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@SubscriptionDescription(domain="furb", service="basico", event="importMovimentoEstoqueEvent")
public interface ImportMovimentoEstoqueEvent extends MessageHandler {
    public void importMovimentoEstoqueEvent(ImportMovimentoEstoqueEventPayload payload);
    
}
