/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listProduto
 */
@CommandDescription(name="listProdutoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listProdutoResponse")
public interface ListProdutoResponse extends MessageHandler {

	void listProdutoResponse(Produto.PagedResults response);
	
	void listProdutoResponseError(ErrorPayload error);

}
