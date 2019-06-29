/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the MovimentoEstoque entity.
 */
@CommandDescription(name="listMovimentoEstoque", kind=CommandKind.List, requestPrimitive="listMovimentoEstoque", responsePrimitive="listMovimentoEstoqueResponse")
public interface ListMovimentoEstoque extends MessageHandler {
    
    public MovimentoEstoque.PagedResults listMovimentoEstoque(MovimentoEstoque.PageRequest pageRequest);
    
}
