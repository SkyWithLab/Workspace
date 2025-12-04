package com.kh.colletion.set.run;

import java.util.HashSet;

import com.kh.colletion.set.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=> 저장 순선 유지x, 인덱스 x, 중복된 데이터 저장 불가
		
//		*String 클래스에는 hashCode()가 오버라이딩 되어 있음
//		=> 실제 담긴 문자열으 가지고 10진수 형태로 반환
		
//		*String 클래스에 equals() 도 오버라이딩 되어 있음
//		 => 실제 담긴 문자열의 값을 비교하여 일치하면 true, 그러지 않으면 false
		
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student("홍길동", 40,77) );
		hs2.add(new Student("장원영", 20,100) );
		hs2.add(new Student("안유진", 25,98) );
		hs2.add(new Student("장원영", 20,100) );
		
		System.out.println(hs2);
		// => 중복 제거가 되지 않음
		
		//object 클래스의 hashCode()
		// => 해당 객체의 "주소값"을 가지고 10진수 형태로 반환
		// => 두 객체의 "주소값"을 비교해서 같으면 true, 다르면 false
//		====================================================
		
//		Students 에 hashCode() 오버라이딩
//		=> 실제 각 필드에 담긴 데이터들이 일치하면(합해서) 10진수 형태로 반환
//		students 에 equals() 오버라이딩
//		=> 실제 각 필드에 담긴 데이터를 가지고 비교. 모두 일치하면 true, 그렇지 않으면 flase
		
		System.out.println (new Student("장원영", 20 , 100).hashCode());
		System.out.println (new Student("장원영", 20 , 100).hashCode());
		
		
	}

}
