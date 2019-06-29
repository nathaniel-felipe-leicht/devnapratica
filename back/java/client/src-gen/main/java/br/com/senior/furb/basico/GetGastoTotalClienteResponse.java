/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.GetGastoTotalClienteOutput;

/**
 * Response method for getGastoTotalCliente
 */
@CommandDescription(name="getGastoTotalClienteResponse", kind=CommandKind.ResponseCommand, requestPrimitive="getGastoTotalClienteResponse")
public interface GetGastoTotalClienteResponse extends MessageHandler {

	void getGastoTotalClienteResponse(GetGastoTotalClienteOutput response);
	
	void getGastoTotalClienteResponseError(ErrorPayload error);

}
