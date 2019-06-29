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
 * Response method for updateProduto
 */
@CommandDescription(name="updateProdutoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateProdutoResponse")
public interface UpdateProdutoResponse extends MessageHandler {

	void updateProdutoResponse(Produto response);
	
	void updateProdutoResponseError(ErrorPayload error);

}
