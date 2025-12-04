package com.kh.loop;

public class E_Continue {

	public static void main(String[] args) {
		/*
		 * 분기문 continue 
		 * : continue; 를 만나면뒤에 문장들이 수행되지 않고 (무시)
		 * 	증감식 (for) 또는 조건식(while) 으로 이동
		 */
		//1부터 100까지의 총 합
		//단, 3의 배수이거나 5의 배수는 합산에서 제외
		int total =0;
		
		for(int i=1; i<=100; i++) {
			if (i % 3==0|| I % 5 == 0) {
				continue;
				
			}
				
				
				}
		System.out.println("결과:" +total);
		
	}

}
