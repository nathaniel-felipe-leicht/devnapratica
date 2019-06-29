/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportProdutoOutput;

/**
 * Response method for importProduto
 */
@CommandDescription(name="importProdutoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importProdutoResponse")
public interface ImportProdutoResponse extends MessageHandler {

	void importProdutoResponse(ImportProdutoOutput response);
	
	void importProdutoResponseError(ErrorPayload error);

}
