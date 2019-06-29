/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the MovimentoEstoque entity.
 */
@CommandDescription(name="updateMergeMovimentoEstoque", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeMovimentoEstoque", responsePrimitive="updateMergeMovimentoEstoqueResponse")
public interface UpdateMergeMovimentoEstoque extends MessageHandler {
    
    public MovimentoEstoque updateMergeMovimentoEstoque(MovimentoEstoque toUpdateMerge);
    
}
