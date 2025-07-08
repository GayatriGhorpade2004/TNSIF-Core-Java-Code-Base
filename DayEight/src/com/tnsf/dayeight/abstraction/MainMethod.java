package com.tnsf.dayeight.abstraction;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s;
		s=new Square();
		s.calarea();
		s.show();
		
		s=new Rectangle();
		s.calarea();
		s.show();
		
		s=new Square(2.4f);
		s.calarea();
		s.show();
		
	}

}
