package com.github.tiagomac.resource;

import javax.annotation.security.PermitAll;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.tiagomac.model.Usuario;

@Path("/usuarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioResource {
	
	@POST
	@PermitAll
	@Transactional
	public void inserir(Usuario usuario) {
		Usuario.adicionar(usuario);
	}
	

}
