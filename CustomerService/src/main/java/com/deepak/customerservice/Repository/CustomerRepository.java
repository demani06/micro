package com.deepak.customerservice.Repository;

import com.deepak.customerservice.Domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
