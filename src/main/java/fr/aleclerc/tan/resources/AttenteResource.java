package fr.aleclerc.tan.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aleclerc.tan.clients.AttenteClient;
import fr.aleclerc.tan.pojo.Attente;

@Component
@Path("/attente/{codeLieu}")
public class AttenteResource {

	@Autowired
	private AttenteClient client;
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Attente> getArret(@PathParam("codeLieu") String codeLieu) {
		return client.getAttentes(codeLieu);
	
	}

}
