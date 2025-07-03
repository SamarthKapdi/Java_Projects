package com.rays.java.oop.encapsulation;

public class Automobile {
	private String color;
	private int speed;
	private String make;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void brake(int decreaseSpeed) {
		this.speed -= decreaseSpeed;
		if (this.speed < 0) {
			this.speed = 0;
		}
	}

	public void changeGear(int gear) {
		this.speed = gear * 20; 
	}

	public void accelerator(int increaseSpeed) {
		this.speed += increaseSpeed;
	}
}
