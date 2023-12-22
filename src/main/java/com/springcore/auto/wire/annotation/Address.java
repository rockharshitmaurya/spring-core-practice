package com.springcore.auto.wire.annotation;

public class Address {
	private String streat;
	private String city;

	public String getStreat() {
		return streat;
	}

	public void setStreat(String streat) {
		this.streat = streat;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [streat=" + streat + ", city=" + city + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
