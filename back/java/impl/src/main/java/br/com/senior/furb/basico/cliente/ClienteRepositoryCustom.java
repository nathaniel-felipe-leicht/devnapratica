package br.com.senior.furb.basico.cliente;

public interface ClienteRepositoryCustom {

	boolean refreshStatusCredito(String id);

	long refreshQtdPedidosCliente(String id);
	
}
