/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportMovimentoEstoque", kind=CommandKind.Query, requestPrimitive="exportMovimentoEstoque", responsePrimitive="exportMovimentoEstoqueResponse")
public interface ExportMovimentoEstoque extends MessageHandler {
    
    public ExportMovimentoEstoqueOutput exportMovimentoEstoque(ExportMovimentoEstoqueInput request);
    
}
