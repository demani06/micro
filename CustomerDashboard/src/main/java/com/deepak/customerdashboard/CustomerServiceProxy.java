package com.deepak.customerdashboard;


import com.deepak.customerdashboard.Domain.Customer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.http.annotation.Contract;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

//@FeignClient(name="customer-service", url = "localhost:9999/", configuration = FeignClassConfiguration.class)//Service Id of CustomerService
//  @FeignClient("ORDER-SERVICE")
@FeignClient(name="CUSTOMER-SERVICE", fallback = CustomerServiceProxyImpl.class)
public interface CustomerServiceProxy {

    /*@RequestMapping("/api/customers/{id}")
    public Customer findCustomerById(@PathVariable(value="id") Long id);
*/
    //@HystrixCommand(fallbackMethod = "defaultCustomers")
    @RequestMapping("/api/customers/")
    public List<Customer> findAll();

}
