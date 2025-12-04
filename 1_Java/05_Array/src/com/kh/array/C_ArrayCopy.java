package com.kh.array;

public class C_ArrayCopy {

	public static void main(String[] args) {
		
	}
	/**
	 * 얖은복사 => 주소값(참조값)을 복사!
	 */
	public static void shallowCopy() {
		int[] origin ={1,2,3,4,5};
		
		System.out.println("====원본 배열 출력 ====");
		for(int i=0; i <origin.length; i++){
			System.out.print(origin[i] + " " );
		}
			System.out.println();
			
			int[] copy = origin;
			//복사 ->얕은복사, 주소값이 복사됨!
			System.out.println("====복사본 배열 출력 ====");
			for (int i=0; i<copy.length; i++) { 
				System.out.print(copy[i] + " " );
			}
				System.out.println();
				
				System.out.println("====원본 배열 출력 ====");
			for(int i=0; i <origin.length; i++){
				System.out.print(origin[i] + " " );
				
			}
		}
	

	/**
	 * 깊은 복사 : 새로운 배열을 생성하여 원본 배열의 값을 복사한다
	 *
	 */
	public static void deepCopy() {
		int[] origin = {1,2,3,4,5};
		
		//복사본 배열(copy)을 선언하고 원본배열의 크기만큼 할당 생성
		int[] copy =new int[origin.length];
		
		System.out.println("====원본 배열 출력 ====");
		for( int n : copy) { 
			System.out.println(n+ " ");
		}
		
		//for 문을 이용하여 복사하기
		for (int i=0; i<copy.length; i++) {
			//copy배열의 i번째 위치에 origin배열의 i번째 위치의 값을 대입
			copy[i] = origin[i];
		}
			System.out.println("====값 변경 후 배열 출력 ====");
			for( int n : copy) { 
				System.out.println(n+ " ");
			}
			copy[2] = 999;
			
			System.out.println("====값 변경 후 배열 출력 ====");
			for( int n : copy) { 
				System.out.println(n+ " ");
		}
			System.arraycopy(origin,copy, 0, origin.length);
	}
}
