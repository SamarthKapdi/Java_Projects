package com.rays.java.oop.encapsulation;

public class Doctor {
	
	protected String name;
	protected String degree;
    protected int experience;
    protected String speciality;


	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
	this.name = name;	
	}
	
	
	public String getDegree() {
		return this.degree;
		
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
	public int getExperience() {
		return this.experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	

}
