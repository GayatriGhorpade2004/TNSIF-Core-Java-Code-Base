package com.tnsf.daythree;
import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Scanner object to accept user input
		Scanner ob=new Scanner(System.in);
		
		String name;
		System.out.println("Enter your name:");
		name=ob.next();
		
		System.out.println("Enter your age:");
		int age=ob.nextInt();
		
		System.out.println("Enetr gender:");
		String gender=ob.next();
		
		System.out.println("Enter mobile number:");
		long mobNo=ob.nextLong();
		
		System.out.println("Enetr your income:");
		int income=ob.nextInt();
		
		
		//person object and initialized values using setter
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobNo(mobNo);
		
		//by using getter method i m reading the data
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		//by using toString() method
		System.out.println(person);

		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After Calculation of tax:");
		System.out.println(person);
		
	}

}
