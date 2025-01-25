package com.concept.shallowcopy;

public class Employee implements Cloneable{

	private long empId;

	private String empName;

	private Address address;

	public Employee(long empId, String empName, Address address) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	public Long getEmpId() {
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
		return "Employee :: empId :: " + empId + " EmpName ::" + empName + " address :: " + address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
}
