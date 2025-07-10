package com.tnsf.dayeleven.trycatch;

public class TryCatchDemo {

	
		// TODO Auto-generated method stub
		
		static void method(int a,int b)
		{
			System.out.println("I m in method");
			int c;
			try {
				System.out.println("I m in try block");
				 c=a/b;
				System.out.println("Divison:"+c);
			}
			catch (ArithmeticException e)
			{
				System.err.println("I am in catch bloc: "+e.getMessage());
			}
		}
	}


