package fr.aleclerc.tan.clients;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import fr.aleclerc.tan.pojo.LieuList;

@Component
public class LieuClient {

	private Client client;

	@PostConstruct
	public void init() {
		client = ClientBuilder.newClient();
	}

	public LieuList getArrets() {
		WebTarget target = client.target("http://open.tan.fr/ewp/arrets.json/47,21661/-1,556754");
		LieuList bean =target.request(MediaType.APPLICATION_JSON_TYPE)
				    .get(LieuList.class);
		return bean;
		
	}

	public LieuList getArrets(String longitude, String latitude) {
		WebTarget target = client.target("http://open.tan.fr/ewp/arrets.json").path(latitude).path(longitude);
		LieuList bean =target.request(MediaType.APPLICATION_JSON_TYPE)
				    .get(LieuList.class);
		return bean;
	}
//	public Arret getArret(String codeLieu) {
//		WebTarget target = client.target("http://open.tan.fr/ewp/tempsattente.json").path(codeLieu);
//		Arret bean =target.request(MediaType.APPLICATION_JSON_TYPE)
//				    .get(Arret.class);
//		return bean;
//	}
}
