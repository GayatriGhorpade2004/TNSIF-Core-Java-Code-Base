package com.tnsf.dayeight.interfaces;

public interface Bank {
	
	float MINBAL=5000;
	final static float Deposit_Limit=25000;
	
	public void deposit(float amount);
	public void withdraw(float amount);
	
	
}
