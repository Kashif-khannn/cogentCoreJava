package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
	
	// interfaces used in loose coupling
	// loose coupling: 
	
	private static EmployeeService employeeService;
	
	public static EmployeeService getInstance() {
		if(employeeService == null) {
			employeeService = new EmployeeServiceImpl();
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
	public Employee [] getEmployees() {
		return employeeRepository.getEmployees();
	}
	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String updateEmployees(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
