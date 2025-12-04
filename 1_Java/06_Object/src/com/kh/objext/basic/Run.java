package com.kh.objext.basic;

public class Run {

	public static void main(String[] args) {
//		정의해둔 person 클래스 사용
//		=> 사용하기 위해선 객체 를 생성해야함
		
//		*변수 선언 : 클래스명 변수명;
		Person p1; //선언,,,만 했을 경우에, p1변수는 null 값 을 가지고 있는 상태일것임
		
//		*사람의 정보를 넣을 객체 생성(인스턴스를 생성한다)
//		변수명 = new 클래스명();    ======>    클래스명() : 생성자
		p1 = new Person();
		
		//*인스턴스 변수에 접근하고싶으면: ======> 변수명.필드명;  // . 연결해주는 연산자 (쩜)
		p1.name = "최수정";
		p1.age = 20;
		
		//인스턴스객체 메소드에 접근: 변수명.인스턴스메소드명()
		p1.introduce();
		
		//*선언과 할당을 동시에
		Person p2 = new Person();
		p2.name = "짝궁";
		p2.age = 18;
		
		p2.introduce();
		
		Person p3 = new Person("아이유", 33);
		p3.introduce();
				}
	
}
