package com.cogent.employeemanagementsystem;

import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		try {
			Employee employee = employeeService.getEmployeeById("abc002");
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// will terminate execution because it went from checked excep to unchecked excep
		// if throws used inside main it terminates execution
		// if you want to continue execution its better to use try and catch method 
		

	}

}
