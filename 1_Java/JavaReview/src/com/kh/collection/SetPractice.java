package com.kh.collection;

import java.util.Scanner;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
//		Set : 순성유지 X 중복 X
//		*입력된 단어에서 중복된 문자를 제거하고 출력
		Scanner sc= new Scanner(System.in);
		Set<Character> set = new HashSet<>();
//		char(문자형) : 기본자료형 --- 객체화-> Character : 참조자료형(객체)
		
		System.out.print("-단어 입력 :");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			set.add(ch);
			
		}
		for(Charactor ch : set) {
			System.out.print(ch + " ");
			
		}
	}

}
