package com.project.CRUD.service;

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
	
	public void delete(int id)
	{
		employeeRepo.deleteById(id);
	}

	public EmployeeRepository getEmployeeRepo() {
		return employeeRepo;
	}

	public void setEmployeeRepo(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	
}
