package com.mycompany.demo.service;



import java.util.List;

import com.mycompany.demo.entity.Employee;


public interface EmployeeService { 

    public Employee saveEmployee(Employee employee);

    public String deleteEmployee(Long id); 
    
    public List<Employee> fetchAllEmployee(); 

    public Employee findById(Long id);

    public Employee updateEmployee(Long id,Employee employee);

}
