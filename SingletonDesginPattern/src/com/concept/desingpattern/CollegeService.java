package com.concept.desingpattern;

public final class CollegeService {

	/**
	 * singleton design pattern :
	 * restrict the user from creating more than one instance of class.
	 * only one instance of that class getting created.
	 */
	
	private static CollegeService collegeService=null;
	
	private CollegeService() {
		
	}
	
	public static CollegeService getInstance() {
		if (collegeService == null) {
			collegeService = new CollegeService();
		}
		return collegeService;
	}
	
	public String getCollegeName() {
		return "Sinhgad Academy of engineering, Pune";
	}
}
