package com.kh.c_array;

public class ArrayPractice {

	public static void main(String[] args) {
		
	}
	
	public static void practice7() {
		//로또 번호 6개의 숫자 1~45
		int[] lottos = new int[6];
		
		for (int i=0; i<lottos.length; i++) {
			lottos[i] = (int)(Math.random() * 45 + 1);
			
			for(int i=0; i<lottos.length; i++){
				System.out.print(lottos[i] + "  ");
				
			}
			
		}
		
	}

}
