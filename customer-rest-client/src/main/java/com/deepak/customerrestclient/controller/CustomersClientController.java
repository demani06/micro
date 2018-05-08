package com.deepak.customerrestclient.controller;

import com.deepak.customerrestclient.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;

@RestController
public class CustomersClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/allCustomers")
    public Collection<Customer> getCustomers() {
        String url = "http://localhost:9999/api/customers/";
        System.out.println("URL" + url);
        Collection<Customer> customerCollection = restTemplate.getForObject(url, Collection .class);
        System.out.println("RESPONSE= " + customerCollection);
        return customerCollection;
    }
}

