package com.rays.oop.polymorphism;

public class Shape {

	public double area() {
		return 0.0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {

			return new Circle(2);

		}
		if (i == 2) {

			return new Triangle(2, 2);

		}
		if (i == 3) {

			return new Rectangle(2, 2);

		}

		return new Shape();

	}
}
