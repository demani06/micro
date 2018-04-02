package com.deepak.employeeservice.controller;

import com.deepak.employeeservice.Domain.Employee;
import com.deepak.employeeservice.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import java.util.List;

@RestController
@RequestMapping("")
public class EmployeeController {

    @Autowired
    public EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
       return employeeRepository.findAll();
    }



}
