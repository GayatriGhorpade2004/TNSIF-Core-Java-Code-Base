package com.tnsf.daythree;

public class Person {

	//data members
	private String name;
	private String gender;
	private int income;
	private int age;
	private int tax;
	private long mobNo;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	
	//object class method returns string representation of person object
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", income=" + income + ", age=" + age + ", tax=" + tax
				+ ", mobNo=" + mobNo + "]";
	}
	
	
	
}
