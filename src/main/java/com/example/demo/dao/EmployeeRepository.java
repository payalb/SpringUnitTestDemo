package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 
	@Query("")
    public Employee findByName(String name);
 
}