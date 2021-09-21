package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;

public class EmployeeService {
	EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
	
	
	
	private static EmployeeService employeeService;
	
	public static EmployeeService getInstance() {
		if(employeeService == null) {
			employeeService = new EmployeeService();
			return employeeService;
		}
		return employeeService;
	}
	// are we consuming the repo?
	
	public String addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
		// calling the addEmployee method from the EmployeeRepository.java class by using the obj we created
				
	}
	
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}

}
