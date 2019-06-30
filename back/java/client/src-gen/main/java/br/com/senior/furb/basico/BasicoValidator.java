/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.messaging.Message;

/**
 * Validators for payloads accepted/produced by endpoints in basico.
 */
public class BasicoValidator {
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetSaldoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetSaldoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetSaldoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetSaldoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.idProduto == null) {
    			throw new IllegalArgumentException("idProduto is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetSaldoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetSaldoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetSaldoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetSaldoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.qtd == null) {
    			throw new IllegalArgumentException("qtd is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetGastoTotalClienteInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetGastoTotalClienteInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetGastoTotalClienteInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetGastoTotalClienteInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.idCliente == null) {
    			throw new IllegalArgumentException("idCliente is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetGastoTotalClienteOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetGastoTotalClienteOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetGastoTotalClienteOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetGastoTotalClienteOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.total == null) {
    			throw new IllegalArgumentException("total is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.RefreshStatusCreditoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RefreshStatusCreditoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RefreshStatusCreditoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.RefreshStatusCreditoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.idCliente == null) {
    			throw new IllegalArgumentException("idCliente is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.RefreshStatusCreditoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RefreshStatusCreditoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RefreshStatusCreditoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.RefreshStatusCreditoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.RefreshQtdPedidosClienteInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RefreshQtdPedidosClienteInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RefreshQtdPedidosClienteInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.RefreshQtdPedidosClienteInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.idCliente == null) {
    			throw new IllegalArgumentException("idCliente is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.RefreshQtdPedidosClienteOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RefreshQtdPedidosClienteOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.RefreshQtdPedidosClienteOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.RefreshQtdPedidosClienteOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.qtd == null) {
    			throw new IllegalArgumentException("qtd is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Cliente toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Cliente toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Cliente toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Cliente toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toValidate != null && toValidate.id != null && !toValidate.id.toString().equals(entityId)) {
    			throw new IllegalArgumentException("Payload id '" + toValidate.id + "' differs from header id '" + entityId + "'.");
    		}
    	}
    	if (required) {
    		if (toValidate.nome == null) {
    			throw new IllegalArgumentException("nome is required");
    		}
    	}
    	if (required) {
    		if (toValidate.dataNascimento == null) {
    			throw new IllegalArgumentException("dataNascimento is required");
    		}
    	}
    	if (required) {
    		if (toValidate.cpf == null) {
    			throw new IllegalArgumentException("cpf is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Produto toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Produto toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Produto toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Produto toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toValidate != null && toValidate.id != null && !toValidate.id.toString().equals(entityId)) {
    			throw new IllegalArgumentException("Payload id '" + toValidate.id + "' differs from header id '" + entityId + "'.");
    		}
    	}
    	if (required) {
    		if (toValidate.descricao == null) {
    			throw new IllegalArgumentException("descricao is required");
    		}
    	}
    	if (required) {
    		if (toValidate.valorUnitario == null) {
    			throw new IllegalArgumentException("valorUnitario is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ItemPedido toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ItemPedido toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ItemPedido toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ItemPedido toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toValidate != null && toValidate.id != null && !toValidate.id.toString().equals(entityId)) {
    			throw new IllegalArgumentException("Payload id '" + toValidate.id + "' differs from header id '" + entityId + "'.");
    		}
    	}
    	if (required) {
    		if (toValidate.produto == null) {
    			throw new IllegalArgumentException("produto is required");
    		}
    		if (toValidate.produto.id == null) {
    			throw new IllegalArgumentException("produto.id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.quantidade == null) {
    			throw new IllegalArgumentException("quantidade is required");
    		}
    	}
    	if (required) {
    		if (toValidate.valorTotal == null) {
    			throw new IllegalArgumentException("valorTotal is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Pedido toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Pedido toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Pedido toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Pedido toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toValidate != null && toValidate.id != null && !toValidate.id.toString().equals(entityId)) {
    			throw new IllegalArgumentException("Payload id '" + toValidate.id + "' differs from header id '" + entityId + "'.");
    		}
    	}
    	if (required) {
    		if (toValidate.data == null) {
    			throw new IllegalArgumentException("data is required");
    		}
    	}
    	if (required) {
    		if (toValidate.cliente == null) {
    			throw new IllegalArgumentException("cliente is required");
    		}
    		if (toValidate.cliente.id == null) {
    			throw new IllegalArgumentException("cliente.id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.itens == null || toValidate.itens.isEmpty()) {
    			throw new IllegalArgumentException("itens is required, at least one value must be present");
    		}
    		for (ItemPedido it : toValidate.itens) {
    			if (it.id == null) {
    				throw new IllegalArgumentException("itens[].id is required");
    			}
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.MovimentoEstoque toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.MovimentoEstoque toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.MovimentoEstoque toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.MovimentoEstoque toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (headers != null) {
    		String entityId = headers.containsKey(Message.ENTITY_ID_HEADER) ? headers.get(Message.ENTITY_ID_HEADER).toString() : null;
    		if (entityId != null && toValidate != null && toValidate.id != null && !toValidate.id.toString().equals(entityId)) {
    			throw new IllegalArgumentException("Payload id '" + toValidate.id + "' differs from header id '" + entityId + "'.");
    		}
    	}
    	if (required) {
    		if (toValidate.produto == null) {
    			throw new IllegalArgumentException("produto is required");
    		}
    		if (toValidate.produto.id == null) {
    			throw new IllegalArgumentException("produto.id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.quantidade == null) {
    			throw new IllegalArgumentException("quantidade is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ServiceStartedPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ServiceStartedPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ServiceStartedPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ServiceStartedPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.domain == null) {
    			throw new IllegalArgumentException("domain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.service == null) {
    			throw new IllegalArgumentException("service is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.NotifyUserEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.NotifyUserEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.NotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.NotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.notificationKind == null) {
    			throw new IllegalArgumentException("notificationKind is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationPriority == null) {
    			throw new IllegalArgumentException("notificationPriority is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationSubject == null) {
    			throw new IllegalArgumentException("notificationSubject is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationContent == null) {
    			throw new IllegalArgumentException("notificationContent is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceDomain == null) {
    			throw new IllegalArgumentException("sourceDomain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceService == null) {
    			throw new IllegalArgumentException("sourceService is required");
    		}
    	}
    	if (required) {
    		if (toValidate.destinationUser == null) {
    			throw new IllegalArgumentException("destinationUser is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.EmailNotifyUserEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.EmailNotifyUserEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.EmailNotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.EmailNotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.notificationKind == null) {
    			throw new IllegalArgumentException("notificationKind is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationPriority == null) {
    			throw new IllegalArgumentException("notificationPriority is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationSubject == null) {
    			throw new IllegalArgumentException("notificationSubject is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationContent == null) {
    			throw new IllegalArgumentException("notificationContent is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceDomain == null) {
    			throw new IllegalArgumentException("sourceDomain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceService == null) {
    			throw new IllegalArgumentException("sourceService is required");
    		}
    	}
    	if (required) {
    		if (toValidate.destinationUser == null) {
    			throw new IllegalArgumentException("destinationUser is required");
    		}
    	}
    	if (required) {
    		if (toValidate.from == null) {
    			throw new IllegalArgumentException("from is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.PushNotifyUserEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.PushNotifyUserEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.PushNotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.PushNotifyUserEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.notificationKind == null) {
    			throw new IllegalArgumentException("notificationKind is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationPriority == null) {
    			throw new IllegalArgumentException("notificationPriority is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationSubject == null) {
    			throw new IllegalArgumentException("notificationSubject is required");
    		}
    	}
    	if (required) {
    		if (toValidate.notificationContent == null) {
    			throw new IllegalArgumentException("notificationContent is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceDomain == null) {
    			throw new IllegalArgumentException("sourceDomain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.sourceService == null) {
    			throw new IllegalArgumentException("sourceService is required");
    		}
    	}
    	if (required) {
    		if (toValidate.destinationUser == null) {
    			throw new IllegalArgumentException("destinationUser is required");
    		}
    	}
    	if (required) {
    		if (toValidate.applicationId == null) {
    			throw new IllegalArgumentException("applicationId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetMetadataOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.metadata == null) {
    			throw new IllegalArgumentException("metadata is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.BlobReference toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.BlobReference toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.BlobReference toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.BlobReference toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.targetObjectId == null) {
    			throw new IllegalArgumentException("targetObjectId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.BasicErrorPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.BasicErrorPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.BasicErrorPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.BasicErrorPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportError toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportError toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportError toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportError toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.errorType == null) {
    			throw new IllegalArgumentException("errorType is required");
    		}
    	}
    	if (required) {
    		if (toValidate.lineNumber == null) {
    			throw new IllegalArgumentException("lineNumber is required");
    		}
    	}
    	if (required) {
    		if (toValidate.bean == null) {
    			throw new IllegalArgumentException("bean is required");
    		}
    	}
    	if (required) {
    		if (toValidate.message == null) {
    			throw new IllegalArgumentException("message is required");
    		}
    	}
    	if (required) {
    		if (toValidate.exceptionClass == null) {
    			throw new IllegalArgumentException("exceptionClass is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Fielddto toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Fielddto toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Fielddto toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Fielddto toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.id == null) {
    			throw new IllegalArgumentException("id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.name == null) {
    			throw new IllegalArgumentException("name is required");
    		}
    	}
    	if (required) {
    		if (toValidate.fieldType == null) {
    			throw new IllegalArgumentException("fieldType is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Hookdto toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Hookdto toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Hookdto toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Hookdto toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.hookFunction == null) {
    			throw new IllegalArgumentException("hookFunction is required");
    		}
    	}
    	if (required) {
    		if (toValidate.script == null) {
    			throw new IllegalArgumentException("script is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Layoutdto toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Layoutdto toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Layoutdto toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Layoutdto toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.id == null) {
    			throw new IllegalArgumentException("id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.description == null) {
    			throw new IllegalArgumentException("description is required");
    		}
    	}
    	if (required) {
    		if (toValidate.fileFormat == null) {
    			throw new IllegalArgumentException("fileFormat is required");
    		}
    	}
    	if (required) {
    		if (toValidate.errorStrategy == null) {
    			throw new IllegalArgumentException("errorStrategy is required");
    		}
    	}
    	if (required) {
    		if (toValidate.skipLines == null) {
    			throw new IllegalArgumentException("skipLines is required");
    		}
    	}
    	if (required) {
    		if (toValidate.fields == null || toValidate.fields.isEmpty()) {
    			throw new IllegalArgumentException("fields is required, at least one value must be present");
    		}
    		for (Fielddto it : toValidate.fields) {
    			it.validate(null, required, validated);
    		}
    	}
    	if (toValidate.hooks != null) {
    		for (Hookdto it : toValidate.hooks) {
    			it.validate(null, true, validated);
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportReport toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportReport toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportReport toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportReport toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.id == null) {
    			throw new IllegalArgumentException("id is required");
    		}
    	}
    	if (required) {
    		if (toValidate.startTime == null) {
    			throw new IllegalArgumentException("startTime is required");
    		}
    	}
    	if (required) {
    		if (toValidate.endTime == null) {
    			throw new IllegalArgumentException("endTime is required");
    		}
    	}
    	if (required) {
    		if (toValidate.uri == null) {
    			throw new IllegalArgumentException("uri is required");
    		}
    	}
    	if (required) {
    		if (toValidate.beanClass == null) {
    			throw new IllegalArgumentException("beanClass is required");
    		}
    	}
    	if (required) {
    		if (toValidate.serviceClass == null) {
    			throw new IllegalArgumentException("serviceClass is required");
    		}
    	}
    	if (required) {
    		if (toValidate.layout == null) {
    			throw new IllegalArgumentException("layout is required");
    		}
    		toValidate.layout.validate(null, required, validated);
    	}
    	if (required) {
    		if (toValidate.sucessCount == null) {
    			throw new IllegalArgumentException("sucessCount is required");
    		}
    	}
    	if (required) {
    		if (toValidate.errorsCount == null) {
    			throw new IllegalArgumentException("errorsCount is required");
    		}
    	}
    	if (required) {
    		if (toValidate.filteredCount == null) {
    			throw new IllegalArgumentException("filteredCount is required");
    		}
    	}
    	if (required) {
    		if (toValidate.skippedCount == null) {
    			throw new IllegalArgumentException("skippedCount is required");
    		}
    	}
    	if (toValidate.importErrors != null) {
    		for (ImportError it : toValidate.importErrors) {
    			it.validate(null, true, validated);
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportEventStatus toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportEventStatus toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportEventStatus toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportEventStatus toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importerId == null) {
    			throw new IllegalArgumentException("importerId is required");
    		}
    	}
    	if (required) {
    		if (toValidate.eventType == null) {
    			throw new IllegalArgumentException("eventType is required");
    		}
    	}
    	if (required) {
    		if (toValidate.recordCount == null) {
    			throw new IllegalArgumentException("recordCount is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportEventStatus toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportEventStatus toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportEventStatus toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportEventStatus toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importerId == null) {
    			throw new IllegalArgumentException("importerId is required");
    		}
    	}
    	if (required) {
    		if (toValidate.eventType == null) {
    			throw new IllegalArgumentException("eventType is required");
    		}
    	}
    	if (required) {
    		if (toValidate.status == null) {
    			throw new IllegalArgumentException("status is required");
    		}
    	}
    	if (required) {
    		if (toValidate.recordCount == null) {
    			throw new IllegalArgumentException("recordCount is required");
    		}
    	}
    	if (required) {
    		if (toValidate.importReport != null) {
    			toValidate.importReport.validate(null, true, validated);
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportConfig toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportConfig toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportConfig toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportConfig toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.uri == null) {
    			throw new IllegalArgumentException("uri is required");
    		}
    	}
    	if (required) {
    		if (toValidate.layout == null) {
    			throw new IllegalArgumentException("layout is required");
    		}
    		toValidate.layout.validate(null, required, validated);
    	}
    	if (required) {
    		if (toValidate.async == null) {
    			throw new IllegalArgumentException("async is required");
    		}
    	}
    	if (required) {
    		if (toValidate.errorStrategy == null) {
    			throw new IllegalArgumentException("errorStrategy is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportConfig toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportConfig toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportConfig toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportConfig toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.uri == null) {
    			throw new IllegalArgumentException("uri is required");
    		}
    	}
    	if (required) {
    		if (toValidate.layout == null) {
    			throw new IllegalArgumentException("layout is required");
    		}
    		toValidate.layout.validate(null, required, validated);
    	}
    	if (required) {
    		if (toValidate.async == null) {
    			throw new IllegalArgumentException("async is required");
    		}
    	}
    	if (required) {
    		if (toValidate.batchSize == null) {
    			throw new IllegalArgumentException("batchSize is required");
    		}
    	}
    	if (required) {
    		if (toValidate.errorStrategy == null) {
    			throw new IllegalArgumentException("errorStrategy is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importJobId == null) {
    			throw new IllegalArgumentException("importJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.exportJobId == null) {
    			throw new IllegalArgumentException("exportJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportClienteEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportClienteEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importJobId == null) {
    			throw new IllegalArgumentException("importJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.exportJobId == null) {
    			throw new IllegalArgumentException("exportJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportProdutoEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportProdutoEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importJobId == null) {
    			throw new IllegalArgumentException("importJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.exportJobId == null) {
    			throw new IllegalArgumentException("exportJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportItemPedidoEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportItemPedidoEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importJobId == null) {
    			throw new IllegalArgumentException("importJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.exportJobId == null) {
    			throw new IllegalArgumentException("exportJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportPedidoEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportPedidoEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.importJobId == null) {
    			throw new IllegalArgumentException("importJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.config == null) {
    			throw new IllegalArgumentException("config is required");
    		}
    		toValidate.config.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.exportJobId == null) {
    			throw new IllegalArgumentException("exportJobId is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ImportMovimentoEstoqueEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueEventPayload toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueEventPayload toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueEventPayload toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.ExportMovimentoEstoqueEventPayload toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.eventpl == null) {
    			throw new IllegalArgumentException("eventpl is required");
    		}
    		toValidate.eventpl.validate(null, required, validated);
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.Dependency toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Dependency toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.Dependency toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.Dependency toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.domain == null) {
    			throw new IllegalArgumentException("domain is required");
    		}
    	}
    	if (required) {
    		if (toValidate.service == null) {
    			throw new IllegalArgumentException("service is required");
    		}
    	}
    	if (required) {
    		if (toValidate.version == null) {
    			throw new IllegalArgumentException("version is required");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.GetDependenciesOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetDependenciesOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.GetDependenciesOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.GetDependenciesOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.dependencies == null || toValidate.dependencies.isEmpty()) {
    			throw new IllegalArgumentException("dependencies is required, at least one value must be present");
    		}
    		for (Dependency it : toValidate.dependencies) {
    			it.validate(null, required, validated);
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkClienteInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkClienteInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkClienteInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkClienteInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.entities == null || toValidate.entities.isEmpty()) {
    			throw new IllegalArgumentException("entities is required, at least one value must be present");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkClienteOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkClienteOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkClienteOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkClienteOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkProdutoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkProdutoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkProdutoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkProdutoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.entities == null || toValidate.entities.isEmpty()) {
    			throw new IllegalArgumentException("entities is required, at least one value must be present");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkProdutoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkProdutoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkProdutoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkProdutoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkItemPedidoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkItemPedidoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkItemPedidoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkItemPedidoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.entities == null || toValidate.entities.isEmpty()) {
    			throw new IllegalArgumentException("entities is required, at least one value must be present");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkItemPedidoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkItemPedidoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkItemPedidoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkItemPedidoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkPedidoInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkPedidoInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkPedidoInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkPedidoInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.entities == null || toValidate.entities.isEmpty()) {
    			throw new IllegalArgumentException("entities is required, at least one value must be present");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkPedidoOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkPedidoOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkPedidoOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkPedidoOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkMovimentoEstoqueInput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkMovimentoEstoqueInput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkMovimentoEstoqueInput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkMovimentoEstoqueInput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    	if (required) {
    		if (toValidate.entities == null || toValidate.entities.isEmpty()) {
    			throw new IllegalArgumentException("entities is required, at least one value must be present");
    		}
    	}
    }
    /**
     * Validates the payload for required fields and valid values.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkMovimentoEstoqueOutput toValidate) {
    	validate(toValidate, true);
    }
    
    /**
     * Validates the payload for valid values and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkMovimentoEstoqueOutput toValidate, boolean required) {
    	validate(toValidate, null, true);
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkMovimentoEstoqueOutput toValidate, Map<String, Object> headers, boolean required) {
    	validate(toValidate, headers, required, new ArrayList<>());
    }
    
    /**
     * Validates the payload for valid values using message headers and checks for required fields if required argument is true ignoring if already validated.
     */
    public static void validate(br.com.senior.furb.basico.CreateBulkMovimentoEstoqueOutput toValidate, Map<String, Object> headers, boolean required, List<Object> validated) {
    	if (validated.contains(toValidate)) {
    		return;
    	}
    	validated.add(toValidate);
    	
    }
}
