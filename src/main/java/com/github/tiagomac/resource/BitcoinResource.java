package com.github.tiagomac.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.github.tiagomac.model.Bitcoin;
import com.github.tiagomac.service.BitcoinService;

@Path("/bitcoins")
@Produces(MediaType.APPLICATION_JSON)
public class BitcoinResource {
	
	@Inject
	@RestClient
	BitcoinService bitcoinService;
	
	@GET
	public List<Bitcoin> listar() {
		return bitcoinService.listar();
	}

}
