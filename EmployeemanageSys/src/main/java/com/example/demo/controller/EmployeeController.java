package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;
import com.example.demo.DAO.EmpRepo;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmpRepo repo;
	Employee emp = new Employee();

	@GetMapping(path = "/getEmployees")
	public Optional<Employee> getEmployee(@PathVariable("eid") int eid) {
		return repo.findById(eid);
	}

	@GetMapping(path = "/getEmployees/{eid}", produces = "application/json")
	public Employee getEmployees(@PathVariable("eid") int eids) {

		emp.setEid(1);
		emp.setEname("Robin");
		emp.setEtech("Java");
		return emp;

	}

	@PostMapping(path = "/Employee", consumes = { "application/json" })
	public Employee addEmployees(@RequestBody Employee employee) {
		repo.save(employee);
		return employee;
	}

	@PutMapping(path = "/Employee", consumes = { "application/json" })
	public Employee saveorUpdateEmployee(Employee employee) {
		repo.save(employee);
		return employee;

	}
}