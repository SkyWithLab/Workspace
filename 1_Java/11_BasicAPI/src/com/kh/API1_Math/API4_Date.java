package com.kh.API1_Math;

import java.text.SimpleDateFormat;
import java.util.Date;                    //* Ctrl Shift o 

public class API4_Date {

	public static void main(String[] args) {
//		jaca.util.date 클래스
//		*날짜, 시간 관련 클래스
		
		Date date = new Date();
		
		System.out.println(date);
//		
		
// 		*특정일에 대한 데이터로 생성 
//		new date (연도, 월, 일)
//		-연도 : 지정연도 -1900
//		-월 : 지정월 -1
//		Date date2 = new Date(2025, 8,19);
		
		Date date2 = new Date(2025-1900, 8-1, 19);
		System.out.println(date2);
		
//		형식을 지정하는 클래스 : java.text.SimpleFateFormat
		
//		형식정의
		String format = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println( sdf.format(date));
		
//		
//		 java.time.LocalDateTime
		
//		 LocalDateTime date3 = LocalDateTime.now();
		 
//		 System.out.println(date3);
		 
//		 getMonth
//		 System.out.println(date3.getMonth());//영어로 반환
		
//		 일 정보 반환 : getDayOfMonth() );
//		System.out.println( date3.getDayOfMonth() ); //월 기준 일 반환
//		System.out.println( date3.getDayOfYear() ); //연 기준 일 반환
		
//		올 해 며칠 남았는지?
//		System.out.println( "올해는 ... " + (365 - date3.getDayOfYear() )
//		+ "일 남았습니다.");
		
		// * 시 정보 반환 : getHour
//		System.out.println(date3.getHour());
		
//		*형식 지정하기
//		java.time.fotmat.DateTimeFormatter
		
//		date3.format(date3.format(
//				DateTimeFormatter.ofpattern("yyyy=MM-dd hh:mm:ss")
//				);
//		System.out.println(format2);
		
		
//		-=================외울피료 없음 그때그떄 필요할 때ㅑ 찾아서 쓰세요-=------===========
		
		
	}

}
