package com.deepak.customerdashboard;

import org.apache.http.annotation.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration
@EnableFeignClients(basePackageClasses = CustomerServiceProxy.class)
//@ComponentScan(basePackageClasses = CustomerServiceProxy.class)
@SpringBootApplication
@EnableDiscoveryClient
public class CustomerDashboardApplication {
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}

	public static void main(String[] args) {

		SpringApplication.run(CustomerDashboardApplication.class, args);
	}
}
