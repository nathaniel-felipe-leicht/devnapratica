/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportMovimentoEstoqueOutput;

/**
 * Response method for importMovimentoEstoque
 */
@CommandDescription(name="importMovimentoEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importMovimentoEstoqueResponse")
public interface ImportMovimentoEstoqueResponse extends MessageHandler {

	void importMovimentoEstoqueResponse(ImportMovimentoEstoqueOutput response);
	
	void importMovimentoEstoqueResponseError(ErrorPayload error);

}
