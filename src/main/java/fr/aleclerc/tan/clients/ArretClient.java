package fr.aleclerc.tan.clients;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import fr.aleclerc.tan.pojo.Arret;
import fr.aleclerc.tan.pojo.ArretList;

@Component
public class ArretClient {

	private Client client;

	@PostConstruct
	public void init() {
		client = ClientBuilder.newClient();
	}

	public ArretList getArret() {
		WebTarget target = client.target("http://open.tan.fr/ewp/arrets.json/47,21661/-1,556754");
		ArretList bean =target.request(MediaType.APPLICATION_JSON_TYPE)
				    .get(ArretList.class);
		return bean;
		
	}

	public List<Arret> getArret(String longitude, String latitude) {
		WebTarget target = client.target("http://open.tan.fr/ewp/arrets.json").path(latitude).path(longitude);
		ArretList bean =target.request(MediaType.APPLICATION_JSON_TYPE)
				    .get(ArretList.class);
		return bean;
	}
}
