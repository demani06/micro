package com.deepak.orderservice.Repository;


import com.deepak.orderservice.Domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    public List<Order> findOrdersByCustId(long custId);

}
