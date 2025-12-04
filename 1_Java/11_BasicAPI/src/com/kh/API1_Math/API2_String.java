package com.kh.API1_Math;

public class API2_String {

	public static void main(String[] args) {
//		test1();
		test2();
		
	}
	public static void test1() {
		
		String str1 = "Happy";
		String str2 = "Happy";
		
		System.out.println( str1 == str2); // 결과?
		
//		결과가 true 인 이유는? 문자열 값 자체를 대입하게 되면, "(((((상수풀)))))" 이라는 공간에 저장됨
//		같은곳을 가리키게 됨! 상수풀은 힙 안에 공간이 이씀(주소값이 같다는것)
		
		System.out.println( str1 =="Happy");
//		str1이 가리키고 있는 주소와 "Happy"라는 값 자체가 저장된 주소를 비교
//		=> 결국 둘 다 같은 곳을 가리키게 됨!!!
		System.out.println( "=====================================================");
		String str3 = new String("Happy");
		String str4 = new String("Happy");
		
		System.out.println( str3 == str4);
		// new라는 공간은 새로운 공간을 할당하기 때문에, 주소값이 다르기 때문,,
		
		System.out.println( str3 == "Happy");
//		위치가 다르게 저장되어 있음 false 
		
//		*문자열 값을 비교하고자 할 떄 : equals
		
//		============================================================================
		
//		String str5 = "Good";
//		String str6 = "Luck";
		
//		System.out.println( str5 );
//		System.out.println( str5 toString());
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
//		*문자형 배열 -> 문자열로 변환: static valurOf(배열): String
		System.out.println( String.valueOf(arr) );
	}
//		Stringdl 그동안 어떻게 저장되고 있던건지 알아본거임
		
		public static void test2() {
//			*equals -> 문자열A.equals(문자열B):boolean
//					   문자열A와 문자열B가같은지 비교하여 리턴
			String str1 = "Hello";
			
			System.out.println( str1.equals("Hello"));
			System.out.println( str1.equals("Bye"));
			
//			*charAt -> 문자열.charAt(인덱스):char
//						문자열에서 인덱스 위치의 문자를 리턴
			System.out.println( str1.charAt(1) );
			
//			*문자열 길이 length
//			*length -> 문자열.length():int
//						해당 문자열의 길이를 리턴
			System.out.println( str1.length() );
			
//			->str1 변수의 마지막 문자 출력 'o'
//			System.out.charAt
			
//			문자열 모두 대문자로 바꿔 리턴-> toUpperCase 
			
//			문자열 모두 소문자로 바꿔 리턴-> toLowerCase
			System.out.println( str1.toUpperCase () );
			System.out.println( str1.toLowerCase () );
			
//			conrains => 문자열A.conrains(문자열B):boolean
//						문자열A에 문자열B가 포함되어 있는지 확인하여 리턴
			System.out.println( str1.contains("el") );
			System.out.println( str1.contains("tt") );
//			indexOf -> 문자열A.indexOf(문자열B):int
//					   문자열A에 문자열B의 시작 인덱스를 리턴
			System.out.println( str1.indexOf("el") );
			System.out.println( str1.indexOf("tt") ); 
			//인덱스는 0~ 시작하기때문에 -1은 없는거라고 볼수 있음
			
//			substring -> 문자열.substring(시작인덱스):String
//						문자열에서 시작인덱스부터 마지막 위치까지 문자열을 추출하여 리턴
//					  ->문자열.substring(시작인덱스, 끝인덱스):String
//						문자열에서 시작인덱스부터 끝인덱스 직전까지 문자열을 추출하여 리턴
			System.out.println( str1.substring(2) );
			System.out.println( str1.substring(2, 4) );
			
//			repeat		-> 문자열.repeat(개수):String
//						->  문자열을 개수만큼 반복하여 문자열 반환
			System.out.println( str1.repeat(5) );
			System.out.println( "-".repeat(10) );
			
//			split		-> 문자열.split(구분자):String
//						-> 해당 문자열을 구분자를 기분으로 분리하여 문자열 배열형태로 반환
			String str2 = "JACA#PYTHON#SQL";
			String[] arr = str2.split("#");
			
			for(String s : arr) {
				System.out.println(s);
				
			}
		}
		
	}

