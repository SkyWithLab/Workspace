package com.kh.colletion.set.model.vo;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student(){}
	public Student(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
		
//		ctrl Shift S O 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
//	Ctrl Shift S S
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
		
	@Override
	public int hashCode() {
//		모든 필드의 값이 일치하면 동일한 hashCode 반환
//		=> 문자열로 만들어서 해시값 반환
		String str = name + age + score; // 장원영20100
		return str.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
//	 	현재 객체와 전달받은 객체의 각 필드값들이 모두 일치하면 true, 그렇지 않으면, flase
//		this ( 현재객체)     |    obj ( 전달받은 객체)
//		Student                 Object
		Student other = (Student)obj; 
		
//		this ( 현재객체)     |    other (전달받은객체)
//		this.name other.name 일치하는지 확인 : String
//		this.score other.score 일치하는지 확인 : int
//		this.score other.score 일치하는지 확인 : String
	}
		
		
		
		
		

	
	
	
	
	/*public Student(String name, int age, int score, HashSet<Student> hs2) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.hs2 = hs2;
	}*/






//		=> 저장 순선 유지x, 인덱스 x, 중복된 데이터 저장 불가
		
//		*String 클래스에는 hashCode()가 오버라이딩 되어 있음
//		=> 실제 담긴 문자열으 가지고 10진수 형태로 반환
		
//		*String 클래스에 equals() 도 오버라이딩 되어 있음
//		 => 실제 담긴 문자열의 값을 비교하여 일치하면 true, 그러지 않으면 false
		/*
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student("홍길동", 40,77) );
		hs2.add(new student("장원영", 20,100) );
		hs2.add(new student("안유진", 25,98) );
		hs2.add(new student("장원영", 20,100) );
		
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	*/
}
