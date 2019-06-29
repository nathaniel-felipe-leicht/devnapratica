/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportProdutoOutput;

/**
 * Response method for exportProduto
 */
@CommandDescription(name="exportProdutoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportProdutoResponse")
public interface ExportProdutoResponse extends MessageHandler {

	void exportProdutoResponse(ExportProdutoOutput response);
	
	void exportProdutoResponseError(ErrorPayload error);

}
