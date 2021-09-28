package com.cogent.employeemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
//@Data // override equals method in employee java class
//@AllArgsConstructor
public class Employee {
	
	public final float calculateSalary() {
		return empSalary + 500;
	}
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) throws InvalidSalaryException {
		// for unchecked exception we only responsible for throw not throws in the method def
		// salary is not negative
		// if salary is negative raise InvalidSalary Exception
		if(empSalary>0) {
			this.empSalary = empSalary;
		} else {
			throw new InvalidSalaryException("Negative salary entered ");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public Employee(String employeeId, String firstName, String lastName, float empSalary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.setEmpSalary(empSalary);
	}

	private String employeeId;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;
	
	public Employee() {
		this.employeeId = "";
		System.out.println("hello from employee default constructor");
		
		// explicit default constructor
		
	}

//	public Employee(String employeeId, String firstName, String lastName, float empSalary, String address) {
//		super();
//		this.employeeId = employeeId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.empSalary = empSalary;
//		this.address = address;
//	}
	


}
