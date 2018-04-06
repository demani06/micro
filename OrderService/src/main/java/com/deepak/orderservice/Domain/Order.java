package com.deepak.orderservice.Domain;

import com.google.common.collect.Table;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name="ORDERS")
public class Order {

    private @Id @GeneratedValue Long orderId;
    private String orderName;
    private String description;
    private long custId;

    private Order() {}

    public Order(String orderName, String description, long custId) {
        this.orderName = orderName;
        this.description = description;
        this.custId = custId;
    }

}