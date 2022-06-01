package com.exemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.exemple"})
@EntityScan(basePackages = {"com.exemple"})
@ComponentScan(basePackages = {"com.exemple"})
public class DemoApp {
	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);
		System.out.print("----------------------------------");
	}
}
