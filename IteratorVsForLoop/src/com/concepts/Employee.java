package com.concepts;

public class Employee {

	private long empId;
	
	private String empName;
	
	public Employee(long empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	
	public void setEmpId(long empId) {
		this.empId=empId;
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public long getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String toString() {
		return "Employee  ID :: " + empId + " EmpName :: " + empName;
	}
}			
