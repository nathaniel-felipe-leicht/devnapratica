/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportMovimentoEstoqueOutput;

/**
 * Response method for exportMovimentoEstoque
 */
@CommandDescription(name="exportMovimentoEstoqueResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportMovimentoEstoqueResponse")
public interface ExportMovimentoEstoqueResponse extends MessageHandler {

	void exportMovimentoEstoqueResponse(ExportMovimentoEstoqueOutput response);
	
	void exportMovimentoEstoqueResponseError(ErrorPayload error);

}
