package com.github.tiagomac.resource;

import java.time.LocalDate;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.github.tiagomac.model.Ordem;
import com.github.tiagomac.repository.OrdemRepository;

@Path("/ordens")
@Consumes(MediaType.APPLICATION_JSON)
public class OrdemResource {
	
	@Inject
	OrdemRepository ordemRepository;
	
	@POST
	@Transactional
	public void inserir(Ordem ordem) {
		ordem.setData(LocalDate.now());
		ordem.setStatus("ENVIADA");
		ordemRepository.persist(ordem);
	}

}
