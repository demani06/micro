package com.deepak.loggingclientaop;

import com.deepak.loggingserviceaop.aspect.KafkaPointCutConfig;
import com.deepak.loggingserviceaop.aspect.MethodLogAspectJoinPointClass;
import com.deepak.loggingserviceaop.aspect.MethodTimeCalcAspect;
import com.deepak.loggingserviceaop.kafka.ExceptionPublisher;
import org.aspectj.lang.Aspects;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LoggingClientAopApplication {

   @Bean
    public MethodLogAspectJoinPointClass methodLogAspectJoinPointClass(){
        return new MethodLogAspectJoinPointClass();
    }

    @Bean
    public KafkaPointCutConfig methodKafkaPointCutConfig(){
        return new KafkaPointCutConfig();
    }

    @Bean
    public ExceptionPublisher exceptionPublisher(){
       return new ExceptionPublisher();
    }

	public static void main(String[] args) {
		SpringApplication.run(LoggingClientAopApplication.class, args);
	}
}
