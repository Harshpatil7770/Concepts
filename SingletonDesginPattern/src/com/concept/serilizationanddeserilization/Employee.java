package com.concept.serilizationanddeserilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee {
	
	private static Employee employee=null;
	
	private Employee() {
		
	}
	
	public static Employee getInstance() {
		if (employee == null) {
			return new Employee();
		}
		return employee;
	}
	
//	public Object readResolve() {
//		return employee;
//	}
}

class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee emp1 = Employee.getInstance();

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("output stream"));
		objectOutputStream.writeObject(emp1);
		objectOutputStream.close();

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("input stream"));
		Employee emp2 = (Employee) inputStream.readObject();
		inputStream.close();

		if (emp1 == emp2) {
			System.out.println("single instance is created");
		}
	}
}
