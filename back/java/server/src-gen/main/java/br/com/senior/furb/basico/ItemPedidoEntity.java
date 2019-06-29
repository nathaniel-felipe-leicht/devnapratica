/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="item_pedido")
public class ItemPedidoEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/itemPedido";

	/**
	 * Chave primaria
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * Item do Item Pedido
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "produto")
	private ProdutoEntity produto;
	
	/**
	 * Quantidade do Item
	 */
	@Column(name = "quantidade")
	private Double quantidade;
	
	/**
	 * Valor total
	 */
	@Column(name = "valor_total")
	private Double valorTotal;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public ProdutoEntity getProduto() {
		return produto;
	}
	
	public Double getQuantidade() {
		return quantidade;
	}
	
	public Double getValorTotal() {
		return valorTotal;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setProduto(ProdutoEntity produto) {
		this.produto = produto;
	}
	
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public int hashCode() {
	    int ret = 1;
	    if (id != null) {
	        ret = 31 * ret + id.hashCode();
	    }
	    return ret;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof ItemPedidoEntity)) {
	        return false;
	    }
	    ItemPedidoEntity other = (ItemPedidoEntity) obj;
	    if ((id == null) != (other.id == null)) {
	        return false;
	    }
	    if ((id != null) && !id.equals(other.id)) {
	        return false;
	    }
	    return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		toString(sb, new ArrayList<>());
		return sb.toString();
	}
	
	void toString(StringBuilder sb, List<Object> appended) {
		sb.append(getClass().getSimpleName()).append(" [");
		if (appended.contains(this)) {
			sb.append("<Previously appended object>").append(']');
			return;
		}
		appended.add(this);
		sb.append("id=").append(id == null ? "null" : id).append(", ");
		sb.append("produto=<");
		if (produto == null) {
			sb.append("null");
		} else {
			produto.toString(sb, appended);
		}
		sb.append('>').append(", ");
		sb.append("quantidade=").append(quantidade == null ? "null" : quantidade).append(", ");
		sb.append("valorTotal=").append(valorTotal == null ? "null" : valorTotal);
		sb.append(']');
	}
	
}
