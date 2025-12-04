package com.kh.s_array;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		practice4();
		
		
			String[] weeks =  {"월","화","수","목","금","토","일"}; //배열만들기
			System.out.print("0 ~ 6 사이의 숫자 입력 :"); //출력하기
			Scanner sc = new Scanner(System.in);
			int index = sc.nextInt();
			
			if (index < 0 ||index>= weeks.length) {
				System.out.println("잘못 입력하셨습니다.");
			}else {
				
			}
			System.out.println( weeks[index]);
			
			{
		}
			
	}}
