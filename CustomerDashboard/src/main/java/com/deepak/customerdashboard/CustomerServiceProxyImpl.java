package com.deepak.customerdashboard;

import com.deepak.customerdashboard.Domain.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerServiceProxyImpl implements  CustomerServiceProxy{
    @Override
    public List<Customer> findAll(){
        List<Customer> list = new ArrayList<Customer>();
        list.add(new Customer("DefaultCustomer First Name", "Default Customer Last Name", "Default descritpion" ));
        return list;
    }

}
