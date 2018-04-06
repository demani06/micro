package com.deepak.customerdashboard.Domain;

import lombok.Data;


@Data
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String description;

    private Customer() {}

    public Customer(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}