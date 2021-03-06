package fr.aleclerc.tan.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import java.util.Map;

@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    @Autowired
    ApplicationContext appCtx;

    public JerseyConfig() {
    }

    @PostConstruct
    public void setup() {
        Map<String, Object> beans = appCtx.getBeansWithAnnotation(Path.class);
        for (Object o : beans.values()) {
            register(o);
        }
    }

}
