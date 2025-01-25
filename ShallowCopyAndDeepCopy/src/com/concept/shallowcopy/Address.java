package com.concept.shallowcopy;

public class Address {

	private String cityName;
	
	public Address(String cityName) {
		this.cityName=cityName;
	}
	
	public void setAddress(String cityName) {
		this.cityName=cityName;
	}
	
	@Override
	public String toString() {
		return cityName;
	}
}
