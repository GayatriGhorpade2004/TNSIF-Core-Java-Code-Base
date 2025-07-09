package com.tnsf.dayeight.nesteddemo;

public interface OuterInterface {
	
	void calArea();
	
	interface InnerInterface
	{
		int id=50;
		void print();
	}
}
