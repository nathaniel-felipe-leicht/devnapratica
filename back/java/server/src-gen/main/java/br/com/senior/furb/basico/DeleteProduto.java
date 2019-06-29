/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Produto entity.
 */
@CommandDescription(name="deleteProduto", kind=CommandKind.Delete, requestPrimitive="deleteProduto", responsePrimitive="deleteProdutoResponse")
public interface DeleteProduto extends MessageHandler {
    
    public void deleteProduto(Produto.Id id);
    
}
