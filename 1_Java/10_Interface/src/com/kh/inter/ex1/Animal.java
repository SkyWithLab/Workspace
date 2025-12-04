package com.kh.inter.ex1;

// 접근제한자 interface 인터페이스명 {}
	public interface Animal {
//상수필드와 추상메소드로 구성됨
//추상메소드 =>몸체없는 메소드 (구현부가 없는 메소드)미완성된 메소드다...
		public abstract void move();
		public /*absteact*/ void eat();
		/*public abstract*/ void makeSound();
		
		
}
