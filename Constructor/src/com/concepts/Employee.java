package com.concepts;

public class Employee {

	private int empId;
	
	private String empName;
	
	public Employee() {
		this(101,"Harsh");
	}
	
	public Employee(int empId,String empName) {
		//this();
		this.empId=empId;
		this.empName=empName;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String toString() {
		return "Employee :: Id :: "+empId+" empName :: "+empName;
	}
}
