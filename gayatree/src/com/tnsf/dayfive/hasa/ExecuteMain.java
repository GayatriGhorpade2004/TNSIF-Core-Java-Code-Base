package com.tnsf.dayfive.hasa;

public class ExecuteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address("Spine Road","Pune","Maharashtra","411062");
		Person p=new Person("Gayatri",address);
		p.displayInfo();
		System.out.println(p);
	}

}
