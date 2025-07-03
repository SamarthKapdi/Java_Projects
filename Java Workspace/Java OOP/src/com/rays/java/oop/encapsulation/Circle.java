package com.rays.java.oop.encapsulation;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}
