package com.tnsf.dayeleven.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	
	public static void divide()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division : "+c); 
		}
		
		catch (InputMismatchException e) {
			System.err.println(e.getMessage());
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("Finally Block");
		}
	}
	
	}
