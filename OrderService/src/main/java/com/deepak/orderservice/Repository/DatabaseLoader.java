package com.deepak.orderservice.Repository;


import com.deepak.orderservice.Domain.Order;
import com.deepak.orderservice.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final OrderRepository repository;

    @Autowired
    public DatabaseLoader(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Order("Amazon Alexa", "Alexa", 1));
        this.repository.save(new Order("Nike Shoes", "Nike Shoes", 1));
        this.repository.save(new Order("PS4 Game", "PS4 Game console with 2 joysticks", 1));
        this.repository.save(new Order("Nescafe Coffee", "Nescafe Coffee Cappuchino", 2));
        this.repository.save(new Order("Transformer toys", "Transformers Game Two player game", 1));
        this.repository.save(new Order("Pukka Green Tea", "Pukka Green Tea", 2));

    }
}
