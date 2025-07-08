package com.tnsf.dayseven.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI r;
		//dynamic binding assigning  child object tp perant
		r=new SBI();
		System.out.println(r.getRateofInterest());
		
		r=new ICICI();
		System.out.println(r.getRateofInterest());
		
		r=new HDFC();
		System.out.println(r.getRateofInterest());
		
	}

}
