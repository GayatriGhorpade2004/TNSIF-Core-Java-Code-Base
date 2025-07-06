package com.tnsf.dayfour;

public class AccessModifier {

	int vardefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//declare default ,protected,public,private methods
	
	void methodDefault()
	{
		System.out.println("Default Access base class");
		System.out.println("Public variable:"+vardefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public Access base class");
		System.out.println("Public variable:"+varPublic);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected Access base class");
		System.out.println("Private variable:"+varProtected);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private Access base class");
		System.out.println("Private variable:" +varPrivate);
	}
	
	
}
