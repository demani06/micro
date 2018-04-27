package com.deepak.loggingserviceaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class LoggingServiceAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingServiceAopApplication.class, args);
	}
}
