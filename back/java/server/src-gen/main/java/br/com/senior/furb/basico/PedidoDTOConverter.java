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

@Component("furb.basico.PedidoDTOConverter")
@Lazy
public class PedidoDTOConverter extends EntityDTOConverter {

	@Autowired
	private ClienteDTOConverter clienteConverter;
	@Autowired
	private ItemPedidoDTOConverter itemPedidoConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter<Cliente, ClienteEntity> clienteConverter = new ContextualizedConverter<Cliente, ClienteEntity>() {
			@Override
			public ClienteEntity convert(Cliente source) {
				return toEntity(source, ClienteEntity.class, conversionContext);
			}
		};
		Converter <List<ItemPedido>, List<ItemPedidoEntity>> itensConverter = new ContextualizedConverter<List<ItemPedido>, List<ItemPedidoEntity>>() {
			@Override
			public List<ItemPedidoEntity> convert(List<ItemPedido> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, ItemPedidoEntity.class, conversionContext)).collect(Collectors.toList());
			}
		};

		PropertyMap<Pedido, PedidoEntity> pedidoMap = new PropertyMap<Pedido, PedidoEntity>() {
			@Override
			protected void configure() {
				using(clienteConverter).map(source.cliente).setCliente(null);
				using(itensConverter).map(source.itens).setItens(null);
			}
		};
		mapper.addMappings(pedidoMap);
		if (mapper.getTypeMap(Cliente.class, ClienteEntity.class) == null) {
			this.clienteConverter.setupMapperToEntity(mapper, conversionContext);
		}
		if (mapper.getTypeMap(ItemPedido.class, ItemPedidoEntity.class) == null) {
			this.itemPedidoConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Pedido.class, PedidoEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter<ClienteEntity, Cliente> clienteConverter = new ContextualizedConverter<ClienteEntity, Cliente>() {
			@Override
			public Cliente convert(ClienteEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Cliente.class, conversionContext.getRelationshipFields("cliente"), conversionContext);
				}
				return toDTO(source, Cliente.class, conversionContext.getRelationshipFields("cliente"), conversionContext);
			}
		};
		
		
		Converter <List<ItemPedidoEntity>, List<ItemPedido>> itensConverter = new ContextualizedConverter<List<ItemPedidoEntity>, List<ItemPedido>>() {
			@Override
			public List<ItemPedido> convert(List<ItemPedidoEntity> source) {
				if (conversionContext.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, ItemPedido.class, conversionContext.getRelationshipFields("itens"), conversionContext)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, ItemPedido.class, conversionContext.getRelationshipFields("itens"), conversionContext)).collect(Collectors.toList());
			}
		};
		
		//eager relationships
		PropertyMap<PedidoEntity, Pedido> pedidoMap = new PropertyMap<PedidoEntity, Pedido>() {
			@Override
			public void configure() {
				using(clienteConverter).map(source.getCliente(), destination.cliente);
				using(itensConverter).map(source.getItens(), destination.itens);
			}
		};
		//lazy relationships
		
		mapper.addMappings(pedidoMap);
		
		if (mapper.getTypeMap(ClienteEntity.class, Cliente.class) == null) {
		    this.clienteConverter.setupMapperToDTO(mapper, conversionContext);
		}
		if (mapper.getTypeMap(ItemPedidoEntity.class, ItemPedido.class) == null) {
		    this.itemPedidoConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(PedidoEntity.class, Pedido.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
