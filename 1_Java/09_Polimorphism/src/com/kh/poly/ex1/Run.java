package com.kh.poly.ex1;

public class Run {
	/*
	 * 클래스명 참조변수           =new클래스생성자;
	 * 
	 * *부모클래스가 올 수 있음   |   *자식클래스로도 생성할 수 있음
	 * 
	 * 실제로 어디까지 접근할 수 있는가?   |  실제로 어떤 형태로 메모리에 생성되었는가?
	 */
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		//c1 이라는 변수는 Cake 멤버가지 접근 ㅏ능
	c1.sweet();
	c1.milky();
	}


}
