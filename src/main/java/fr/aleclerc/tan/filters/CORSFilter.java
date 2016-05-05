package fr.aleclerc.tan.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import org.springframework.context.annotation.Configuration;

@Provider
@Configuration
public class CORSFilter implements ContainerResponseFilter {


	@Override
	public void filter(ContainerRequestContext request, ContainerResponseContext res) throws IOException {
		MultivaluedMap<String, Object> headers = res.getHeaders();
		headers.add("Access-Control-Allow-Origin", request.getHeaderString("Origin"));
		headers.add("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
		headers.add("Access-Control-Max-Age", "3600");
		headers.add("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me, token");
		
	}
}
