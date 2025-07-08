package com.tnsf.dayseven.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p=new Point();//default
		System.out.println(p);
		
		Point p1=new Point(67.0f, 45.9f);
		System.out.println(p1);
		
		System.out.println("======Method Overloading======");
		System.out.println(MethodOverloading.add(67.89f, 78.89f));
		System.out.println(MethodOverloading.add(2,4,8));

	}

}
