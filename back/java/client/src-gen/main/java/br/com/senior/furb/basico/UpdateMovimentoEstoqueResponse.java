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
 * Response method for updateMovimentoEstoque
 */
@CommandDescription(name="updateMovimentoEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMovimentoEstoqueResponse")
public interface UpdateMovimentoEstoqueResponse extends MessageHandler {

	void updateMovimentoEstoqueResponse(MovimentoEstoque response);
	
	void updateMovimentoEstoqueResponseError(ErrorPayload error);

}
