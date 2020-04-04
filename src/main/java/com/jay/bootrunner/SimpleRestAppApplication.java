package com.jay.bootrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.jay"})
@EntityScan("com.jay.dbEntity")
@EnableJpaRepositories("com.jay.repository")
public class SimpleRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestAppApplication.class, args);
	}

}
