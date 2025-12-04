package com.kh.inter.ex1;
//인터페이스를 구현 => implements 인터페이스명
public class Cat implements Animal{
	
	//*오버라이딩 조건: 반환형, 메소드명,매개변수 정보가 같아야
	@Override
	public void move(){
		System.out.println("고양이가 사뿐사뿐 걷는다.");
	}
	@Override
	public void eat() {
		System.out.println("고양이가 사뿐사뿐 걷는다1.");
	}
	@Override
	public void makeSound() {
		System.out.println("야옹야옹~");
	}
}
