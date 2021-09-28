package com.cogent.employeemanagementsystem.service;

import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
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
	
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.getEmployeeById(id);
	}
	public Employee [] getEmployees() {
		return employeeRepository.getEmployees();
	}
	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return employeeRepository.deleteEmployeeById(id);
	}
	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAllEmployees();
		
	}
	@Override
	public String updateEmployees(String id, Employee employee) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return employeeRepository.updateEmployees(id, employee);
	}

	@Override
	public Employee[] getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployees();
	}

}
