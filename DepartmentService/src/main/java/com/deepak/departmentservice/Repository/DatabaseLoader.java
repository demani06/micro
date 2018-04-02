package com.deepak.departmentservice.Repository;

import com.deepak.departmentservice.Domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final DepartmentRepository repository;

    @Autowired
    public DatabaseLoader(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Department("Physics", "Physics Department"));
        this.repository.save(new Department("Maths", "Maths Department"));
    }
}
