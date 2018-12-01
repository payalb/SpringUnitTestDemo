package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
 
    @GetMapping("/search")
    public Employee findByName(@RequestParam("name")String name) {
        return employeeService.findByName(name);
    }
}
//TestRestTemplate: Integration test
//Unit testing: Mock the layers
//MockMvc: Unit testing of the controllers