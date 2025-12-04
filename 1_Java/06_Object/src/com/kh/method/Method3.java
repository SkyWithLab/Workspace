package com.kh.method;

public class Method3 {
	
	/*
	 * 메소드 return의 의미
	 * 1) 반환값을 돌려줌 -> return 값;
	 * 2) 메소드 종료 -> return;
	 */

	public static void main(String[] args) {
		
		divide(50, 7);
		
		divide(100, 0);
	}
	public static void divide(int n1, int n2) {
		if (n2 == 0) {   // == 같다면, 만약에 n2가 0이라면 "0으로 나눌 수 없습니다." 출력
			System.out.println("0으로 나눌 수 없습니다.");
			return; //끝난다.
			
		}
		System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
		
	}
}
