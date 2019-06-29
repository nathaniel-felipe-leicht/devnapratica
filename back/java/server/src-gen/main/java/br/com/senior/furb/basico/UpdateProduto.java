/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Produto entity.
 */
@CommandDescription(name="updateProduto", kind=CommandKind.Update, requestPrimitive="updateProduto", responsePrimitive="updateProdutoResponse")
public interface UpdateProduto extends MessageHandler {
    
    public Produto updateProduto(Produto toUpdate);
    
}
