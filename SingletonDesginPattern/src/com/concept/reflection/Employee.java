package com.concept.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * Reflection breaks the singleton design pattern.
 * To resolve this we have enum, as we know that enum never instantiated or extended.
 * Enum is nothing but a constant
 */
public class Employee {

	private static Employee employee=null;
	
	private Employee() {
		if(employee!=null) {
			return;
		}
	}
	
	
	public static synchronized Employee getInstance() {
		if (employee == null) {
			employee = new Employee();
		}
		return employee;
	}
	
	private Object readResolve() {
		return getInstance();
	}
}

class Test{
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Employee employee1 = Employee.getInstance();
		Employee employee2 = Employee.getInstance();
		
		if(employee1==employee2) {
			System.out.println("Object are equals");
		}
		
		System.out.println("Breaking singleton using Reflection");
		
		Constructor<Employee> refectionConstructor=Employee.class.getDeclaredConstructor();
		refectionConstructor.setAccessible(true);
		
		Employee refEmp1 = refectionConstructor.newInstance();
		Employee refEmp2 = refectionConstructor.newInstance();
		
		if(refEmp1==refEmp2) {
			System.out.println("Reflection unable to break the single instance priciple");
		}else {
			System.out.println("Reflection breaks the single instance priciple");
		}

	}
}