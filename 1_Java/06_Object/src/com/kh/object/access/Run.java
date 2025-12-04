package com.kh.object.access;

public class Run {

	public static void main(String[] args) {
		//AccessTest 객체 생성
		AccessTest test =new AccessTest();
		
		//public 멤버접근
		//System.out.println(test.publicField );
		//test.publicMethod();

		//System.out.println(test.protectedField ) ;
		//test.protectedMethod();
		
		//System.out.println( test.defaultField );
		//test.defaultMethod();
		
		//System.out.println( test.pricateField );
		//test.pricateMethod();
		//:객체의 데이터를 외부로부터 안전하게 보호하기 위함 (정보은닉)
		//객체지향 핵심 원리 중 하나인 캡슐화를 실현하는 데 사용된다
		
	}

}
