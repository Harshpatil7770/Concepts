package com.concept.desingpattern;

public class StudentService {
	
	
	public void compareTheInstanceAddreess() {
		CollegeService collegeService1 = CollegeService.getInstance();
		CollegeService collegeService2 = CollegeService.getInstance();
		if(collegeService1==collegeService2) {
			System.out.println("CollegeService class allowing to create only one instance");
		}else {
			System.out.println("CollegeService class allowing to create multiple instance");
		}
				
	}
	
	
	public void compareLibraryClassInstance() {
		LibraryService libraryService1=new LibraryService();
		LibraryService libraryService2=new LibraryService();
		
		if(libraryService1==libraryService2) {
			System.out.println("LibraryService class allowing to create only one instance");
		}else {
			System.out.println("LibraryService class allowing to create multiple instance");
		}
		
	}
	
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		studentService.compareTheInstanceAddreess();
		studentService.compareLibraryClassInstance();
	}
}
