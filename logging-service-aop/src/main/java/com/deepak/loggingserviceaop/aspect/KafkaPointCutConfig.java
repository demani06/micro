package com.deepak.loggingserviceaop.aspect;

import com.deepak.loggingserviceaop.kafka.ExceptionPublisher;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

@Aspect
@ComponentScan
public class KafkaPointCutConfig {

    @Autowired
    public ExceptionPublisher publisher;

    @AfterThrowing(pointcut = "execution (* com.deepak..controller..*(..))", throwing = "exception")
    public void throwExceptionControllerPackage(Exception exception)
    {
        System.out.println("^^^^^Exception Thrown jointpoint method called");
        publisher.publishExceptionToKafka("kafkalogger", exception + " occured at "+new Date());
    }


}
