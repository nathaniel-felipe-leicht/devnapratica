/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Produto entity.
 */
@CommandDescription(name="createMergeProduto", kind=CommandKind.CreateMerge, requestPrimitive="createMergeProduto", responsePrimitive="createMergeProdutoResponse")
public interface CreateMergeProduto extends MessageHandler {
    
    public Produto createMergeProduto(Produto toCreateMerge);
    
}
