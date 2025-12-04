package com.kh.inter.ex2;

public class Curcle implements Shape {
	private double radius; 
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI* radius,* radius;
		
	
	
}
