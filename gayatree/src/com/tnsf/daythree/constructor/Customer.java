package com.tnsf.daythree.constructor;

public class Customer {

	private String customerName;
	private int customerId;
	private String customerCity;
	
	
	//default constructor
	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello this is default constructor....!");
	}

	
	
    public Customer(String customerName, int customerId) {
		
		this.customerName = customerName;
		this.customerId = customerId;
		
	}



//parameterised constructor
	public Customer(String customerName, int customerId, String customerCity) {
		
		System.out.println("hello this is parameterr constructor");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}


	
	//getter setter method
	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerCity() {
		return customerCity;
	}


	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	//toString Method
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	
	
	
	
	
}
