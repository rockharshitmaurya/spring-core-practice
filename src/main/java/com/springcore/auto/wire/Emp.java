package com.springcore.auto.wire;

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

	public void setAdd(Address add) {
		this.add = add;
	}

	public Emp(Address add) {
		super();
		this.add = add;
	}

}
