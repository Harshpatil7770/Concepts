package com.concept.constructor;

public enum College {

	/**
	 * 1) What is Enum? 
	 * 
	 * Enum is means it is a way to define constants.
	 * 
	 * 
	 * 2) Does constructor allowed in Enum ?
	 * 
	 * Yes constructor allowed in Enum.
	 * 
	 * 3) Why do we need constructor in Enum? 
	 * 
	 * We need constuctor to add more info along with the enum
	 * like you defined the suppose collegeName as SINHGAD
	 * now inside that you want to define the full collegeName , collegeCode.
	 * without constructor that won't be possible.
	 * 
	 */
	
	SINHAGD("SINHGAD ACADEMY OF ENGINEERING", 5051),
	JIMS("JAYWANT INSTITUTE OF MANAGMENT", 5052);

	private String collegeName;
	private Integer collegeCode;

	private College(String collegeName,Integer collegeCode) {
		this.collegeName=collegeName;
		this.collegeCode=collegeCode;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public Integer getCollegeCode() {
		return collegeCode;
	}
	
	public College getValue(String collegeName) {
		for (College enumCollegeNames : College.values()) {
			if (enumCollegeNames.getCollegeName().equalsIgnoreCase(collegeName)) {
				return enumCollegeNames;
			}
		}
		return null;
	}
}
