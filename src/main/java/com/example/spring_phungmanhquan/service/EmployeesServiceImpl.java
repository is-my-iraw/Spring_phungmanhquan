package com.example.spring_phungmanhquan.service;

import com.example.spring_phungmanhquan.entity.Employee;
import com.example.spring_phungmanhquan.reponsitory.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService{

    @Autowired
    EmployeesRepo employeesRepo;
    @Override
    public List<Employee> findAllEmployees() {
        return employeesRepo.findAll();
    }

    @Override
    public Employee createEmployees(Employee employee) {
        return employeesRepo.save(employee);
    }

}
