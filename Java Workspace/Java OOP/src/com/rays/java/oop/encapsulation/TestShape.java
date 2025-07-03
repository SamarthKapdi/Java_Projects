package com.rays.java.oop.encapsulation;

public class TestShape {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setBorderWidth(3);
		System.out.println(r.getBorderWidth());
		
		r.setWidth(2);
		System.out.println(r.getWidth());
		
		r.setLength(3);
		System.out.println(r.getLength());
		
		r.setColor("Red");
		System.out.println(r.getColor());
		
		System.out.println(r.area());
		
		
		Circle c = new Circle();

		c.setBorderWidth(4);
		System.out.println(c.getBorderWidth());

		c.setColor("Blue");
		System.out.println(c.getColor());

		c.setRadius(5);
		System.out.println(c.getRadius());

		System.out.println(c.area());
		
		Triangle t = new Triangle();
		
		t.setBorderWidth(10);
		System.out.println(t.getBorderWidth());
		
		t.setBase(10);
		System.out.println(t.getBase());
		
		t.setHeight(5);
		System.out.println(t.getHeight());
		
		System.out.println(t.area());
		
		
		

	}
}
