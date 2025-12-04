package com.kh.poly.ex2;

public class Car {
	private String color;
	private String fuel;
	private String year;
	
	public Car() {}
	public Car(String color, String fuel, int year) {
		this.color =color;
		this.fuel = fuel;
		this.year = year;
	}
	
	public void drive() {
		System.out.println("car drice~");
	}
	
}
/*
 * 다향성: 부모타입으로부터 파생된 자식 객체들을 부모타입 하나로 다룰 수 있는 기술
 * 장점: 하나의 부모타입만으로 여러 자식 객체들을 다룰 수 있어 "편리"하고 "코드길이감소" 됨
 * *클래스 간의 형변환 *상속관계에서만 가능
 * -업캐스팅: 자식타입->부모타입으로 형변환(자동)
 * -다운캐스팅:부모타입에서 -> 자식타입으로 형변환된다 (강제형변환)직접명시해야한다
 * ((genesis)c3).moveGenesis();
 * *동적 바인딩 
 * : 프로그램이 실행되기 전에는 컴파일 되면서 정적바인딩 됨!
 * 실질적으로 참조하는 자식 객체에 해당하는 메소드가 "오버라이딩" 되면서 프로그램 실행 시 동적으로 해당
 * 메소드를 찾아서 실행!
 */

/* 다형성 적용 후
 */
car[] cArr = new Car[6];
cArr[0] = new Car("White", "휘발유", 2001);
cArr[1] = new Lamborgh("blue", "고급유", 2023);
cArr[2] = new Genesis("black", "경유", 2025);

for(Car c : cArr) {
	if (c != null) {
		c.drive();
		//해당 클래스 타입으로 생성된 인스턴스(객체)인지 확인!
		if (c instanceof Lamborgh) {
			((Lamborgh)c).moveLambogh();
		} else if (c instanceof Genesis) {
			((Genesis)c).moveGenesis();
		}
	}}
