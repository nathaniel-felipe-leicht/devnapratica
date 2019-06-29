/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Produto entity.
 */
@CommandDescription(name="listProduto", kind=CommandKind.List, requestPrimitive="listProduto", responsePrimitive="listProdutoResponse")
public interface ListProduto extends MessageHandler {
    
    public Produto.PagedResults listProduto(Produto.PageRequest pageRequest);
    
}
