package com.example.apiswaggerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ApiSwaggerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSwaggerAppApplication.class, args);
	}

	@Bean
	public Docket config(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/questions/**"))
				.build().apiInfo(new ApiInfo("Swagger app", "Swagger example application", "1.0","", "Slawomir Wenc", "", ""));
	}
}
