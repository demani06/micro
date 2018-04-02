package com.deepak.departmentservice.Service;

import com.deepak.departmentservice.Domain.Department;
import com.deepak.departmentservice.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

  public DepartmentRepository departmentRepository;

  @Autowired
  public DepartmentService(DepartmentRepository departmentRepository){
    this.departmentRepository = departmentRepository;
  }

  public List<Department> findAll (){
        return departmentRepository.findAll();
    }

    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
}
