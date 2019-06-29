package br.com.senior.furb.basico.estoque;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.furb.basico.GetSaldo;
import br.com.senior.furb.basico.GetSaldoInput;
import br.com.senior.furb.basico.GetSaldoOutput;
import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class HandlerEstoqueImpl implements GetSaldo {

	@Autowired
	EstoqueRepositoryCustom estoqueRepositoryCustom;

	
	/*
	 * @Override public RetornaEstoqueOutput retornaEstoque(RetornaEstoqueInput
	 * request) {
	 * 
	 * RetornaEstoqueOutput dados = new RetornaEstoqueOutput();
	 * 
	 * Long qtdItensEncontrados =
	 * estoqueRepositoryCustom.findQuantityById(request.idPedido);
	 * 
	 * if (qtdItensEncontrados == 0) { dados.message =
	 * "Não foram encontrados produtos em estoque"; } else { dados.qtd =
	 * qtdItensEncontrados; dados.message = "Estoque aprovado"; }
	 * 
	 * return dados; }
	 */

	@Override
	public GetSaldoOutput getSaldo(GetSaldoInput request) {
		
		GetSaldoOutput out = new GetSaldoOutput();
		
		out.qtd = estoqueRepositoryCustom.getSaldo(request.idProduto);
		
		return null;
	}
}
