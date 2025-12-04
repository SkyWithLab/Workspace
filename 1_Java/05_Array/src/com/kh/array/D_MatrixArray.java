package com.kh.array;

public class D_MatrixArray {
	/*
	 * 2차원 배열: 배열 안에 배열
	 * "같은"자료형의 "1차원 배열의 묶음"
	 * 
	 * 2차원 배열은 할당된 공간마다 인덱스 번호를 "두개" 부여한다
	 * 앞의 번호는 행의 인덱스 (몇번쨰 1차원 배열인지)
	 * 뒤의 번호는 열의 인덱스 (1차원 배열에서 몇 번째 데이터인지)
	 * 
	 * 선언 => 1차원 배열의 묶음을 참조하는 2차원 배열 참조변수를 만듬,
	 * 
	 * 			자료형[][] 배열명; (권장한다)
	 * 			저료형 배열명[][];
	 * 			자료형[] 배열명[]; 크기가 다를 때
	 * 
	 * 할당 =>
	 * 			배열명=new 자료형[행의크기][열의크기];
	 * 			*행크기는 :1차원 배열의 갯수
	 * 			*열의크기는 : 1차원 배열의 크기 (생략가능 -> 가변길이의 1차원 배열 할당)
	 * 
	 * 선언 및 할당: 자료형[][] 배열명 = new자료형[행크기][열크기];
	 * 
	 * 값대입
	 * 			배열명[행인덱스[열인덱스]=값;
	 * *행인덱스 : 몇번째 1차원 배열인지 
	 * *열인덱스 : 1차원 배열에서 몇번째 데이터인지
	 */

	public static void main(String[] args) {
		practice1();
	}
	public static void practice1() {
		int[][] arr;
		
		//크기가 4인 1차원 배열 3묶음
		arr= new int[3][];
		/*
	    arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[4]; */
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[4];
			
		}
		
		//*값대입
		int[][] arr2 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
			System.out.println(arr2[1][1]);
	}
		public static void practice() {
			
			String[][] arr3 = new String[3][3];
			arr3[0][0] = "(0행0열)";
			arr3[0][1] = "(0행1열)";
			arr3[0][2] = "(0행2열)";
			
			/*for(int i=0; i<arr3[0].length; i++) {
				arr3[0][i] = "(0행" + i + "열)";
				
			for(int i=0; i<arr3[1].length; i++) {
				arr3[0][i] = "(0행" + i + "열)";
				}*/
			for(int i=0; i<arr3[0].length; i++) {
			System.out.println();
			
				
			}
		}
	

}
