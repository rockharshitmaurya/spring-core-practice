package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//we can use @AutoWired at property,  constructor or setterMethod

public class Emp {

	private Address add;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}

	public Address getAdd() {
		return add;
	}

	@Autowired
	@Qualifier("add2")
	public void setAdd(Address add) {
		this.add = add;
		System.out.println("setAdd() :");
	}

	public Emp(Address add) {
		super();
		this.add = add;
		System.out.println("cons");
	}

}
