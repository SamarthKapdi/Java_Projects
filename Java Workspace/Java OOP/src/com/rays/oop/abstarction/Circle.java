package com.rays.oop.abstarction;

public class Circle extends Shape {
	private int r;
	 public Circle (int r) {
		 this.r = r;
	 }
	 @Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

}
