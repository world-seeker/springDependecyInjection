package com.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.di")
public class DependenciesInjectionUsingSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependenciesInjectionUsingSpringbootApplication.class, args);
	}

}
