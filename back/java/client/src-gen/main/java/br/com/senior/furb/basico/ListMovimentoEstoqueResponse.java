/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listMovimentoEstoque
 */
@CommandDescription(name="listMovimentoEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listMovimentoEstoqueResponse")
public interface ListMovimentoEstoqueResponse extends MessageHandler {

	void listMovimentoEstoqueResponse(MovimentoEstoque.PagedResults response);
	
	void listMovimentoEstoqueResponseError(ErrorPayload error);

}
