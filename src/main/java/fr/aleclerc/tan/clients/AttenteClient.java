package fr.aleclerc.tan.clients;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import fr.aleclerc.tan.pojo.AttenteList;

@Component
public class AttenteClient {

	private Client client;

	@PostConstruct
	public void init() {
		client = ClientBuilder.newClient();
	}

	public AttenteList getAttentes(String codeLieu) {
		WebTarget target = client.target("http://open.tan.fr/ewp/tempsattente.json").path(codeLieu);
		AttenteList bean =target.request(MediaType.APPLICATION_JSON_TYPE)
				    .get(AttenteList.class);
		return bean;
		
	}


}
