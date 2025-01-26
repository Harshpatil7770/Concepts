package com.concept.forloopvsenhancedforloop;

import java.util.ArrayList;
import java.util.List;

public class Employee {
 
	private long empId;
	
	private String empName;
	
	public Employee(long empId, String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	
	public static void main(String[] args) {
		
		List<Employee> employeeList=new ArrayList<>();
		
		
		employeeList.add(new Employee(101l, "Ramesh"));
		employeeList.add(new Employee(102l, "Suresh"));
		employeeList.add(new Employee(103l, "Harish"));
		employeeList.add(new Employee(104l, "Rugved"));
		employeeList.add(new Employee(105l, "Ayurved"));
		employeeList.add(new Employee(106l, "Chaturved"));
		
		/**
		 * Enhanced for loop - traverse only forward direction.
		 * There is no concept of index.
		 * It is very simple to use.
		 * It will iterate each element of list, set or array.
		 */
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		
		/**
		 * The old for loop - traverse both i.e., forward and reverse direction.
		 * based on the index we can access any values.
		 * It is more flexible and controlled.
		 * We can control over the initialization , condition and update.
		 */
		for(int i=0; i < employeeList.size() ; i++) {
			System.out.println(employeeList.get(i));
		}
		
		for (int i = employeeList.size() - 1; i >= 0; i--) {
			System.out.println(employeeList.get(i));
		}
	}
	
	@Override
	public String toString() {
		return "Employee :: empId :: "+empId+", empName :: "+empName;
	}
}
