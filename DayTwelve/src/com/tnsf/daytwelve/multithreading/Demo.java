package com.tnsf.daytwelve.multithreading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread=new ThreadLifeCycleDemo();
		System.out.println("before runnable state thread is alive "+ myThread.isAlive());
		myThread.start();
		try
		{
			Thread.sleep(450);
		}
		catch (InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		System.out.println("after runnable state thread is alive "+ myThread.isAlive());
	}

}
