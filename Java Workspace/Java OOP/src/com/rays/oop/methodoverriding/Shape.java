package com.rays.oop.methodoverriding;

public class Shape {

	protected String color;
	protected int BorderWidth;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		color = this.color;
	}
	
	public int getBorderWidth() {
		return BorderWidth;
	}
	
	public void setBorderWidth(int BorderWidth) {
		BorderWidth = this.BorderWidth;
	}
	
	private double area() {
		return 0.0;
	}
}
