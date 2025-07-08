package com.tnsf.dayeight.abstraction;

public class Square extends Shape{
float side;

public Square() {
	side=2.0f;
}

public Square(float side) {
	
	this.side = side;
}

@Override
public void calarea() {
	// TODO Auto-generated method stub
	this.area=side*side;
}



}
