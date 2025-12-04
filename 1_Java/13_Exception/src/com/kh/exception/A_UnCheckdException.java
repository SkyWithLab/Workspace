package com.kh.exception;

import java.util.Scanner;

public class A_UnCheckdException {

		
/*
 * 
 * IndexOutOfBoundsException: 배열이나 리스트 등에 부적절한 인덱스로 접근 시 발생(범위를 벗어났다)
 * NullPinterException: 참조변수가 null인 상태에서 객체 멤버로 접근할 때 발생
 * ArithmeticException: 나누기 연산에서 0으로 나눌 떄 발생
 * ClassCastException: 허용되지 않는 객체로 형변환을 시도할 때 발생
 * NegativeArraySizeException:배열을 생성할 때 크기를 음수로 지정하면 발생
 * 
 * ===>> RuntimeException 계열 예외는 대부분 예측 가능한 상황에서 발생
 * 		 그렇기 때문에 if문 등 조건 처리를 통해 애초에 예외가 발생하지 않도록 방지가능
 * 
 */
//=============================================================================		
	private Scanner sc = new Scanner(System.in);
	
	public void test1() {
//		ArithmeticXeception
		System.out.print("정수1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int n2 = sc.nextInt();
		
//		int result = n1/n2;
//		-> 두번 쨰 입력 값(n2)0인 경우 발생
		
//		* 조건처리 (조건문)
		/*int result = 0;
		if(n2 != 0) {
			result = n1 / n2;
			
		}
		System.out.print("결과는 ..." + result);
		*/
//		A_UnCheckdException a = new A_UnCheckdException();
		
//		a.test1();
		
//		*예외처리 : 예외가 발생했을 때 비정상 종료되지 않도록
//				  실행할 내용을 미리 작성해놓은것
		
//		*try~catch 
		
//		try{
//		예외가 발생될 수 있는 구문
//		}catch (발생될예외클래스 매개변수) {
//			해당 예외가 발생했을 때 실행할 구문
//		}
		try {
			int result =n1 / n2;
			System.out.print("결과: "+ result);
		} catch (ArithmeticException e) {
			System.out.print("0으로 나눌 수 없습니다.");
			System.out.print(e.getMessage()); // 예외에 대한 설명 (메세지)
//			e.printStackTrace(); // 예외정보, 발생 지점을 확인할 수 있음
		}
	}
	public void test2() {
//		NegativeArraySizeException, 
		
		System.out.print("배열크기:");
		int size = sc.nextInt();
		
//		* 조건처리
		/*if (size >= 77) {
			int[] arr= new int[size];
				System.out.print("77번 위치의 값:"+ arr[77]);		
		}
		 */
//=============================================================================		
	}
	public void test() {
		System.out.print("배열크기:");
		int size = sc.nextInt();
		
		
		try {
			int[] arr new int [size];
			System.out.print("77번 위치의 값: "+ arr[77]);
			
			catch(RuntimeException e ) {
				System.out.println("인덱스 잘못되었거나, 배열크기가음수인 경우");
			catch(Array)
				System.out.println("작업끝");	
			}
		} 
	}
}
	
