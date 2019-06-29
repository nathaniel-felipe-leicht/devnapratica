/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_CREATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_DELETE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_VIEW;
import static br.com.senior.furb.basico.MovimentoEstoqueEntity.SECURITY_RESOURCE;

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
import br.com.senior.furb.basico.MovimentoEstoque;
import br.com.senior.furb.basico.MovimentoEstoque.Id;
import br.com.senior.furb.basico.MovimentoEstoque.PageRequest;
import br.com.senior.furb.basico.MovimentoEstoque.PagedResults;
import br.com.senior.furb.basico.BasicoConstants;
import br.com.senior.furb.basico.CreateMovimentoEstoque;
import br.com.senior.furb.basico.UpdateMovimentoEstoque;
import br.com.senior.furb.basico.DeleteMovimentoEstoque;
import br.com.senior.furb.basico.RetrieveMovimentoEstoque;
import br.com.senior.furb.basico.ListMovimentoEstoque;
import br.com.senior.furb.basico.ImportConfig;
import br.com.senior.furb.basico.LayoutDTOConverter;
import br.com.senior.furb.basico.ImportMovimentoEstoqueInput;
import br.com.senior.furb.basico.ImportMovimentoEstoqueOutput;
import br.com.senior.furb.basico.ExportMovimentoEstoqueInput;
import br.com.senior.furb.basico.ExportMovimentoEstoqueOutput;
import org.springframework.stereotype.Component;
import br.com.senior.furb.basico.MovimentoEstoqueDTOConverter;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

@HandlerImpl(serviceClass = BasicoConstants.class)
@Component("furb.basico.MovimentoEstoqueHandler")
public class MovimentoEstoqueHandler implements CreateMovimentoEstoque, CreateMergeMovimentoEstoque, UpdateMovimentoEstoque, DeleteMovimentoEstoque, 
		 UpdateMergeMovimentoEstoque, CreateBulkMovimentoEstoque, RetrieveMovimentoEstoque, ListMovimentoEstoque, 
		 ImportMovimentoEstoque, ExportMovimentoEstoque {
	static final Logger logger = LoggerFactory.getLogger(MovimentoEstoqueHandler.class);

	@Inject
	MovimentoEstoqueCrudService service;
	
	@Inject
	MovimentoEstoqueDTOConverter dtoConverter;
	
	@Inject
	private TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public MovimentoEstoque createMovimentoEstoque(MovimentoEstoque toCreate) {
		try {
			MovimentoEstoqueEntity entity = service.createMovimentoEstoque(dtoConverter.toEntity(toCreate, MovimentoEstoqueEntity.class));
			return dtoConverter.toDTO(entity, MovimentoEstoque.class);
			
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
	public MovimentoEstoque createMergeMovimentoEstoque(MovimentoEstoque toCreate) {
		try {
			MovimentoEstoqueEntity entity = service.createMovimentoEstoque(dtoConverter.toEntity(toCreate, MovimentoEstoqueEntity.class));
			return dtoConverter.toDTO(entity, MovimentoEstoque.class);
			
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
	public MovimentoEstoque updateMovimentoEstoque(MovimentoEstoque toUpdate) {
		try {
			MovimentoEstoqueEntity modified = doUpdate(toUpdate);
			return dtoConverter.toDTO(modified, MovimentoEstoque.class);
			
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
	public MovimentoEstoque updateMergeMovimentoEstoque(MovimentoEstoque toUpdate) {
		try {
			MovimentoEstoqueEntity entity = service.retrieveMovimentoEstoque(new MovimentoEstoque.Id(toUpdate.id));
			dtoConverter.mergeToEntity(toUpdate, entity);
			entity = service.updateMovimentoEstoque(entity);
			return dtoConverter.toDTO(entity, MovimentoEstoque.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	private MovimentoEstoqueEntity doUpdate(MovimentoEstoque toUpdate) {
		MovimentoEstoqueEntity entity = service.getRepository().findOne(java.util.UUID.fromString(toUpdate.id));
		
		if(entity == null)
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getString("br.com.senior.furb.basico.MovimentoEstoque_notFound", "MovimentoEstoque not found with id " + toUpdate.id));
		
		dtoConverter.toEntity(toUpdate, entity);
		return doUpdate(entity);
	}
	
	private MovimentoEstoqueEntity doUpdate(MovimentoEstoqueEntity entity) {
		return service.updateMovimentoEstoque(entity);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Override
	public void deleteMovimentoEstoque(Id id) {
		this.service.deleteMovimentoEstoque(id);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public MovimentoEstoque retrieveMovimentoEstoque(Id id) {
		MovimentoEstoqueEntity entity = service.retrieveMovimentoEstoque(id);
		return dtoConverter.toDTO(entity, MovimentoEstoque.class);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listMovimentoEstoque(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<MovimentoEstoqueEntity> pages = this.service.listMovimentoEstoquePageable(skip, top, orderBy, filter);
		List<MovimentoEstoqueEntity> entities = pages.getContent();
		List<MovimentoEstoque> dtos = null;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, MovimentoEstoque.class, pageRequest.displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public CreateBulkMovimentoEstoqueOutput createBulkMovimentoEstoque(CreateBulkMovimentoEstoqueInput toCreate) {
		if (toCreate != null) {
			List<MovimentoEstoque> entitiesToCreate = toCreate.entities;
			if (entitiesToCreate != null && !entitiesToCreate.isEmpty()) {
				entitiesToCreate.forEach(bean -> {
					bean.validate();
				});
				
				List<MovimentoEstoqueEntity> entities = entitiesToCreate.stream().map(bean -> dtoConverter.toEntity(bean, MovimentoEstoqueEntity.class))
						.collect(Collectors.toList());
				this.service.createBulk(entities);
			}
		}
		return new CreateBulkMovimentoEstoqueOutput();
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public ImportMovimentoEstoqueOutput importMovimentoEstoque(ImportMovimentoEstoqueInput request) {
		Importer importer = BatchIntegrationController.getInstance().newImporter();
		StartImportProcess startImportProcess = new StartImportProcess(importer, request.config);
		startImportProcess.start();
		ImportMovimentoEstoqueOutput output = new ImportMovimentoEstoqueOutput(importer.getId());
		return output;
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public ExportMovimentoEstoqueOutput exportMovimentoEstoque(ExportMovimentoEstoqueInput request) {
		/*
		 * **** Not implemented yet **** ExporterControl control =
		 * ExporterControl.getInstance(); Exporter exporter =
		 * control.newExporter(); StartExportProcess startExportProcess = new
		 * StartExportProcess(exporter, request.config);
		 * startExportProcess.start();
		 */
		ExportMovimentoEstoqueOutput output = new ExportMovimentoEstoqueOutput(
				null /* exporter.getId() */);
		return output;
	}
	
	class StartImportProcess extends Thread {
	
		private Importer importer;
		private ImportConfig config;
		
		StartImportProcess(Importer importer, ImportConfig config) {
			this.importer = importer;
			this.importer.addListener(new MovimentoEstoqueImporterListener());
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
					importer.setBeanClass(MovimentoEstoque.class.getName());
					importer.setCrudService(MovimentoEstoqueHandler.this.service, (config.batchSize > 0));
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
				File blob = File.createTempFile("movimentoestoque", "blob");
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
