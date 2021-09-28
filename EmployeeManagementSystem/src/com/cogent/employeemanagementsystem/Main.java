package com.cogent.employeemanagementsystem;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.cogent.employeemanagementsystem.model.*;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;
public class Main {
	public static int division(int a, int b) {
		int c = 0;
		try {
			c = a/b;
			return c;
		}
		catch(ArithmeticException e) {
			
			
		}
		finally {
		System.out.println("After the catch block");
		}
		return -1;
	}

	public static void main(String [] args) {
		Employee employee = new Employee("ab001", "kashif", "Khan",123.0f);
		try {
			employee.setEmpSalary(5000.0f);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
//			fileOutputStream.write("abc".getBytes());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	
		
//		try {
//			System.out.println(10/0);
//			String s = null;
//			System.out.println(s.concat("Kashif")); // s is holding null
//			// s is not referring to obj
//			// to call concat method we need object
//			// since object is not there and we are trying to call concat method
//			// then it will throw a NullPointerException
//		} catch(ArithmeticException e) {
//			
//		}
//		catch(NullPointerException e ) {
//			
//		}
//		catch (Exception e) {
//			System.out.println("exception caught");
//			System.out.println(e.getClass().getName());
//			
//		} 
//		catch(Throwable e) {
//			
//			// why no for object if object is able to handle exceptions 
//			// which is why we don't need object e 
//			// to maintain the heirchy we ended at throwable because there are using objects
//		} 
//		
//		int result = division(10,0);
//		System.out.println(result);
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
	
		
//		Scanner  scanner = new Scanner(System.in);
//		// in ==> static reference ==> used with className.
//		// it is used to accept the value / data from user
//		System.out.println("Enter the data");
//		int c = 0, a = 0, b = 0;
//		try and catch finally example
//		try {
//			a = scanner.nextInt();
//			b = scanner.nextInt();
//			c = a / b;
//			if(b <=0)
//			
//			System.out.println(a);
//			System.out.println(b);
//		} catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("exception occured");
//			System.out.println("Enter the value again for b ");
//			b = scanner.nextInt();
//			c = a/b;
//		}
//	finally {
//		System.out.println("inside the finally block");
//		}
//		System.out.println("Division is " + c);
//		
//		
		
	}
}
