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
 * Response method for retrieveMovimentoEstoque
 */
@CommandDescription(name="retrieveMovimentoEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveMovimentoEstoqueResponse")
public interface RetrieveMovimentoEstoqueResponse extends MessageHandler {

	void retrieveMovimentoEstoqueResponse(MovimentoEstoque response);
	
	void retrieveMovimentoEstoqueResponseError(ErrorPayload error);

}
