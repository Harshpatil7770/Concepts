package com.concept.deepcopy;

public class Employee implements Cloneable{

	private long empId;
	
	private String empName;
	
	private Address address;
	
	public Employee(long empId, String empName, Address address) {
		this.empId=empId;
		this.empName=empName;
		this.address=address;
	}
	
	public long getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Employee :: EmpID :: " + empId + ",  EmpName :: " + empName + ",  Address :: " + address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Employee(this.empId, this.empName,new Address(this.address));
	}
}
