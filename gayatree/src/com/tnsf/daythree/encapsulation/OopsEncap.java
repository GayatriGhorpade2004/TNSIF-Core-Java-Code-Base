
package com.tnsf.daythree.encapsulation;

public class OopsEncap {

	private int serialNum;
	private int age;
	private String Name;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "OopsEncap [serialNum=" + serialNum + ", age=" + age + ", Name=" + Name + "]";
	}
	
	
}
