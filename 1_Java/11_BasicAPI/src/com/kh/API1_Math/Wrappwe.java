package com.kh.API1_Math;

public class Wrappwe {
		/*
		 * Wrapper 클래스 : 기본 자료형을 객체화 해주는 클래스
		 * 
		 * boolean ----> Boolean
		 * char    ----> Character
		 * byte    ----> Byte
		 * short   ----> Short
		 * int     ----> Integer
		 * long    ----> Long
		 * float   ----> float
		 * double  ----> Double
		 * 
		 * 기본 자료형을 객체로 바꾸는 이유? 
		 * -다형성을 적용시키고 싶을 때, 기본자료형도 객체화 되어야 다형성이 가능함
		 * -메소드 호출 시 매개변수가 기본자료형이 아닌 객체 타입만요구될 때 wrapper 클래스들이 사용된다.
		 */
	public static void main(String[] args) {
//		*Boxing : 기본자료형을 -> Wrapper 클래스 (객체화)
		int n1 = 100; 
		int n2 = 200;
		
//		n1.equals(n2) // -> 기본 자료형은 equals 사용 불가
		
//		래퍼클래스를 사용하여 변환해보면
//		new Integer(n1); 이런 형태라고 보면 됨
		Integer i1 = Integer.valueOf(n1);
		Integer i2 = Integer.valueOf(n2);
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.equals(n2));
		System.out.println(i1.compareTo(n2));
//		두 값을 비교하여 앞쪽의 값이 크면 1 반환, 뒤쪽의 값이 크면 -1 반환 , 같으면 0을 반환
		
//		래퍼 클래스 없이 변환
		Integer i3 = n1; //Auto Boxing 된다고 표현
		System.out.println(i3);
		
//		*래퍼클래스를 사용해야 하는 경우 
//		-> 문자열 형태에서 래퍼클래스 형태로 변환하고자 할 때
//		10, 100 ..."10", "100"
		
//		UnBoxing : 래퍼클래스 --> 기본자료형
//		래퍼클래스에서 제공하는 메소드 사용 (xxxValue())
		
	}


}
