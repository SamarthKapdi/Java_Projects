package com.rays.oop.polymorphism;

public class TestShapeByReturnType {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(3);
		s[2] = Shape.getShape(2);
		
		for(Shape s1 : s) {
			
			System.out.println(s1.area());
			
		}
		
	}

}
