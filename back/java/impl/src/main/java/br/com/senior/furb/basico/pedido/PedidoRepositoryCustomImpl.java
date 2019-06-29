package br.com.senior.furb.basico.pedido;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.ItemPedidoEntity;
import br.com.senior.furb.basico.QItemPedidoEntity;
import br.com.senior.furb.basico.QMovimentoEstoqueEntity;
import br.com.senior.furb.basico.QPedidoEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class PedidoRepositoryCustomImpl extends RepositoryBaseJpa implements PedidoRepositoryCustom {

	@Override
	public double getGastoTotalCliente(String idCliente) {
		UUID uuidToFind = UUID.fromString(idCliente);

		QPedidoEntity pedidos = QPedidoEntity.pedidoEntity;
			
		JPAQuery<List<ItemPedidoEntity>> query = select(pedidos.itens).from(pedidos).where(pedidos.cliente.id.eq(uuidToFind));

		double total = 0;
		for (List<ItemPedidoEntity> itens : query.fetch()) {
			for (ItemPedidoEntity itemPedidoEntity : itens) {
				total += itemPedidoEntity.getValorTotal();
			}
		}
		return total;
	}
}
