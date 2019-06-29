package br.com.senior.furb.basico.cliente;

import org.springframework.beans.factory.annotation.Autowired;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.ClienteEntity;
import br.com.senior.furb.basico.QClienteEntity;
import br.com.senior.furb.basico.QPedidoEntity;
import br.com.senior.furb.basico.RefreshQtdPedidosCliente;
import br.com.senior.furb.basico.RefreshQtdPedidosClienteInput;
import br.com.senior.furb.basico.RefreshQtdPedidosClienteOutput;
import br.com.senior.furb.basico.RefreshQtdPedidosClienteResponse;
import br.com.senior.furb.basico.RefreshStatusCredito;
import br.com.senior.furb.basico.RefreshStatusCreditoInput;
import br.com.senior.furb.basico.RefreshStatusCreditoOutput;
import br.com.senior.furb.basico.repositories.PedidoRepository;
import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class HandlerClienteImpl implements RefreshQtdPedidosCliente, RefreshStatusCredito {

	@Autowired
	ClienteRepositoryCustom clienteRepositoryCustom;

	@Override
	public RefreshQtdPedidosClienteOutput refreshQtdPedidosCliente(RefreshQtdPedidosClienteInput request) {

		RefreshQtdPedidosClienteOutput out = new RefreshQtdPedidosClienteOutput();
		out.qtd = clienteRepositoryCustom.refreshQtdPedidosCliente(request.idCliente);
		
		return out;
	}

	@Override
	public RefreshStatusCreditoOutput refreshStatusCredito(RefreshStatusCreditoInput request) {

		RefreshStatusCreditoOutput out = new RefreshStatusCreditoOutput();
		clienteRepositoryCustom.refreshStatusCredito(request.idCliente);
		
		return out;
	}
}
