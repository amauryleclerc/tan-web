package fr.aleclerc.tan.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
		
	public JerseyConfig() {
		packages("fr.aleclerc.tan.resources");
		packages("fr.aleclerc.tan.filters");
	}
}
