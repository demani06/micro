package com.deepak.customerdashboard.Domain;

import lombok.Data;
//import lombok.Data;

@Data
//@Entity(name="ORDERS")
public class Order {

    private Long orderId;
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