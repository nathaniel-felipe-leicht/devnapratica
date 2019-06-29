/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.MovimentoEstoque;

/**
 * Response method for createMergeMovimentoEstoque
 */
@CommandDescription(name="createMergeMovimentoEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeMovimentoEstoqueResponse")
public interface CreateMergeMovimentoEstoqueResponse extends MessageHandler {

	void createMergeMovimentoEstoqueResponse(MovimentoEstoque response);
	
	void createMergeMovimentoEstoqueResponseError(ErrorPayload error);

}
