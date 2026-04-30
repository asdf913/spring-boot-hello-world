package io.github.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.github.app")
public class HelloWorldApplication {

	public static void main(final String[] args) {
		//
		SpringApplication.run(HelloWorldApplication.class, args);
		//
	}

}