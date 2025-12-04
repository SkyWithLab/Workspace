package com.kh.API1_Math;

public class API2_StringBuilder {

	public static void main(String[] args) {
		
		
		String str = "summer";
		StringBuilder sd = new StringBuilder(str);
		
		System.out.println(sd);
		System.out.println(sd.toString());
		
		int hash = System.identityHashCode(sd);
		System.out.println(hash);
		
//		*값을 변경: 변수명.append (추가할 값)
		sd.append(" is hot ! ! ");
		sd.append("####");
		
		System.out.println(sd);
		
		int hash2 = System.identityHashCode(sd);
		System.out.println(hash2);
	}
	

}
