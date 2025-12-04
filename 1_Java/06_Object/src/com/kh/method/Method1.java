package com.kh.method;

public class Method1 {
	
		/*메소드 : 클래스 내부에 있는 함수(기능)
		 * [표현법]
		 * 		[접근제한자] [예약어] 반환형: 메소드명([매개변수]) {
		 * 		//수행할 내용(기능)
		 * 		}
		 */
	
		public static void main(String[] args) {
			System.out.println("=== 프로그램 시작 ===");
			
			hiEveryone(20);
			
			hiEveryone(10); 
			
			//hiEveryone(); 매개변수가 없는 hiEveryone메소드는 존재하지 X
			
			System.out.println("=== 프로그램 종료 ===");
			
	}
		public static void hiEveryone(int age) {
			//반환형 : void => 결과값이 없다라는 것을 의미
			//메소드명 : hiEveryone
			//매개변수 정보 : 1개. int age변수
			// => 메소드가 호출 될 때 전달되는 값을 저장할 공간
		System.out.println("Hi, Everyone!"); 
		System.out.println("age: " + age);
		
		}
}
