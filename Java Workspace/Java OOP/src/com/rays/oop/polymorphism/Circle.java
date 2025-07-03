package com.rays.oop.polymorphism;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return this.radius;
		}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius* radius;
	}
}
