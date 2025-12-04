package com.kh.control;

public class If {

	public static void main(String[] args) {
		
		/*
		 *  *제어문 (프로그램의 흐름을 제어하는 문법)
		 *  -> 프로그램의 기본 흐름 : 위에서 아래로, 왼쪽에서 오른족
		 *  
		 *  조건문 , 반복문
		 *  
		 *  *조건문 - 조건에따라 흐름을 제어하는 문법
		 *  if, switch(동등비교, 케이스가 여러개일때)
		 */
		
	public static void test1() {
		
//		점수에따라 결과 출력 ((  90점이상 A 80점이상 B 70점 이상 C 그 외 F 라는 결과 
	int score = 77;
	String result = "";
	if(score >= 90) {
		result = "A";
		
	} else if ( score >= 80 ) { 
		result = "B";
	} else if ( score >= 70 ) {
		result = "C";
	} else {
		result = "F";
	}
	System.out.println(result);
	}
}
}
