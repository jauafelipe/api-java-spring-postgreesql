package com.example.apipostgre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApiPostgreApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiPostgreApplication.class, args);
	}

}
