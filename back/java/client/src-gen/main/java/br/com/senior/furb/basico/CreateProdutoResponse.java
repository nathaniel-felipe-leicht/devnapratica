/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Produto;

/**
 * Response method for createProduto
 */
@CommandDescription(name="createProdutoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createProdutoResponse")
public interface CreateProdutoResponse extends MessageHandler {

	void createProdutoResponse(Produto response);
	
	void createProdutoResponseError(ErrorPayload error);

}
