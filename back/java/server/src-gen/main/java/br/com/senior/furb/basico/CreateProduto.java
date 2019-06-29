/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Produto entity.
 */
@CommandDescription(name="createProduto", kind=CommandKind.Create, requestPrimitive="createProduto", responsePrimitive="createProdutoResponse")
public interface CreateProduto extends MessageHandler {
    
    public Produto createProduto(Produto toCreate);
    
}
