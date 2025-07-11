package com.tnsf.daytwelve.multithreading;

public class ChildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread c=new ChildThread(10,"hello");
		ChildThread c1=new ChildThread(10,"tns");
		
		c.start();
		c1.start();
		System.out.println(":End of the Program");
	}

}
