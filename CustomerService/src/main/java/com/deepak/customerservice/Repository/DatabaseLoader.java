package com.deepak.customerservice.Repository;

import com.deepak.customerservice.Domain.Customer;
import com.deepak.customerservice.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final CustomerRepository repository;

    @Autowired
    public DatabaseLoader(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Customer("Harry", "Potter", "Web Designer"));
        this.repository.save(new Customer("Mike", "Loren", "Sportsman"));

        for(int i=3; i < 10000; i++){
            this.repository.save(new Customer("Emp"+i, "Loren"+i, "Sportsman"));
        }

    }
}
