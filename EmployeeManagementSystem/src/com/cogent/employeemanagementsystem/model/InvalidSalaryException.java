package com.cogent.employeemanagementsystem.model;
import lombok.ToString;
@ToString
public class InvalidSalaryException extends RuntimeException {
	public InvalidSalaryException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
