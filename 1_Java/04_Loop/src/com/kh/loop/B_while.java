package com.kh.loop;

public class B_while {

	public static void main(String[] args) {
		/*
		 * while문
		 * 
		 * [표현식]
		 * 		[초기식;] //=> 생략가능!
		 * 		while(조건식) {
		 * 			//반복할 내용 작성	
		 * 		//[증감식;]
		 * 		}
		 *  * 실행 순서
		 *  	조건식 검사 -> 조건식 결과가 true 인 경우 반복할 내용 수행 
		 *  -> 조건식 검사 -> 조건식 결과가 true인 경우 반복할 내용 수행
		 *  ----계속 반복 ----
		 *  -> 조건식 검사 -> 조건식 결과 false인 경우 반복문 종료
		 */
			
			int n = 10;
			while (n > 5) {
				System.out.println("Happy");
				
				n--;
				
			}
		}

	}

}
