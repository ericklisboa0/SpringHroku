package com.erick.erick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages = {"erick.model"})
@ComponentScan(basePackages = {"erick.*"})
@EnableJpaRepositories(basePackages = {"erick.repository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
public class ErickApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ErickApplication.class, args);
	}

	  @Override
	  	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ErickApplication.class);
	}
}
