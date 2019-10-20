package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Employee;


  

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
