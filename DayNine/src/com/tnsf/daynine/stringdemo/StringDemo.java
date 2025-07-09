package com.tnsf.daynine.stringdemo;

public class StringDemo {
	
	public static void main(String[] args) {
		
		
		char ch[]= {'i','n','d','i','a'};
		
		String s1=new String(ch);
		System.out.println(s1);
		
		String s2=new String(s1);
		System.out.println(s2);
		
		String str="This is to show "+"how long sentences "+"can be printed";
		System.out.println(str);
	}
}
