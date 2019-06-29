/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportProduto", kind=CommandKind.Query, requestPrimitive="exportProduto", responsePrimitive="exportProdutoResponse")
public interface ExportProduto extends MessageHandler {
    
    public ExportProdutoOutput exportProduto(ExportProdutoInput request);
    
}
