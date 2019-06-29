package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import br.com.senior.messaging.model.EntityDescription;
import br.com.senior.messaging.model.EntityId;

/**
 * Produto
 */
@EntityDescription
public class Produto {
    
    public static class Id {
    	
        public String id;
        
        public Id() {
        }
        
        public Id(String produtoId) {
            this.id = produtoId;
        }
        
        public String getProdutoId() {
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
    	
        public List<Produto> contents;
        
        public PagedResults() {
        }
        
        public PagedResults(List<Produto> contents) {
            this.contents = contents;
        }
        
        public PagedResults(List<Produto> contents, Long totalPages, Long totalElements) {
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
     * Chave primária
     */
    public String id;
    /**
     * descrição
     */
    public String descricao;
    /**
     * valor unitário
     */
    public Double valorUnitario;
    
    public Produto() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public Produto(String id, String descricao, Double valorUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }
    /** 
     * This convenience constructor allows initialization of all required fields.
     */
    public Produto(String descricao, Double valorUnitario) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
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
        if (!(obj instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) obj;
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
    	sb.append("descricao=").append(descricao == null ? "null" : descricao).append(", ");
    	sb.append("valorUnitario=").append(valorUnitario == null ? "null" : valorUnitario);
    	sb.append(']');
    }
    
}
