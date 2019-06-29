/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.MovimentoEstoque.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface MovimentoEstoqueCrudService extends CrudService<MovimentoEstoqueEntity> {
	
	public MovimentoEstoqueEntity createMovimentoEstoque(MovimentoEstoqueEntity toCreate);
	
	@Deprecated
	public MovimentoEstoqueEntity createMergeMovimentoEstoque(MovimentoEstoqueEntity toCreateMerge);
	
	public MovimentoEstoqueEntity updateMovimentoEstoque(MovimentoEstoqueEntity toUpdate);
	
	@Deprecated
	public MovimentoEstoqueEntity updateMergeMovimentoEstoque(MovimentoEstoqueEntity toUpdateMerge);
	
	public void deleteMovimentoEstoque(Id id);
	
	public MovimentoEstoqueEntity retrieveMovimentoEstoque(Id id);
	
	@Deprecated
	public List<MovimentoEstoqueEntity> listMovimentoEstoque(int skip, int top);
	
	public Page<MovimentoEstoqueEntity> listMovimentoEstoquePageable(int skip, int top);
	
	public Page<MovimentoEstoqueEntity> listMovimentoEstoquePageable(int skip, int top, String orderBy);
	
	public Page<MovimentoEstoqueEntity> listMovimentoEstoquePageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkMovimentoEstoque(List<MovimentoEstoqueEntity> entities);

	public MovimentoEstoqueBaseRepository getRepository();
	
}
