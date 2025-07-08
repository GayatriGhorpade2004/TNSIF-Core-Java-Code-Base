package com.tnsf.dayeight.abstraction;

public abstract class Shape {
	
		protected float area;
		public abstract void calarea();//abstract method
		
		//solid method
		public void show()

		{
			System.out.println("Area of the shape is:"+area);
		}
		
	
}
