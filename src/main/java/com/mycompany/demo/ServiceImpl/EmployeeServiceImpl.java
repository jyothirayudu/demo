package com.mycompany.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.demo.entity.Employee;
import com.mycompany.demo.repository.EmployeeRepository;
import com.mycompany.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public String deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
       return "Deleted Employee Successfully";
    }

    @Override
    public List<Employee> fetchAllEmployee() {
      return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
       Employee emp = employeeRepository.findById(id).get();
       emp.setEmployeeName(employee.getEmployeeName());
       emp.setEmployeeAdress(employee.getEmployeeAdress());
       emp.setEmployeeSalary(employee.getEmployeeSalary());
       employeeRepository.save(emp);
       return emp;
    }
    

}
