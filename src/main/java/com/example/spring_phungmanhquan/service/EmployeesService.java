package com.example.spring_phungmanhquan.service;

import com.example.spring_phungmanhquan.entity.Employee;

import java.util.List;

public interface EmployeesService {
    List<Employee> findAllEmployees ();
    Employee createEmployees(Employee employee);


}
