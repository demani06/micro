package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

   private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

   @RequestMapping("/hello")
   public String sayHello() {
       LOGGER.info("Hello Word say hello method");
       LOGGER.warn("Waring Hello, trace ID = "+ MDC.get("X-B3-TraceId"));
      return "Hello Spring Boot!!";
   }

    @RequestMapping("/car")
    public Car getCars() {
        LOGGER.info("getCars");
        LOGGER.warn("getCars, trace ID = "+ MDC.get("X-B3-TraceId"));

        Car car = new Car("Wolkswagon","Polo","2009");
        car.setTraceId(MDC.get("X-B3-TraceId"));
        return car;
    }
}