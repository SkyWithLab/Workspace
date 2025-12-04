package com.kh.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
	/*
	 * 
	 * 컬렉션: 자바에서 제공하는 자료구조 기반의 프레임워크
	 * -자료구조: 데이터를 효율적으로 관리하는 방법들
	 * -프레임워크: 기능을 쉽게 사용할 수 있도록 만들어놓은 틀
	 * 
	 * -종류: List set Map 
	 * 
	 * *List : 저장 순서가 유지되고, 중복을 허용하는 특징
	 * *set : 저장순서가 유지되지 않는다. 중복허용 안한다.
	 * *Map : 키-벨류 한쌍으로 데이터를 관리
	 * 			키값은 중복되지 않는다./ 리스트의 특징을 어느정도 가지고 있다.
	 */
	public static void main(String[] args) {
//		제네릭: 타입을 지정할 수 있는 방법
//		타입을 강제화 할 수 있음 클래스형변환도 생략
		
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in); // 입력용표쥰 스트림 시스템.인
		
		while(true) {
		System.out.println("=====TODO LIST======");
		System.out.println("1.할 일 추가");
		System.out.println("2.전체 보기");
		System.out.println("9.종료하기");
		
		System.out.println("선택 :");
		int menu = sc.nextInt();
		sc.nextLine();//버퍼 비우기!
		
		switch(menu) {
		case 1:
			System.out.print("추가할 할일 입력 : ");
			String todo = sc.nextLine(); // \n
			
			
			list.add(todo);
			break;
		case 2:
			System.out.print("====전체 목록====");
			
			for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			}
			break;
		case 9:
			System.out.print("종료합니다");
//			break; -> switch만 빠져나옴 종료 아님
			return; //메소드 자체를 종료시킴..
		default:
			System.out.print("없는 메뉴입니다 다시 선택해주세요");
		}
		}
	}

}
