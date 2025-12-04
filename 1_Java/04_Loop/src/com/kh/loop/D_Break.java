package com.kh.loop;

public class D_Break {

	public static void main(String[] args) {
		/*
		 * 분기문 : break
		 * =>반복문 내에서 사용시 가장 가까운 반복문을 종료!
		 * 
		 */
		while(true) { //무한히 반복될 것임!
			//랜덤값을 추출
			int random = (int)(Math.random() * 100 + 1);
			
			if (random % 2 == 0) {
				//System.out.println("반복문종료 -->"+random);
				
				break;
			}
			System.out.println("랜덤값:"+ random);
			
		}
	}

}
