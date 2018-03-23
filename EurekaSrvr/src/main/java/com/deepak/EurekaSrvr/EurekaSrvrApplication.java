package com.deepak.EurekaSrvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSrvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSrvrApplication.class, args);
	}
}
