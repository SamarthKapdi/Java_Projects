package com.rays.oop.polymorphism;

import java.awt.geom.Area;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle() {
		
	}

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public int getBase() {
		return this.base;
	}
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base * height)/2;
	}
	

}
