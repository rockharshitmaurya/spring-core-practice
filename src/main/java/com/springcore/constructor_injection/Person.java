package com.springcore.constructor_injection;

public class Person {
	private String nameString;
	private int PersionId;

	public Person(String name, int id) {
		this.nameString = name;
		this.PersionId = id;
	}

	@Override
	public String toString() {
		return "Person [nameString=" + nameString + ", PersionId=" + PersionId + "]";
	}
}
