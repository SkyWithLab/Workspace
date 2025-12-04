package com.kh.array;

public class MatrixPractice {

	
		/*
		 * 2차원 배열 : 배열 안에 배열 1차원 배열의 묶음 행열구조
		 * 
		 * 
		 * *선언
		 * 자료형[][] 변수명;
		 * 
		 * 
		 * 할당
		 * 변수명 = new 자료형[행의크기][열의크기];
		 * *행크기 -1차원 배열이 몇개인지
		 * *열크기 -1차원 배열의 데이터 개수
		 * 	->열크기 생략시 가변배열 생성가능!?....??
		 * 
		 * 값 대입 
		 * 	변수명[행인덱스][열인덱스] = 값;
		 */
	
	
	
		public static void main(String[] args) {
//			2*3 배열의 1~6까지 값ㅂ으로 초기화 할거에요
		int[][] arr = new int[2][3];
		arr[0][0] = 1; // 행인덱스*3 + 열인덱스+1
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[0][3] = 4;
		arr[0][4] = 5;
		arr[0][5] = 6;
		
//		2차원 배열 +반복문 -> 반복문 2개 인덱스2개
		for(int i=0; i<arr.length; i++) { // 행의 인덱스로 사용
			
			for(int j=0; j<arr[i].length; j++) { //열의 인덱스로 사용
				
				arr[i][j] = i*3 + j+1;
				
				System.out.print( arr[i][j]);
				
			}
			System.out.println();
		}
			
	}

}
