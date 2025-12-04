package com.kh.basic;

public class Variable {

	public static void main(String[] args) {
		
	}
// 변수: 데이터를 저장하는 공간
	
//	*변수 선언 : 자료형 변수명;
//	*값대입 : 변수명 = 값;
	
//	자료형: 데이터의 모양과 크기(종류)
//	"abc","안녕" --->String 문자열
//	100.0.-22 ---> int 정수 ,
//10.55.... ---->double 실수
//'a''김' char (한글자, 문자형)
//true false ---> boolean 논리형
//
	public static void test1() {
//		이름, 수학점수, 영어점수, 통과여부 등에 대한 데이터를 저장
		String name = "홍길동";
		int math = 70;
		int eng = 85;
		boolean isPassed = false;
		
// 평균 점수를 구하기
		int avg = (math + eng) / 2; //(+괄호안에 넣는이유 먼저 계산되라고)
//		평균점수 60 이상 통과
		isPassed = avg > 60;
		
		 System.out.println("이름 : " +name);
		 System.out.println("수학점수 : "+ "\n");
		 System.out.printf("영어점수 : + %d\n", eng);
		 System.out.println("평균 : "+avg);
		 System.out.println("통과여부 : " + (isPassed ? "P" : "NP"));
		 
	}
}
