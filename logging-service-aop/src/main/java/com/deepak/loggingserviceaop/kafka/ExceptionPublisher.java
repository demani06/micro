package com.deepak.loggingserviceaop.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class ExceptionPublisher {


    @Autowired
    public KafkaTemplate<String,String> kafkaTemplate;

    public void publishExceptionToKafka(String topic,String payload){
        kafkaTemplate.send(topic,payload);
    }
}
