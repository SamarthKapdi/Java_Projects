package com.rays.oop.methodoverriding;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Overriding the area method
    public double area() {
        return Math.PI * radius * radius;
    }
}

