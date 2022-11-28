package com.project.CRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.CRUD.entity.Employee;
import com.project.CRUD.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeser;
	
	@PostMapping
	public Employee addemployee(@RequestBody Employee employee)
	{
		return employeeser.save(employee);
	}
	
	@DeleteMapping(path ="/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		employeeser.delete(id);
		return "deleted successfully "+id;
	}
	public EmployeeService getEmployeeser() {
		return employeeser;
	}

	public void setEmployeeser(EmployeeService employeeser) {
		this.employeeser = employeeser;
	}
	
	
	
}
