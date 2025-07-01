package com.tnsf.dayone;

public class PrimitiveDataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//byte takes 1 byte
		//1 byte=8 bits  //2^8
		//256/2
		//128
		
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("Min range of byte:" +byteMin + "Max range in byte:" +byteMax);
		
		//short   ------2 byte=16 bits   ,2^16,
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("Min range of short:" +shortMin + "Max range in short:" +shortMax);
		
		//int   ------4 byte=32 bits   ,2^32,
				int intMax=2147483647;
				int intMin=-2147483648;
				System.out.println("Min range of int:" +intMin + "Max range in int:" +intMax);
				
	   //long   8byte=64 bits,2^64
				long longMax=9223372036854775807L;	
				long longMin=-9223372036854775808L;
				System.out.println("Min range of long:" +longMin + "Max range in long:" +longMax);
				
	 //float
				float f=3234.141243278345f;
				double d=3456.14124512345678902345678914f;
				
				boolean flag=true;
				boolean flag1=false;
				
				
				
						
	}

}
