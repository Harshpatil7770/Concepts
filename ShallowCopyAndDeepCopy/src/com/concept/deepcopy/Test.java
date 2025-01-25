package com.concept.deepcopy;

public class Test {

	/**
	 * 
	 * @param args
	 * @throws CloneNotSupportedException
	 * 
	 * Deep copy means creating new object using original object.
	 * There is dis-join between original object and deep copy cloned object.
	 * If you make any change in original object it won't affect to child object and vice versa.
	 */
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee(101l, "Harsh", new Address("Mohol , Solapur"));
		
		System.out.println("Original Object :: "+employee);
		
		Employee employee2=(Employee) employee.clone();
		
		
		System.out.println("Deep copy cloned Object :: "+employee2);
		
		employee2.getAddress().setAddress("Masale chaudhari , Tal mohol , Dist - Solapur");
		
		System.out.println("Modified Deep copy cloned Object :: "+employee2);
		
		System.out.println("Original Object :: "+employee);
	}
}
