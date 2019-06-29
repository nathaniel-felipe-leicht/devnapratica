
package br.com.senior.furb.basico.pedido;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.GetGastoTotalCliente;
import br.com.senior.furb.basico.GetGastoTotalClienteInput;
import br.com.senior.furb.basico.GetGastoTotalClienteOutput;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class HandlerPedidoImpl implements GetGastoTotalCliente {

	@Autowired
	PedidoRepositoryCustom pedidoRepositoryCustom;

	@Override
	public GetGastoTotalClienteOutput getGastoTotalCliente(GetGastoTotalClienteInput request) {
		GetGastoTotalClienteOutput out = new GetGastoTotalClienteOutput();
		
		out.total = pedidoRepositoryCustom.getGastoTotalCliente(request.idCliente);
		
		return out;
	}

}
