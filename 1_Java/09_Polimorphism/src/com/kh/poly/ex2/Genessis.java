package com.kh.poly.ex2;

public class Genessis extends Car {
	
	public Genesis(String color, String fuel , int year) {
		super ( color, fuel , year);
	}
	public void move Genesis() {
		System.out.println("move genesis~");
		@Override
		public void drive() {
			System.out.println("genesis drive~~");
		}
}

