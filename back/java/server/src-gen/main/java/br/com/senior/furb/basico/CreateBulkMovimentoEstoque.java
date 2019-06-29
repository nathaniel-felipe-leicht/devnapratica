/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkMovimentoEstoque", kind = CommandKind.Create, requestPrimitive = "createBulkMovimentoEstoque", responsePrimitive="")
public interface CreateBulkMovimentoEstoque extends MessageHandler {
    public CreateBulkMovimentoEstoqueOutput createBulkMovimentoEstoque(CreateBulkMovimentoEstoqueInput toCreate);
}
