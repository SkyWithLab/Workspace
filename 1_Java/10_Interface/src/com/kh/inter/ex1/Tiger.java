package com.kh.inter.ex1;

public class Tiger implements Animal {
//shift + alt +s -> v
	@Override
	public void move() {
		System.out.println("호랑이가 슬금슬금 걷는다.");
		
	}

	@Override
	public void eat() {
		System.out.println("고양이가 고양이를 먹습니다.");
		
	}

	@Override
	public void makeSound() {
		System.out.println("어흥어흥.");
		
	}
	
}
