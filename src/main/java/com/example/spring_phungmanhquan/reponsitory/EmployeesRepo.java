package com.example.spring_phungmanhquan.reponsitory;

import com.example.spring_phungmanhquan.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeesRepo extends JpaRepository<Employee, Integer> {
    @Query("SELECT u FROM Employee u WHERE u.name LIKE %:name%")
    List<Employee> searchUserByName(String name);
}
