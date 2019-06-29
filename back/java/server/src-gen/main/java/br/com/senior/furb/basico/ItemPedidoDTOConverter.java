/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import br.com.senior.custom.ConversionContext;
import br.com.senior.custom.ConvertedObjectCondition;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import br.com.senior.custom.EntityDTOConverter;

@Component("furb.basico.ItemPedidoDTOConverter")
@Lazy
public class ItemPedidoDTOConverter extends EntityDTOConverter {

	@Autowired
	private ProdutoDTOConverter produtoConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter<Produto, ProdutoEntity> produtoConverter = new ContextualizedConverter<Produto, ProdutoEntity>() {
			@Override
			public ProdutoEntity convert(Produto source) {
				return toEntity(source, ProdutoEntity.class, conversionContext);
			}
		};

		PropertyMap<ItemPedido, ItemPedidoEntity> itemPedidoMap = new PropertyMap<ItemPedido, ItemPedidoEntity>() {
			@Override
			protected void configure() {
				using(produtoConverter).map(source.produto).setProduto(null);
			}
		};
		mapper.addMappings(itemPedidoMap);
		if (mapper.getTypeMap(Produto.class, ProdutoEntity.class) == null) {
			this.produtoConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(ItemPedido.class, ItemPedidoEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter<ProdutoEntity, Produto> produtoConverter = new ContextualizedConverter<ProdutoEntity, Produto>() {
			@Override
			public Produto convert(ProdutoEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Produto.class, conversionContext.getRelationshipFields("produto"), conversionContext);
				}
				return toDTO(source, Produto.class, conversionContext.getRelationshipFields("produto"), conversionContext);
			}
		};
		
		//eager relationships
		PropertyMap<ItemPedidoEntity, ItemPedido> itemPedidoMap = new PropertyMap<ItemPedidoEntity, ItemPedido>() {
			@Override
			public void configure() {
				using(produtoConverter).map(source.getProduto(), destination.produto);
			}
		};
		//lazy relationships
		
		mapper.addMappings(itemPedidoMap);
		
		if (mapper.getTypeMap(ProdutoEntity.class, Produto.class) == null) {
		    this.produtoConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(ItemPedidoEntity.class, ItemPedido.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
