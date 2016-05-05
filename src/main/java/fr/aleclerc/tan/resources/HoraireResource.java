package fr.aleclerc.tan.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aleclerc.tan.clients.HoraireClient;
import fr.aleclerc.tan.pojo.Horaires;

@Component
@Path("/horaires/{codeArret}/{numLigne}/{sens}")
public class HoraireResource {

	@Autowired
	private HoraireClient client;
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Horaires getArret(@PathParam("codeArret") String codeArret,@PathParam("numLigne") String numLigne,@PathParam("sens") String sens) {
		return client.getHoraires(codeArret, numLigne, sens);
	
	}

}
