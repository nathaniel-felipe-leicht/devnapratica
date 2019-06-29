/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the MovimentoEstoque entity.
 */
@CommandDescription(name="updateMovimentoEstoque", kind=CommandKind.Update, requestPrimitive="updateMovimentoEstoque", responsePrimitive="updateMovimentoEstoqueResponse")
public interface UpdateMovimentoEstoque extends MessageHandler {
    
    public MovimentoEstoque updateMovimentoEstoque(MovimentoEstoque toUpdate);
    
}
