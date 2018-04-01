package com.deepak.employeeservice.Repository;

import com.deepak.employeeservice.Domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
