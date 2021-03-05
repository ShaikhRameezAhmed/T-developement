package com.example.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.example.n.demospr.controller",
		"com.example.demo.service"})
@EnableJpaRepositories(basePackages = {"com.example.demo.repository"})
@EntityScan("com.example.demo.entity")
public class DemoApplication extends ServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
