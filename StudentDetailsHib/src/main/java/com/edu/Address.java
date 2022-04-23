package com.edu;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hiberaddress")
public class Address {
    @Id
   @GeneratedValue
	private int aid;
    @Column(length=50)
	private String street;
	private int pincode;
	 @Column(length=50)
	private String state;
	 @Column(length=50)
	private String country;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", pincode=" + pincode + ", state=" + state + ", country="
				+ country + "]";
	}
	
	
}
