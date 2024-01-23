package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address;

	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Address Constructor");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
