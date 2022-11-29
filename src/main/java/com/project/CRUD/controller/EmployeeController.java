package com.project.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.CRUD.entity.Employee;
import com.project.CRUD.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeser;
	
	@PostMapping
	public Employee addemployee(@RequestBody Employee employee)
	{
		return employeeser.save(employee);
	}
	
	@GetMapping(path = "/list")
	public List<Employee> getEmployeeList()
	{
		List<Employee> employeeList = employeeser.getEmployeeList();
		return employeeList;
	}
	
	@DeleteMapping(path ="/{id}")
	public Employee deleteEmployee(@PathVariable int id)
	{
		Employee employee = employeeser.delete(id);
		
		if(employee!=null)
			return employee;
		else
			return employee;
	}
	
	@GetMapping(path ="/{id}")
	public Employee getEmployeebyId(@PathVariable int id)
	{
		Employee employee = employeeser.getById(id);
		
		if(employee!=null)
			return employee;
		else
			return null;
	}
	
	
}
