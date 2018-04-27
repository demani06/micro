package com.deepak.loggingserviceaop.controller;

import com.deepak.loggingserviceaop.aspect.MethodTimeCalcAspect;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingServiceController {

    @MethodTimeCalcAspect
    @GetMapping("/easy")
    public String generateSample(){
        return "Take it easy bro!";
    }

    @GetMapping("/complex")
    public String generateComplex(){
        return "A bit complex Pointcut!";
    }


}
