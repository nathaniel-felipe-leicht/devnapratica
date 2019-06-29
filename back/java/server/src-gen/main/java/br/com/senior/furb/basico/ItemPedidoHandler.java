/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_CREATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_DELETE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_VIEW;
import static br.com.senior.furb.basico.ItemPedidoEntity.SECURITY_RESOURCE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.springbatchintegration.control.BatchIntegrationController;
import br.com.senior.springbatchintegration.importer.Importer;
import br.com.senior.springbatchintegration.importer.ImporterException;
import br.com.senior.springbatchintegration.model.Layout;
import br.com.senior.furb.basico.ItemPedido;
import br.com.senior.furb.basico.ItemPedido.Id;
import br.com.senior.furb.basico.ItemPedido.PageRequest;
import br.com.senior.furb.basico.ItemPedido.PagedResults;
import br.com.senior.furb.basico.BasicoConstants;
import br.com.senior.furb.basico.CreateItemPedido;
import br.com.senior.furb.basico.UpdateItemPedido;
import br.com.senior.furb.basico.DeleteItemPedido;
import br.com.senior.furb.basico.RetrieveItemPedido;
import br.com.senior.furb.basico.ListItemPedido;
import br.com.senior.furb.basico.ImportConfig;
import br.com.senior.furb.basico.LayoutDTOConverter;
import br.com.senior.furb.basico.ImportItemPedidoInput;
import br.com.senior.furb.basico.ImportItemPedidoOutput;
import br.com.senior.furb.basico.ExportItemPedidoInput;
import br.com.senior.furb.basico.ExportItemPedidoOutput;
import org.springframework.stereotype.Component;
import br.com.senior.furb.basico.ItemPedidoDTOConverter;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

@HandlerImpl(serviceClass = BasicoConstants.class)
@Component("furb.basico.ItemPedidoHandler")
public class ItemPedidoHandler implements CreateItemPedido, CreateMergeItemPedido, UpdateItemPedido, DeleteItemPedido, 
		 UpdateMergeItemPedido, CreateBulkItemPedido, RetrieveItemPedido, ListItemPedido, 
		 ImportItemPedido, ExportItemPedido {
	static final Logger logger = LoggerFactory.getLogger(ItemPedidoHandler.class);

	@Inject
	ItemPedidoCrudService service;
	
	@Inject
	ItemPedidoDTOConverter dtoConverter;
	
	@Inject
	private TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public ItemPedido createItemPedido(ItemPedido toCreate) {
		try {
			ItemPedidoEntity entity = service.createItemPedido(dtoConverter.toEntity(toCreate, ItemPedidoEntity.class));
			return dtoConverter.toDTO(entity, ItemPedido.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public ItemPedido createMergeItemPedido(ItemPedido toCreate) {
		try {
			ItemPedidoEntity entity = service.createItemPedido(dtoConverter.toEntity(toCreate, ItemPedidoEntity.class));
			return dtoConverter.toDTO(entity, ItemPedido.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public ItemPedido updateItemPedido(ItemPedido toUpdate) {
		try {
			ItemPedidoEntity modified = doUpdate(toUpdate);
			return dtoConverter.toDTO(modified, ItemPedido.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Transactional
	@Override
	public ItemPedido updateMergeItemPedido(ItemPedido toUpdate) {
		try {
			ItemPedidoEntity entity = service.retrieveItemPedido(new ItemPedido.Id(toUpdate.id));
			dtoConverter.mergeToEntity(toUpdate, entity);
			entity = service.updateItemPedido(entity);
			return dtoConverter.toDTO(entity, ItemPedido.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	private ItemPedidoEntity doUpdate(ItemPedido toUpdate) {
		ItemPedidoEntity entity = service.getRepository().findOne(java.util.UUID.fromString(toUpdate.id));
		
		if(entity == null)
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getString("br.com.senior.furb.basico.ItemPedido_notFound", "ItemPedido not found with id " + toUpdate.id));
		
		dtoConverter.toEntity(toUpdate, entity);
		return doUpdate(entity);
	}
	
	private ItemPedidoEntity doUpdate(ItemPedidoEntity entity) {
		return service.updateItemPedido(entity);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Override
	public void deleteItemPedido(Id id) {
		this.service.deleteItemPedido(id);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public ItemPedido retrieveItemPedido(Id id) {
		ItemPedidoEntity entity = service.retrieveItemPedido(id);
		return dtoConverter.toDTO(entity, ItemPedido.class);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listItemPedido(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<ItemPedidoEntity> pages = this.service.listItemPedidoPageable(skip, top, orderBy, filter);
		List<ItemPedidoEntity> entities = pages.getContent();
		List<ItemPedido> dtos = null;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, ItemPedido.class, pageRequest.displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public CreateBulkItemPedidoOutput createBulkItemPedido(CreateBulkItemPedidoInput toCreate) {
		if (toCreate != null) {
			List<ItemPedido> entitiesToCreate = toCreate.entities;
			if (entitiesToCreate != null && !entitiesToCreate.isEmpty()) {
				entitiesToCreate.forEach(bean -> {
					bean.validate();
				});
				
				List<ItemPedidoEntity> entities = entitiesToCreate.stream().map(bean -> dtoConverter.toEntity(bean, ItemPedidoEntity.class))
						.collect(Collectors.toList());
				this.service.createBulk(entities);
			}
		}
		return new CreateBulkItemPedidoOutput();
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public ImportItemPedidoOutput importItemPedido(ImportItemPedidoInput request) {
		Importer importer = BatchIntegrationController.getInstance().newImporter();
		StartImportProcess startImportProcess = new StartImportProcess(importer, request.config);
		startImportProcess.start();
		ImportItemPedidoOutput output = new ImportItemPedidoOutput(importer.getId());
		return output;
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public ExportItemPedidoOutput exportItemPedido(ExportItemPedidoInput request) {
		/*
		 * **** Not implemented yet **** ExporterControl control =
		 * ExporterControl.getInstance(); Exporter exporter =
		 * control.newExporter(); StartExportProcess startExportProcess = new
		 * StartExportProcess(exporter, request.config);
		 * startExportProcess.start();
		 */
		ExportItemPedidoOutput output = new ExportItemPedidoOutput(
				null /* exporter.getId() */);
		return output;
	}
	
	class StartImportProcess extends Thread {
	
		private Importer importer;
		private ImportConfig config;
		
		StartImportProcess(Importer importer, ImportConfig config) {
			this.importer = importer;
			this.importer.addListener(new ItemPedidoImporterListener());
			this.config = config;
			this.importer.logUri(this.config.uri);
		}
		
		@Async
		@Override
		public void run() {
			File blob = getBlobFile();
			try {
				Layout layout = LayoutDTOConverter.dtoToLayout(config.layout);
				try (FileReader reader = new FileReader(blob)) {
					importer.setReader(reader);
					importer.setLayout(layout);
					importer.setBeanClass(ItemPedido.class.getName());
					importer.setCrudService(ItemPedidoHandler.this.service, (config.batchSize > 0));
					importer.setBatchSize(config.batchSize);
					if (config.async) {
						importer.startAsync();
					} else {
						try {
							importer.start();
						} catch (ImporterException e) {
							logger.error(e.getMessage(), e);
						}
					}
				}
			} catch (IOException e) {
				// isto nao deveria ocorrer
				logger.error(e.getMessage(), e);
			}
		}
		
		private File getBlobFile() {
			URI uri = null;
			try {
				uri = new URI(config.uri);
			} catch (URISyntaxException e1) {
				logger.error(e1.getMessage(), e1);
			}
			String scheme = uri.getScheme();
			if (scheme.equals("file")) {
				return new File(uri);
			} else if (scheme.startsWith("http")) {
				return getHttpBlobFile(uri);
			}
			return null;
		}
		
		private File getHttpBlobFile(URI uri) {
			importer.notifyDownload();
			HttpGet get = new HttpGet(uri);
			try (CloseableHttpClient httpClient = HttpClients.createDefault();
					CloseableHttpResponse httpResponse = httpClient.execute(get);
					InputStream is = httpResponse.getEntity().getContent()) {
				File blob = File.createTempFile("itempedido", "blob");
				try (FileOutputStream fos = new FileOutputStream(blob);
						BufferedOutputStream bos = new BufferedOutputStream(fos);
						BufferedInputStream bis = new BufferedInputStream(is)) {
					byte[] bytes = new byte[8192];
					int tam = 0;
					while ((tam = bis.read(bytes)) > 0) {
						bos.write(bytes, 0, tam);
					}
					bos.flush();
					fos.flush();
				}
				return blob;
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}
			return null;
		}
	}
}
