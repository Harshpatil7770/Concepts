package com.concept.shallowcopy;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee=new Employee(101, "Harsh", new Address("Mohol, Solapur"));
		System.out.println("Original Object "+employee);
		
		
		/**
		 * shallow copy - creating new instance with the reference of original object.
		 * You need to implement cloneable interface with clone method.
		 * There is join between original object and cloned object.
		 * If you make change in original object it will affect in child object and vice-versa.
		 */
		
		Employee empShallowClone = (Employee) employee.clone();
		
		System.out.println("Shallow Copy Cloned Object "+empShallowClone);
		
		empShallowClone.getAddress().setAddress("Masale Chaudhari , Mohol , Solapur");
		
		System.out.println("Modified Shallow Copy Cloned Object "+empShallowClone);
		
		System.out.println("Priting Original Object after making changes in cloned object"+employee);
	}
}
