package fr.aleclerc.tan.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aleclerc.tan.clients.ArretClient;
import fr.aleclerc.tan.pojo.Arret;

@Component
@Path("/arrets")
public class ArretResource {

	@Autowired
	private ArretClient client;
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Arret> getArret() {
		return client.getArret();
	}

}
