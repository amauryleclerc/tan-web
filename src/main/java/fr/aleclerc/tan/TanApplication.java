package fr.aleclerc.tan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


@SpringBootApplication
public class TanApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TanApplication.class);
	}


	public static void main(String[] args) throws Exception {
		new TanApplication().configure(new SpringApplicationBuilder(TanApplication.class)).run(args);
	}
}
