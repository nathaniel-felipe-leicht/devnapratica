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

	@Override
	public GetSaldoOutput getSaldo(GetSaldoInput request) {
		
		GetSaldoOutput out = new GetSaldoOutput();
		
		out.qtd = estoqueRepositoryCustom.getSaldo(request.idProduto);
		
		return out;
	}
}
