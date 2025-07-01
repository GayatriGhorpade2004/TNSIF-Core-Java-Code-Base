package com.tnsf.dayone;

public class IdentifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables declaration - invalid identifier examples
		
		//int for=a; error bcz keyword cannot be declared as variables
		
		//int num 1=13; error bcz of space
		
		//int @num=13; error bcz special symbols are not allowed,only $ and _ is allowed
		
		//valid identification
		
		int $num1=13;
		
		String StudName="AABCd";
		
		int FOR=12;
		
		System.out.println("Values of the no. :" +$num1);
		
		System.out.println("Name :" +StudName);
		
		
	}

}
