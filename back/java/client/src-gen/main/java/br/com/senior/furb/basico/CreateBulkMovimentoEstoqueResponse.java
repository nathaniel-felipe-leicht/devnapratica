/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkMovimentoEstoqueOutput;

/**
 * Response method for createBulkMovimentoEstoque
 */
@CommandDescription(name="createBulkMovimentoEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkMovimentoEstoqueResponse")
public interface CreateBulkMovimentoEstoqueResponse extends MessageHandler {

	void createBulkMovimentoEstoqueResponse(CreateBulkMovimentoEstoqueOutput response);
	
	void createBulkMovimentoEstoqueResponseError(ErrorPayload error);

}
