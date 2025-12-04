package com.kh.loop;

public class A_For {
	/*
	 * 반복문:프로그램 흐름을 제어하는 문법 중 하나로 
	 * 특정 코드를 반복적으로 수행
	 * 
	 * *for문
	 * [표현식]
	 * 		for(초기식;조건식;증감식){
	 * 		//반복적으로 수행할 코드 작성
	 *      }
	 *      *초기식: 반복문이 수행될 때 "최초" 한번만 실행하는 식
	 *      *조건식: 반복문이 "수해욀 조건" 을 작성하는 식
	 *       -조건식의 결과가 true일 대 중괄호 안의 내용을 (실행)
	 *       -조건식의 결과가 false 일때 반복문 (종료)
	 *       *증감식: 반복문을 제어하는 변수의 값을 증감시키는 식
	 *       
	 *       [for문 실행 순서]
	 *       	초기식->조건식 검사 -> 결과기 true인 경우 반복할 내용 수행 -> 증감식 수행
	 *        ->조건식 검사 ->결과가 true인 경우 반복할 내용 수행 -> 중감식 수행
	 *        -------계속 반복 ---------
	 *        ->조건식 검사 ->결과가 flase인 경우 반복문 종료
	 *        
	 *        *참고 : 초기식, 조건식, 증감식은 생략 가능!
	 *        		 =>세미콜론(;)은 반드시 작성해야함!!
	 *        
	 *       -증감식 생략 =>for (초기식; 조건식;){}
	 *       -조건식 생략 =>for (초기식;;증감식){}
	 *       -초기식 생략 =>for (;조건식;증감식) {}
	 *       -모두 생략 for (;;) {}
	 */
	public static void main(String[] args) {
		methd5();
	}
	/**
	 *"happy"를 5번 출력
	 */
	public static void method() {
		System.out.println("happy");
		System.out.println("happy");
		System.out.println("happy");
		System.out.println("happy");
		System.out.println("happy");
		
		
		/*for (int i=0;i <5;i++) {
			System.out.println("happy");
		*/
	}
/*1부터 10까지의 총 합을 입력
 */
	public static void method3() {
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			total = total + i;
			
		}
		System.out.println("1~10까지 총 합:" + total);
	}
	

	public static void method4() {
 /*  [랜덤값을 구하는 방법]
  *  -Math:java.lang.Math
  *  	Math.random()호출하여 사용
  *  		0.0~0.99999....(0.0<= fosejarkqt<1.0)
  *  
  *  ex) 1부터 10가지의 랜덤값을 추출
  *  	Math.random() *10 => 0.0~ 9.9999...
  *  	Math.random() * 10+1 => 1.0~ 10.9999....
  *  (int)(Math.random() * 10 + 1 ) => 1~10
  *  
  *  
  */
		
	/*int random = (int) Math.random() *10 + 1);
	for(int i=1; i <=random; i++) {
		total+= i;
		
		System.out.println(1부터 %까지의 총합: %d\n, random, toral)
	}
	})*/
	}
		
		/**
		 * 구구단 출력(2단~9단 출력)
		 *
		 */
		
		public static void methd5() {
			
			for(int dan=2; dan<=9; dan++) {
				
				System.out.println(dan + "단");
				
				for(int n=1; n<=9; n++) {
					
					System.out.printf("%d x %d = %d\n", dan,n,dan*n);
					
				}
			}
		}


	}


	
	
