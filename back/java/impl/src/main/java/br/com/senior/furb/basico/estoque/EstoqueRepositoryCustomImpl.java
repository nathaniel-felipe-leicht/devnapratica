package br.com.senior.furb.basico.estoque;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;

import br.com.senior.furb.basico.ClienteBaseRepository;
import br.com.senior.furb.basico.ClienteEntity;
import br.com.senior.furb.basico.MovimentoEstoqueBaseRepository;
import br.com.senior.furb.basico.QClienteEntity;
import br.com.senior.furb.basico.QItemPedidoEntity;
import br.com.senior.furb.basico.QMovimentoEstoqueEntity;
import br.com.senior.furb.basico.QPedidoEntity;
import br.com.senior.furb.basico.core.RepositoryBaseJpa;

@Repository
public class EstoqueRepositoryCustomImpl extends RepositoryBaseJpa implements EstoqueRepositoryCustom {

	@Autowired
	private MovimentoEstoqueBaseRepository movimentoEstoqueRepository;

	@Override
	public double getSaldo(String produtoId) {
		UUID uuidToFind = UUID.fromString(produtoId);
		
		QItemPedidoEntity itens = QItemPedidoEntity.itemPedidoEntity;
		JPAQuery<Double> query = select(itens.quantidade).from(itens).where(itens.produto.id.eq(uuidToFind));

		double totalPedidos = 0;
		for (Double qt : query.fetch())
		{
			totalPedidos += qt;
		}
		
		QMovimentoEstoqueEntity movimentosEstoque = QMovimentoEstoqueEntity.movimentoEstoqueEntity;
		query = select(movimentosEstoque.quantidade).from(movimentosEstoque).where(movimentosEstoque.produto.id.eq(uuidToFind));
		
		double totalMovimentos = 0;
		for (Double qt : query.fetch())
		{
			totalMovimentos += qt;
		}
		
		return totalMovimentos - totalPedidos;
	}

}
