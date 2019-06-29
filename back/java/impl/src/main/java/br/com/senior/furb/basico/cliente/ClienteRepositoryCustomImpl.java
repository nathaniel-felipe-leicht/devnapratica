package br.com.senior.furb.basico.cliente;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.ClienteBaseRepository;
import br.com.senior.furb.basico.ClienteEntity;
import br.com.senior.furb.basico.QClienteEntity;
import br.com.senior.furb.basico.QPedidoEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class ClienteRepositoryCustomImpl extends RepositoryBaseJpa implements ClienteRepositoryCustom {

	@Autowired
	private ClienteBaseRepository clienteRepository;

	@Override
	public long refreshQtdPedidosCliente(String id) {

		UUID uuidToFind = UUID.fromString(id);

		QPedidoEntity pedidos = QPedidoEntity.pedidoEntity;

		long query = select(pedidos).from(pedidos).where(pedidos.cliente.id.eq(uuidToFind)).fetchCount();

		QClienteEntity cliente = QClienteEntity.clienteEntity;

		JPAQuery<ClienteEntity> queryCliente = select(cliente).from(cliente).where(cliente.id.eq(uuidToFind));

		ClienteEntity clienteDado = queryCliente.fetchFirst();

		if (clienteDado != null) {
			clienteDado.setQtPedidos(query);
			clienteRepository.save(clienteDado);
		}

		return query;
	}

	@Override
	public boolean refreshStatusCredito(String id) {
		UUID uuidToFind = UUID.fromString(id);

		QPedidoEntity pedidos = QPedidoEntity.pedidoEntity;

		long query = select(pedidos).from(pedidos).where(pedidos.cliente.id.eq(uuidToFind)).fetchCount();

		boolean out = false;
		if (query > 0) {
			QClienteEntity cliente = QClienteEntity.clienteEntity;

			JPAQuery<ClienteEntity> queryCliente = select(cliente).from(cliente).where(cliente.id.eq(uuidToFind));

			ClienteEntity clienteDado = queryCliente.fetchFirst();

			if (clienteDado != null && clienteDado.getCreditoHabilitado() == false) {
				clienteDado.setCreditoHabilitado(true);
				clienteRepository.save(clienteDado);
			}
			
			out = clienteDado != null ? clienteDado.getCreditoHabilitado() : false;
		}

		return out;
	}
}
