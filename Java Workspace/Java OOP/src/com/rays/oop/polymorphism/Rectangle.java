package com.rays.oop.polymorphism;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public Rectangle() {
		
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	
@Override
public double area() {
	// TODO Auto-generated method stub
	return (length * width);
}
}
