package com.kh.control;

public class Loop {
	
/*
		 * 반복문 : 특정 부분(코드)를 반복하여 수행해주는 문법
		 * for, while
		 * 
		 * for(초기식;조건식;증감식){
		 *        //반복할 내용
		 * }
		 * 
		 * 향상된 for문 foreach문
		 * for(자료형 변수명 : 리스트(배열)) {
		 *       //반복할 내용
		 * }
		 * 변수: 리스트 내에 요소 (데이터)들을 순차적으로 접근
		 * 자료형은 리스트에 담긴내용과 동일해야한다
		 * 
*/
	public static void main(String[] args) {
		test1();
		}
	public static void test1() {
//		1~10까지의 총 합
		
		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
			
			System.out.println("1~10까지 총 합:" + total);
			
		}
		
		
		
//		1~100까지의 홀수 합
//		-분기분: break, continue
		
//		=====> test2
	}

}
