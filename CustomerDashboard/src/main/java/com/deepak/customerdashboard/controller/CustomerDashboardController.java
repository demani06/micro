package com.deepak.customerdashboard.controller;


import com.deepak.customerdashboard.CustomerServiceProxy;
import com.deepak.customerdashboard.Domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RefreshScope
//@Controller
@RestController
@RequestMapping("/dashboard")
public class CustomerDashboardController {


    @Autowired
    private CustomerServiceProxy customerServiceProxy;

    @GetMapping("/customers")
    public List<Customer> getAllOrdersOfCustomer()
    {
       return customerServiceProxy.findAll();
    }



}
