package com.deepak.departmentservice.Controller;

import com.deepak.departmentservice.Domain.Department;
import com.deepak.departmentservice.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    public DepartmentService departmentService;

    @Autowired
    public DepartmentController(final DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/departments")
    @Produces({ "application/json"})
    public List<Department> getAllDepartments() {
        //log.info("Generating a random multiplication from server @ {}");
        //List<Department> list = departmentService.findAll();
        //System.out.println("list size===>"+list.size());
        return departmentService.findAll();
    }

    @PostMapping("/departments")
    public Department createDepartment() {
        //log.info("Generating a random multiplication from server @ {}");
        //List<Department> list = departmentService.findAll();
        //System.out.println("list size===>"+list.size());
        Department d = new Department("Chemistry","Chemistry Department");
        return departmentService.saveDepartment(d);
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome";
    }

    @RequestMapping("/dept")
    @ResponseBody
    public Department getDep() {
        return new Department("Chemistry","Chemistry Department");
    }

    @RequestMapping("/de")
    @ResponseBody
    public ResponseEntity<Department> getDept() {
        Department d = new Department("Biology","Biology Department");
        return new ResponseEntity<Department>(d, HttpStatus.OK);
    }

}
