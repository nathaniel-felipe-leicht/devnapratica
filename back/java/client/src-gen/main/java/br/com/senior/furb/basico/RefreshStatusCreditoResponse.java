/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.RefreshStatusCreditoOutput;

/**
 * Response method for refreshStatusCredito
 */
@CommandDescription(name="refreshStatusCreditoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="refreshStatusCreditoResponse")
public interface RefreshStatusCreditoResponse extends MessageHandler {

	void refreshStatusCreditoResponse(RefreshStatusCreditoOutput response);
	
	void refreshStatusCreditoResponseError(ErrorPayload error);

}
