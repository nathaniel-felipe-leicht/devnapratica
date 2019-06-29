/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Produto.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface ProdutoCrudService extends CrudService<ProdutoEntity> {
	
	public ProdutoEntity createProduto(ProdutoEntity toCreate);
	
	@Deprecated
	public ProdutoEntity createMergeProduto(ProdutoEntity toCreateMerge);
	
	public ProdutoEntity updateProduto(ProdutoEntity toUpdate);
	
	@Deprecated
	public ProdutoEntity updateMergeProduto(ProdutoEntity toUpdateMerge);
	
	public void deleteProduto(Id id);
	
	public ProdutoEntity retrieveProduto(Id id);
	
	@Deprecated
	public List<ProdutoEntity> listProduto(int skip, int top);
	
	public Page<ProdutoEntity> listProdutoPageable(int skip, int top);
	
	public Page<ProdutoEntity> listProdutoPageable(int skip, int top, String orderBy);
	
	public Page<ProdutoEntity> listProdutoPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkProduto(List<ProdutoEntity> entities);

	public ProdutoBaseRepository getRepository();
	
}
