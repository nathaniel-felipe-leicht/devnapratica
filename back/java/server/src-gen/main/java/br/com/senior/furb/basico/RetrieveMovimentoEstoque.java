/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the MovimentoEstoque entity.
 */
@CommandDescription(name="retrieveMovimentoEstoque", kind=CommandKind.Retrieve, requestPrimitive="retrieveMovimentoEstoque", responsePrimitive="retrieveMovimentoEstoqueResponse")
public interface RetrieveMovimentoEstoque extends MessageHandler {
    
    public MovimentoEstoque retrieveMovimentoEstoque(MovimentoEstoque.Id id);
    
}
