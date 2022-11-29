package com.project.CRUD.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.CRUD.entity.Employee;
import com.project.CRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public Employee save(Employee emp)
	{
		return employeeRepo.save(emp);
	}
	
	public List<Employee> getEmployeeList()
	{
		List<Employee> employeesList = new ArrayList<Employee>();
		Iterator<Employee> employees = employeeRepo.findAll().iterator();
		
		while(employees.hasNext())
		{
			employeesList.add(employees.next());
		}
		
		return employeesList;
	}
	
	public Employee delete(int id)
	{
		
		if(employeeRepo.existsById(id) == true)
		{
			Employee employee = employeeRepo.findById(id).get();
			employeeRepo.deleteById(id);
			return employee;
		}
		else
		{
			return null;
		}
	}
	
	public Employee getById(int id)
	{
		
		if(employeeRepo.existsById(id) == true)
		{
			Employee employee = employeeRepo.findById(id).get();
			return employee;
		}
		else
		{
			return null;
		}
	}
	
	
}
