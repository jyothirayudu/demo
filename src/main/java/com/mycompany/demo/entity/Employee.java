package com.mycompany.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   employeeId;
    private String employeeName;
    private String employeeAdress;
    private Double employeeSalary;

}
