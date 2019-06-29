/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Produto entity.
 */
@CommandDescription(name="retrieveProduto", kind=CommandKind.Retrieve, requestPrimitive="retrieveProduto", responsePrimitive="retrieveProdutoResponse")
public interface RetrieveProduto extends MessageHandler {
    
    public Produto retrieveProduto(Produto.Id id);
    
}
