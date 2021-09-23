package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.model.Manager;
import com.cogent.employeemanagementsystem.model.ProjectManager;

public class InheritanceDemo {
	public static final float PI = 3.14f;
	public final int a;
	public int b;
	// static only one copy
	// final: can't change the value.
	public InheritanceDemo() {
		this.a = 0;
		// final field when a final variable isnt initialized the constructor will make you give it a value
	}
	// Even with final it works
	public  static final void main(String[] args) {
		System.out.println("Hello from Kashif");
		
		
		
//		Employee manager = new Manager();
//		// all functionalities from Employee + overridden methods
//		
//		// parent type : child type
//		// the object will behave like an employee
//		// objects behavior completely depending on reference type
//		System.out.println("emp id " + manager.getEmpSalary());
//		float salary = manager.calculateSalary();
//		
//		System.out.println(salary);
//		System.out.println(manager.calculateSalary());
//		
//		// down casting from parent to child
//		Manager manager2 = (Manager) manager;
//		System.out.println(manager2.getProjectAllow());
//		
//		ProjectManager pm = new ProjectManager();
//		// E + M + PM
//		Manager pm = new ProjectManager();
//		// E + M
//		
//		Employee pm = new ProjectManager();
//		// E
		
		

	}

}
