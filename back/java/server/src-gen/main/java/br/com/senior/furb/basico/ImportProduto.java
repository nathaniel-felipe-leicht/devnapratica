/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importProduto", kind=CommandKind.Action, requestPrimitive="importProduto", responsePrimitive="importProdutoResponse")
public interface ImportProduto extends MessageHandler {
    
    public ImportProdutoOutput importProduto(ImportProdutoInput request);
    
}
