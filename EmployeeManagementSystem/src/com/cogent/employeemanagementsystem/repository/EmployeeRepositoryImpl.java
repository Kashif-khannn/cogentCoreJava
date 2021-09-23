package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	private Employee employees[] = new Employee[10];
	private static EmployeeRepositoryImpl employeeRepository; // used to create a singelton class 
	
	private EmployeeRepositoryImpl() {
		
	}
	
	public static EmployeeRepository getInstance() {
		if(employeeRepository ==null) {
			employeeRepository = new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}
	static int counter = 0; // static creates one single copy in memory 
	public String addEmployee(Employee employee) {
		
		
		if (counter >= employees.length) {
			return "Array is full";
			
		}
		employees[counter++] = employee;
		return "Success";
		
}
	public Employee getEmployeeById(String id) {
		for (Employee employee: employees) {
			if(employee !=null && id.equals(employee.getEmployeeId()) ) {
				return employee;
			}
		}
		return null;
		
	}
	public Employee [] getEmployees() {
		return employees;
	}
	public String deleteEmployeeById(String id) {
		// 1. that id exists or not 
		Employee employee = this.getEmployeeById(id);
		if(employee != null) {
			
		
		int index = this.getIndex(employee); // this refers to current obj
		
		if(index!=-1) {
			// record found 
		   employees[index] = null;
		   return "Success";
		
			// we need to set null
			
		} else {
			return "not found";
		}
		// 2. id exists then set null to location? 
		// 3. if id does not exist return not found.
		}
		return "not found";
	}
	private int getIndex(Employee employee) {
		for(int i = 0; i< employees.length; i++) {
			if(employees[i].equals(employee)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void deleteAllEmployees() {
		employees = null;
			
	}

	@Override
	public String updateEmployees(String id, Employee employee) {
		
			this.getEmployeeById(id);
			
			int index = this.getIndex(employee);
			employees[index] = employee;
			
			
		
		return "success";
	}
	private static int index = 0;
	public Employee [] getEmployeeByName(String name) {
		Employee [] employeesTemp = new Employee[employees.length];
		for(Employee employee: employees) {
			if(employee.getFirstName().equals(name)) {
				employeesTemp [index++] = employee; 
			}
		}
		return employeesTemp;
		
	}
}
