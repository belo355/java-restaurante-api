package com.belo.javarestauranteapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@EnableWebMvc
@SpringBootApplication
public class JavaRestauranteApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRestauranteApiApplication.class, args);
	}

}
