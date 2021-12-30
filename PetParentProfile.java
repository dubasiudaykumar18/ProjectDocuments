package com.clinic.pet.cnp.model;

import java.util.List;

public class PetParentProfile {

	private String firstName;
	private String lastName;
	private String email;
	private String location;
	private String password;
	private List<PetProfile> pets;
	private List<PaymentInfo> paymentInfo;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<PetProfile> getPets() {
		return pets;
	}
	public void setPets(List<PetProfile> pets) {
		this.pets = pets;
	}
	public List<PaymentInfo> getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(List<PaymentInfo> paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
