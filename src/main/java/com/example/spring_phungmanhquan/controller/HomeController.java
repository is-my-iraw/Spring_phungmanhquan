package com.example.spring_phungmanhquan.controller;

import com.example.spring_phungmanhquan.entity.Employee;
import com.example.spring_phungmanhquan.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    EmployeesService employeesService;

    @GetMapping({"/", "/index"})
    public List<Employee> getAll(Model model){
        List<Employee> employees = employeesService.findAllEmployees();
        model.addAttribute("employees", employees);
        return employees;
    }
    @PostMapping("/create")
    public String create(Model model, @RequestParam Map<String, String> param){
        String name = param.get("name");
        String wage = param.get("wage");
        Employee employee = new Employee(name, Integer.valueOf(wage));
        employeesService.createEmployees(employee);
        return "redirect:index";
    }

    @RequestMapping(path = {"/","/search"})
    public String home(Employee employee, Model model, String name) {
        if(name!=null) {
            List<Employee> list = employeesService.search(name);
            model.addAttribute("list", list);
        }else {
            List<Employee> list = employeesService.findAllEmployees();
            model.addAttribute("list", list);}
        return "index";
    }
}
