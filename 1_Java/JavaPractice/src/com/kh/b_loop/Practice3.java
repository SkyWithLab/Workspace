package com.kh.b_loop;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		//입력받은 값부터1까지 출력
		//단, 입력한 값은 1보다 크거나 같아야함
		if(num >=1) {
			
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			for (int i=num; i > 0; i--) {
				System.out.print(i +" ");
			}
		}
		}
	}
