package fr.aleclerc.tan.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aleclerc.tan.clients.LieuClient;
import fr.aleclerc.tan.pojo.Lieu;

@Component
@Path("/lieux")
public class LieuxResource {

	@Autowired
	private LieuClient client;
	
	@GET
	@Path("test")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Lieu> getArret() {
		return client.getArrets();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Lieu> getArret(@QueryParam("longitude") String longitude, @QueryParam("latitude") String latitude) {
		return client.getArrets(longitude, latitude);
	}

}
