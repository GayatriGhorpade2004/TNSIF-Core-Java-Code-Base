package com.tnsf.dayseven.overloading;

public class Point {
	
	private float x;
	private float y;
	public Point()
	{
		x=0.575f;
		y=0.568f;
		
	}
	
	public Point(float x)
	{
		this.x=x;
		this.y=y;
	}
	
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
