package com.mycompany.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.demo.entity.Employee;
import com.mycompany.demo.service.EmployeeService;




@RestController
public class EmployeeController {
   
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
          return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> fetchAllEmployee(){
        return employeeService.fetchAllEmployee();
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeId(@PathVariable("id") Long id){
            return employeeService.findById(id);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

}
