package com.kh.array;

public class B_Array2 {

	public static void main(String[] args) {
		/*
		 * 변수 종류
		 * -일반 변수 : 리터럴 자체를 저장하는 공간 (변수)
		 * =>기본 자료형 (int,char,double, long,byte, float,short,boolean)
		 * 
		 * -참조변수 : 주소 값을 저장하는 공간(변수)
		 * =>기본자료형 외의 자료형 (int[],double[], char[], .. String, Scanner,
		 * 으로 선언된 변수
		 * * 배열 특징
		 * -배열을 생성한 후 직접 값을 초기화하지 않아도 기본값으로 초기화됨
		 *  =>Heap이라는 메모리 공간은 빈 공간으로 존재할 수 없어서 
		 *    공간이 만들어질 때 JVM에 의해서 기본값으로 초기화됨
		 *    
		 *    *배열 다점
		 *    -생성한 후 배열의 크기를 변경할 수 없음
		 *    => 크기를 변경하고자 한다면 새로 생성해야 함
		 */
		int[] iarr;
		iarr = new int[10]; //
		
		double[] darr;
		darr = new double[4];
		// => 배열을 생성까지만한 상태
		for(int i=0; i<iarr.length; i++) {
			System.out.print(iarr[i] + " " );;
			
			System.out.println("\n-------");
			
			
				
			}
		}
		
	}


