package com.springcore.lifecycle;

public class BeanClass {

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		System.out.println("setNumber() : Called");
	}

	@Override
	public String toString() {
		return "BeanClass [number=" + number + "]";
	}

	void init() { // we can use any name
		System.out.println("Init() called");
	}

	void destroy() { // we can use any name
		System.out.println("destroy()");
	}
}
