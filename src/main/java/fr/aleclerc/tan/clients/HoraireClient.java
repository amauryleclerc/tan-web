package fr.aleclerc.tan.clients;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import fr.aleclerc.tan.pojo.Horaires;

@Component
public class HoraireClient {

	private Client client;

	@PostConstruct
	public void init() {
		client = ClientBuilder.newClient();
	}

	public Horaires getHoraires(String codeArret, String numLigne, String sens) {
		WebTarget target = client.target("http://open.tan.fr/ewp/horairesarret.json").path(codeArret).path(numLigne).path(sens);
		Horaires bean =target.request(MediaType.APPLICATION_JSON_TYPE)
				    .get(Horaires.class);
		return bean;
		
	}


}
