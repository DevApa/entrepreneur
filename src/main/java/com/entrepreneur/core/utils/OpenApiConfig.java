package com.entrepreneur.core.utils;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
@OpenAPIDefinition()
public class OpenApiConfig {
	public OpenAPI configAPI() {	
		return new OpenAPI()
				.info(new Info()
					.title("Entrepreneur")
					.description("Mantenimiento Emprendedor")
					.version("0.0.1")
					.contact(new Contact()
							.email("apariciovivero@gmail.com")
							.url("cmav.com")
							.name("Carlos M. Aparicio Vivero")
							)
					.license(new License()
							.name("https://www.apache.org/licenses/LICENSE-2.0")							
							)
					)
				.externalDocs(new ExternalDocumentation()
						.description("API Rest Full Entrepreneur")
						.url("")
					);
	}
}
