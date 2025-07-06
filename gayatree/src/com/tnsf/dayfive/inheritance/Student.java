package com.tnsf.dayfive.inheritance;

//child class
public class Student extends Citizen{

	//data members
	//private String studentname;
	//private String address;
	//private long phoneno;
	private int rollno;
	private String collegeName;
	
	//non para constructor
	public Student() {
		super();
	}

	//para constructor
	public Student(String name, String adharNo, String address, long phone, int rollno, String collegeName) {
		super( name, adharNo,  address, phone);
		
		this.rollno = rollno;
		this.collegeName = collegeName;
	}

	
	//getter & setter
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
	//toString method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
	
	
	
}
