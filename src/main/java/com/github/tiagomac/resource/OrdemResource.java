package com.github.tiagomac.resource;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import com.github.tiagomac.model.Ordem;
import com.github.tiagomac.service.OrdemService;

@Path("/ordens")
@Consumes(MediaType.APPLICATION_JSON)
public class OrdemResource {
	
	@Inject
	OrdemService ordemService;
	
	@POST
	@RolesAllowed("user")
	@Transactional
	public void inserir(@Context SecurityContext securityContext, Ordem ordem) {
		ordemService.inserir(securityContext, ordem);
	}
	
	@GET
	@RolesAllowed("admin")
	public List<Ordem> listar() {
		return ordemService.listar();
	}

}
