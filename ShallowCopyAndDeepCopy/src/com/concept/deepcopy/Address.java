package com.concept.deepcopy;

public class Address {

	private String addressDetails;
	
	public Address(String addressDetails) {
		this.addressDetails=addressDetails;
	}
	public Address(Address other) {
		this.addressDetails=other.addressDetails;
	}
	
	public void setAddress(String addressDetails) {
		this.addressDetails=addressDetails;
	}
	
	public String toString() {
		return addressDetails;
	}
}
