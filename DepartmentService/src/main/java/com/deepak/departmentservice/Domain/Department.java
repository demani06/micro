package com.deepak.departmentservice.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Department {

    private @Id @GeneratedValue Long id;
    private String deptName;
    private String deptDesc;

    private Department() {}

    public Department(String deptName, String deptDesc) {
        this.deptName = deptName;
        this.deptDesc = deptDesc;
    }
}
