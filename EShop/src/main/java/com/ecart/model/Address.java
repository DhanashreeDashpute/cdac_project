package com.ecart.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Address {

	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long id;
	private String city;
	private String state;
	private String country;
	private String pinCode;

	public Address(String city, String state, String pinCode, String country) {
		super();

		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getpinCode() {
		return pinCode;
	}

	public void setpinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [ city=" + city + ", state=" + state + ", pinCode=" + pinCode + ",country=" + country + "]";
	}

}
