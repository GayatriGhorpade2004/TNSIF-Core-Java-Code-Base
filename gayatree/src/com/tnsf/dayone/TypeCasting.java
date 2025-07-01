package com.tnsf.dayone;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //widening //implicit type casting
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=10.88f;
		double d=f;
		System.out.println(d);
		
		//narrowing //explicit type casting
		double f1=11.67f;
		long l=(long)f1;
		System.out.println(l);
		
		long l1=8464638948L;
		int i1=(int)l1;
		System.out.println(i1);
		
		short a=135;
		byte b1=(byte)a;
		System.out.println(b1);
	}

}
