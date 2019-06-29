/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the MovimentoEstoque entity.
 */
@CommandDescription(name="deleteMovimentoEstoque", kind=CommandKind.Delete, requestPrimitive="deleteMovimentoEstoque", responsePrimitive="deleteMovimentoEstoqueResponse")
public interface DeleteMovimentoEstoque extends MessageHandler {
    
    public void deleteMovimentoEstoque(MovimentoEstoque.Id id);
    
}
