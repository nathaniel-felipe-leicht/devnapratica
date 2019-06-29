/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'updateMerge' request primitive for the Produto entity.
 */
@CommandDescription(name="updateMergeProduto", kind=CommandKind.UpdateMerge, requestPrimitive="updateMergeProduto", responsePrimitive="updateMergeProdutoResponse")
public interface UpdateMergeProduto extends MessageHandler {
    
    public Produto updateMergeProduto(Produto toUpdateMerge);
    
}
