package com.deepak.customerdashboard;


import com.deepak.customerdashboard.Domain.Customer;
import org.apache.http.annotation.Contract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@FeignClient(name="customer-service", url = "localhost:9999/", configuration = FeignClassConfiguration.class)//Service Id of CustomerService
//  @FeignClient("ORDER-SERVICE")
@FeignClient("http://ORDER-SERVICE")
public interface CustomerServiceProxy {


    @RequestMapping("/api/customer/{id}")
    public Customer findCustomerById(@PathVariable(value="id") Long id);

    @RequestMapping("/api/customer/")
    public List<Customer> findAll();

}
