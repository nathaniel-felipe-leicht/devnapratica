/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.Iterator;
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
import javax.persistence.OneToMany;
import javax.persistence.JoinTable;

@Entity
@Table(name="pedido")
public class PedidoEntity {
	
	public static final String SECURITY_RESOURCE = "res://senior.com.br/furb/basico/entities/pedido";

	/**
	 * Chave primaria
	 */
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "id", updatable = false)
	private java.util.UUID id;
	
	/**
	 * Data do pedido
	 */
	@Column(name = "data")
	private java.time.LocalDate data;
	
	/**
	 * Observações do pedido
	 */
	@Column(name = "observacoes")
	private String observacoes;
	
	/**
	 * Cliente do pedido
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente")
	private ClienteEntity cliente;
	
	/**
	 * Itens do pedido
	 */
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "pedido_itens",
	          joinColumns = @JoinColumn(name = "pedido_id", referencedColumnName = "id"),
	          inverseJoinColumns = @JoinColumn(name = "itens_id", referencedColumnName = "id"))
	private java.util.List<ItemPedidoEntity> itens;
	
	public java.util.UUID getId() {
		return id;
	}
	
	public java.time.LocalDate getData() {
		return data;
	}
	
	public String getObservacoes() {
		return observacoes;
	}
	
	public ClienteEntity getCliente() {
		return cliente;
	}
	
	public java.util.List<ItemPedidoEntity> getItens() {
		return itens;
	}
	
	public void setId(java.util.UUID id) {
		this.id = id;
	}
	
	public void setData(java.time.LocalDate data) {
		this.data = data;
	}
	
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
	
	public void setItens(java.util.List<ItemPedidoEntity> itens) {
		this.itens = itens;
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
	    if (!(obj instanceof PedidoEntity)) {
	        return false;
	    }
	    PedidoEntity other = (PedidoEntity) obj;
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
		sb.append("data=").append(data == null ? "null" : data).append(", ");
		sb.append("observacoes=").append(observacoes == null ? "null" : observacoes).append(", ");
		sb.append("cliente=<");
		if (cliente == null) {
			sb.append("null");
		} else {
			cliente.toString(sb, appended);
		}
		sb.append('>').append(", ");
		sb.append("itens=<");
		if (itens == null) {
			sb.append("null");
		} else {
			sb.append('[');
			Iterator<ItemPedidoEntity> iterator = itens.iterator();
			while (iterator.hasNext()) {
				iterator.next().toString(sb, appended);
				if (iterator.hasNext()) {
					sb.append(", ");
				}
			}
			sb.append(']');
		}
		sb.append('>');
		sb.append(']');
	}
	
}
