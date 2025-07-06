package com.tnsf.daysix.finaldemo;

public class FinalMethod {
	
	public FinalMethod()
	{
		System.out.println("this is a default constructor ");
	}
	
	final int a=25;
	 // final method 
	final void show()
	{
		System.out.println("value of a "+ a);
	}
}
