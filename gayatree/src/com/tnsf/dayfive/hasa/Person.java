package com.tnsf.dayfive.hasa;

public class Person {

	
	private String name;
	private Address address;
	
	//para constructor
	public Person(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}

	
	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	//method to display
	public void displayInfo()
	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+address.getStreet()+", "+address.getCity()+ ", "+address.getState()+", "+address.getPostalCode());
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
}
