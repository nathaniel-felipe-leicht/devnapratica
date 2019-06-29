package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;

/**
 * ItemPedido
 */
@EntityDescription
public class ItemPedido {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String itemPedidoId) {
            this.id = itemPedidoId;
        }
        
        public String getItemPedidoId() {
            return id;
        }
        
        public String getId() {
            return id;
        }
        
    	public void normalize(Map<String, Object> headers) {
    		BasicoNormalizer.normalize(this, headers);
    	}
    	
    }
    
    public static class PagedResults {
    	public Long totalPages;
    	public Long totalElements;
    	
        public List<ItemPedido> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<ItemPedido> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<ItemPedido> contents, Long totalPages, Long totalElements) {
            this.contents = contents;
            this.totalPages = totalPages;
            this.totalElements = totalElements;
        }
    }
    
    public static class PageRequest {
        public Long offset;
        public Long size;
        public boolean translations;
        public String orderBy;
        public String filter;
        public List<String> displayFields;
        
        public PageRequest() {
        }
        
        public PageRequest(Long offset, Long size) {
            this(offset, size, null, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy) {
            this(offset, size, orderBy, null);
        }
        
        public PageRequest(Long offset, Long size, String orderBy, String filter) {
            this(offset, size, orderBy, filter, null);
       	}
        
        public PageRequest(Long offset, Long size, String orderBy, String filter, List<String> displayFields) {
        	this.offset = offset;
        	this.size = size;
        	this.orderBy = orderBy;
        	this.filter = filter;
        	this.displayFields = displayFields;
        }
    }

    @EntityId
    /**
     * Chave primaria
     */
    public String id;
    /**
     * Item do Item Pedido
     */
    public Produto produto;
    /**
     * Quantidade do Item
     */
    public Double quantidade;
    /**
     * Valor total
     */
    public Double valorTotal;
    
    public ItemPedido() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public ItemPedido(String id, Produto produto, Double quantidade, Double valorTotal) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public ItemPedido(Produto produto, Double quantidade, Double valorTotal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }
    
    public void normalize(Map<String, Object> headers) {
    	BasicoNormalizer.normalize(this, headers);
    }
    
    public void validate() {
    	validate(true);
    }
    
    public void validate(boolean required) {
    	validate(null, true);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	BasicoValidator.validate(this, headers, required, validated);
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
        if (!(obj instanceof ItemPedido)) {
            return false;
        }
        ItemPedido other = (ItemPedido) obj;
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
