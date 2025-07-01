package com.tnsf.daytwo;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10;
      int b=20;
      int x=10;
      
      System.out.println("a and b value before aperation:"+ a + b);
      
      ++a;
      int c=++a + b + a--;
      System.out.println("c value after operation:"+c);
      
      int d=c++ + a + b--;
      System.out.println("d value after the operation"+d);
      
      
	}

}
