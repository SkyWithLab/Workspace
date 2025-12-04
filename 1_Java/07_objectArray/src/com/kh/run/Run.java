package com.kh.run;

import java.net.FileNameMap;

public class Run {
	/*
	 * 객체 배열: 여러개의 객체를 저장하는 구조
	 * *선언 클래스명[] 변수명;
	 * *할당(생성한다)라고 생각하라우
	 * 변수명 =  new 클래스명[배열크기];
	 * *배열에 값을 초기화(대입)
	 * 변수명[인덱스] = new 클래스명();
	 */
	
	public static void main(String[] args) {
		
		int[] iArr = new int[3]; // |0|0|0|
		
		//|1|2|3| -> 반복문
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = i + 1;
			
			System.out.println(iArr[i]);
			//----------------------------	
			/*
			 * 학생정보를 담을 객체배열 선언 및 할당
			 * *객체매열
			 *  클래스명[] 배열명 = new 클래스명[배열크기];
			 *  
			 */
		//Student[] stdArr = new Student;
			
		//for(int i=0; i < stdArr.length; i++) {
		//System.out.println( stdArr[i]);
			
			// 객체 배열에 데이터를 저장(대입)
			// 배열명[인덱스] = new클래스명();
		//stdArr[0] = new Student("최수정", 20, 88.5);
		//stdArr[1] = new Student("임수진", 20, 100.0);
		//stdArr[2] = new Student("아무개", 20, 66.5);
		
		//stdArr[1].printInfo();
		//stdArr.printInfo();  ( X
		//stdArr[2] = null;
		
		Student[] sArr = new Student[2];
		Scanner sc = new Scanner(System.in);
//--------------------------------------------
		for(int i=0; i<sArr.length; i++) {
			System.out.print("-이름:");
			String name = sc.next();
			
			System.out.print("-나이");
			int age = sc.nextInt();
			
			System.out.print("-성적");
			double score = sc.nextDouble();
			
			sArr[i] = new Student(name,age,score);
			
			for(Srudent s : sArr) {
				s.printInfo();
				
			}
		}
				
			}
			
	   }
	}
