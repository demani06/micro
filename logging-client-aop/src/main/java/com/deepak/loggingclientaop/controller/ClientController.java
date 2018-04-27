package com.deepak.loggingclientaop.controller;

import com.deepak.loggingserviceaop.aspect.MethodTimeCalcAspect;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/all")
    public String allMethodsPointCut(){
        return "Pointcut for all methods";
    }

    @GetMapping("/throw")
    public String throwMethodsException(){
        String str = null;
        return str.toString();
    }
}
