/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the MovimentoEstoque entity.
 */
@CommandDescription(name="createMovimentoEstoque", kind=CommandKind.Create, requestPrimitive="createMovimentoEstoque", responsePrimitive="createMovimentoEstoqueResponse")
public interface CreateMovimentoEstoque extends MessageHandler {
    
    public MovimentoEstoque createMovimentoEstoque(MovimentoEstoque toCreate);
    
}
