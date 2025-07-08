package com.tnsf.dayeight.interfaces;

public class BankDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount s1=new SavingAccount("DYP","Pune",12345678,36000);
		s1.deposit(27000);
		System.out.println(s1);
		s1.withdraw(300);
		System.out.println(s1);
		s1.withdraw(36000);
		System.out.println(s1);
		s1.deposit(100000);
		System.out.println(s1);
	
		s1.withdraw(30);
		System.out.println(s1);
		
	}

}
