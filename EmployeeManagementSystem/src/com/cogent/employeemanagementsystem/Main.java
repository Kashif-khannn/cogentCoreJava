package com.cogent.employeemanagementsystem;
import com.cogent.employeemanagementsystem.model.*;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;
public class Main {

	public static void main(String [] args) {
		// Employee employee = new Employee(); // local reference 
		// class name object name = new Employee
		// new will create the object @ run time
		// Employee() its a constructor used to initialize the object
		// 2 types of constructors in Java
		// 1. Default constructor a. Implicit default constructor: constructor introduced by JVM or java when there is no type of constructor is declared
		// b. Explicit default constructor: we will declare it
		// if we declare any type of constructor then java will not introduce the implicit default constructor
		
		// 2. Parameterized constructor: We will provide customized values to initialize the fields
//		Employee employee2 = new Employee("ab001", "abhi", "chivate", 100.0f, "PA");
//		Employee employee3 = null;
//		
//		System.out.println(employee2.getEmployeeId());
//		
//		Employee employees[] = new Employee[10];
//		for (int i = 0; i < employees.length; i++) {
//			employees[i] = new Employee();
//		}
//		for (Employee employee4: employees) {
//			System.out.println(employee4);
//		}
		
		EmployeeService employeeService =  EmployeeServiceImpl.getInstance();
		Employee employee = new Employee("ab001", "abhi", "chivate", 123.0f);
		String result = employeeService.addEmployee(employee);
		System.out.println(result);
		
		Employee [] employees = employeeService.getEmployees();
		
		
		for(Employee employee2: employees) {
			System.out.println(employee2);
		}
		employeeService.getEmployeesByName("Kashif");
		 employeeService.updateEmployees("kashif", employee);
	    employeeService.deleteAllEmployees();
		
		
		
		
	}
}
