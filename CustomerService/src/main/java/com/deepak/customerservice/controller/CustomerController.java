package com.deepak.customerservice.controller;

import com.deepak.customerservice.Domain.Customer;
import com.deepak.customerservice.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    public CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomer() {
       return customerRepository.findAll();
    }

    @GetMapping("/customers/{custId}")
    public Optional<Customer> getCustomer(@PathVariable long custId) {
        return customerRepository.findById(custId);
    }

}
