package com.kh.poly.ex1;

public class CheeseCake extends Cake{

	public void Yummy() {
		System.out.println("Cheese Cake Yummy!");
}
	// 재정의
	@Override
	public void sweet() {
		System.out.println("Cheese Cake sweet!");
}
}

