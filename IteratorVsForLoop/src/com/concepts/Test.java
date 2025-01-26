package com.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

	//Array.asList() making size of list as fixed. 
	//so you can't remove element from this
	List<Employee> employeeFixedLists=Arrays.asList(new Employee(101l,"Harsh"),
			new Employee(102l,"Ritesh"),new Employee(103l,"Raj"),
			new Employee(104,"Harish"));
	
	static List<Employee> employeeDyanamicLists=null;
	
	static {
		employeeDyanamicLists = new ArrayList<>();
		employeeDyanamicLists.add(new Employee(501l, "Iyyer"));
		employeeDyanamicLists.add(new Employee(502l, "Ibrahim"));
		employeeDyanamicLists.add(new Employee(503l, "Izzat"));
		employeeDyanamicLists.add(new Employee(504l, "Ishavar"));
		//return employeeDyanamicLists;
	}
	
	/**
	 * 1) Iterator is getting used to perform traverse operation over an element
	 * 2) It traverse element only in forward direction.
	 * 3) The function purpose of Iterator is allow to modify the collections.
	 * 4) We can remove the element form the collection.
	 */
	
	public void iterateEmployee() {
		Iterator<Employee> iterator=employeeFixedLists.iterator();
		
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if (employee.getEmpId() == 102) {
				employee.setEmpName("karin");
			}

			if (employee.getEmpId() == 104) {
				// it will through unSupportedOperationException
				// because the arrayList size is fixed
				// iterator.remove();
			}
		}
		System.out.println("Fixed size Array Lists Iterator "+employeeFixedLists);
	}
	
	public void iterateDyanamicListEmployee() {
		Iterator<Employee> iterator = employeeDyanamicLists.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();

			if (employee.getEmpId() == 501) {
				employee.setEmpName("Abdul");
			}

			if (employee.getEmpId() == 503) {
				iterator.remove();
			}
		}
		System.out.println("Dyanamic Array Lists Iterator "+employeeDyanamicLists);
	}
	
	/**
	 * i) For loop is getting used to get the index based element
	 * ii) It traverse the element both way i.e., forward and reverse.
	 * iii) Will not able to modify the collection using for loop
	 */
	
	public void iterateEmployeeUsingForLoop() {
		for (int i = 0; i < employeeFixedLists.size(); i++) {
		   System.out.println(employeeFixedLists.get(i));
		   
		   //0; 0 < 4 :: true
		   //1; 1 < 4 :: true
		   //2; 2 < 4 :: true
		   //3; 3 < 4 :: true
		}
	}
	
	public void iterateDynanamicEmployeeListUsingForLoop() {
		for (int i = employeeDyanamicLists.size() - 1; i >= 0 ; --i) {
		   System.out.println(employeeFixedLists.get(i));
		   
		  // list = 3 , 0,1,2
		 //  i=3-1 ; 2<3 
		 //  i=2-1 ; 1<3 
		 //  i=1-1 ; 0<3
		 // - 1  
		}
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		test.iterateEmployee();
		test.iterateDyanamicListEmployee();
		test.iterateEmployeeUsingForLoop();
		test.iterateDynanamicEmployeeListUsingForLoop();
	}
}
