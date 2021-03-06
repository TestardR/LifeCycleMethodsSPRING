package com.romain.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}

	public void init() { // Can carry any name
		System.out.println("Inside init method");
	}

	public void destroy() { // Can carry any name
		System.out.println("Inside destroy method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
