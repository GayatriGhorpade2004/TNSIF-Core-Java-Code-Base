package com.tnsf.dayfive.hierarchicalnheritance;

public class Mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person();
		System.out.println("----Person Details-----");
		System.out.println(p1);
		
		System.out.println("Person Details");
		Person p;
		p=new Person("Riya","Pune");
		System.out.println("Person Details:"+p);
		
		p=new Student("jiya","mumbai","TY",67.98f);
		System.out.println("Student Details "+p);
		
		p=new Employee("Reema","Thane",1003,56000,"EE");
		System.out.println("Employee Deatail "+p);
	}

}
