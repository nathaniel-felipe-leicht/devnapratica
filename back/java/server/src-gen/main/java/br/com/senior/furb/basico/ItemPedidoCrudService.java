/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.ItemPedido.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface ItemPedidoCrudService extends CrudService<ItemPedidoEntity> {
	
	public ItemPedidoEntity createItemPedido(ItemPedidoEntity toCreate);
	
	@Deprecated
	public ItemPedidoEntity createMergeItemPedido(ItemPedidoEntity toCreateMerge);
	
	public ItemPedidoEntity updateItemPedido(ItemPedidoEntity toUpdate);
	
	@Deprecated
	public ItemPedidoEntity updateMergeItemPedido(ItemPedidoEntity toUpdateMerge);
	
	public void deleteItemPedido(Id id);
	
	public ItemPedidoEntity retrieveItemPedido(Id id);
	
	@Deprecated
	public List<ItemPedidoEntity> listItemPedido(int skip, int top);
	
	public Page<ItemPedidoEntity> listItemPedidoPageable(int skip, int top);
	
	public Page<ItemPedidoEntity> listItemPedidoPageable(int skip, int top, String orderBy);
	
	public Page<ItemPedidoEntity> listItemPedidoPageable(int skip, int top, String orderBy, String filter);
	
	public Page<ItemPedidoEntity> listItemPedidoPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkItemPedido(List<ItemPedidoEntity> entities);

	public ItemPedidoBaseRepository getRepository();
	
}
