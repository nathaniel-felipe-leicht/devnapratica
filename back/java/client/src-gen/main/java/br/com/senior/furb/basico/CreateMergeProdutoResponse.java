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
 * Response method for createMergeProduto
 */
@CommandDescription(name="createMergeProdutoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeProdutoResponse")
public interface CreateMergeProdutoResponse extends MessageHandler {

	void createMergeProdutoResponse(Produto response);
	
	void createMergeProdutoResponseError(ErrorPayload error);

}
