package com.deepak.orderservice.controller;


import com.deepak.orderservice.Domain.Order;
import com.deepak.orderservice.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    public OrderRepository ordersRepository;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
       return ordersRepository.findAll();
    }

    @GetMapping("/orders/{orderId}")
    public Optional<Order> getOrder(@PathVariable long orderId) {
        return ordersRepository.findById(orderId);
    }

    @GetMapping("/orders/customer/{custId}")
    public List<Order> findOrderByCustId(@PathVariable long custId) {
        return ordersRepository.findOrdersByCustId(custId);
    }

}
