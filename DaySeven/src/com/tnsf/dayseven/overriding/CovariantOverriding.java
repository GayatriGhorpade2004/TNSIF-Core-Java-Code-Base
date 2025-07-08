package com.tnsf.dayseven.overriding;

class Colour
{
	protected Colour getColour()
	{
		Colour s=new Colour();
		return s;
		
	}
}

class Red extends Colour
{
	protected Colour getColour()
	{
		Red s=new Red();
		return s;
	}
}

class Blue extends Colour
{
	protected Colour getColour()
	{
		Blue s=new Blue();
		return s;
	}
}
public class CovariantOverriding {
	
	public static void main(String[] args) {
		
			
	}
	
}
