package com.puppy;  //클래스 선언부 - 강아지를 정의하는 틀

public class Puppy {
//------------------------------강아지의 속성 (멤버변수)
	private String name; //이름
	private double weight; //몸무게
	private int age; //나이
	
	
	//---------------------------생성자 - 강아지 초기값설정
	public Puppy(String name, double weight,int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
		}
	
//	-----------------------------메소드 - 행동(동작)
	public void move() {  // 움직이다
		System.out.println(name + "가 멍멍 짖는다!");
	}
	public void eat(String food) {   //먹다
		System.out.println(name + "을 먹습니다");
	}
//	-----------------------------메소드 - 강아지 정보 출력
	public void printInfo() { 
		System.out.println("이름: " + name);
		System.out.println("몸무게: " + weight + "kg");
		System.out.println("나이: " + age +"살");
		}
	public static void main(String[] args) {
		Puppy woof = new Puppy("사과", 5.5, 9);
		woof.printInfo();   //정보출력
	}
}