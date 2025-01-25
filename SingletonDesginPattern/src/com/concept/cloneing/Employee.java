package com.concept.cloneing;

public class Employee implements Cloneable{

	/**
	 * singleton design pattern get's break by three ways
	 * 1) Using Reflection
	 * 2) Using serialization and deserialization
	 * 3) Using clone method
	 * 
	 * How to prevent it
	 * 1) Reflection -> Java API basically allows us to call private constructor from Outside class also.
	 *                  Constructor<Class> class=Class.class.getDeclaredInstance();
	 *                  when it try to create invoke the constructor if object is already created then
	 *                  throw and exception.
	 *                  
	 * 2) Using serialization and deserilization
	 *                -> while happening serialization and deserilization java will create new instance , it will
	 *                   break the principle of singleton design pattern.
	 *                -> To avoid this use readResolve() method , once you call it it will gives the same instance 
	 *                   if already created.
	 *                
	 * 3) Using cloneable --> implementing cloneable interface clone method , also break the singleton design pattern.
	 *                        To overcome with throw cloneNotSupportException() under the clone method                                                    
	 * 
	 */
	
	private static Employee employee=null;
	
	private Employee() {
		
	}
	
	public static Employee getInstance() {
		if (employee == null) {
			employee = new Employee();
		}
		return employee;
	}
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//this will break the singleton design pattern principle
		//return super.clone();
		//To overcome this issue throw cloneNotSupportException
		throw new CloneNotSupportedException();
	}
	
	
}


class Test{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee=Employee.getInstance();
		
		Employee employee1=(Employee) employee.clone();
		
		if(employee==employee1) {
			System.out.println("Object are same ");
		}else {
			System.out.println("Object are different");
		}	
	}
}