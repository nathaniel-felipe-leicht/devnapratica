package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class GetGastoTotalClienteOutput {
    
    /**
     * Total
     */
    public Double total;
    
    public GetGastoTotalClienteOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public GetGastoTotalClienteOutput(Double total) {
        this.total = total;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
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
        if (total != null) {
            ret = 31 * ret + total.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetGastoTotalClienteOutput)) {
            return false;
        }
        GetGastoTotalClienteOutput other = (GetGastoTotalClienteOutput) obj;
        if ((total == null) != (other.total == null)) {
            return false;
        }
        if ((total != null) && !total.equals(other.total)) {
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
    	sb.append("total=").append(total == null ? "null" : total);
    	sb.append(']');
    }
    
}
