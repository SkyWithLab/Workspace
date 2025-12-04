package com.kh.object.model;

public class Book {
	
	private String title;
	private String author;
	
	public Book() {
//		생성자의 특징: 클래스명과 동일하다 반환형이 없음//
//		기본생성자 : 생성자가 하나도 정의되어 있지 않았을 떄 자동으로 추가되는 생성자
	}

	public Book(String title, String author) {
//		매개변수 생성자: 전달되는 값을 해당 필드에 초기화해주는 생성자
		this.title = title;
		this.author = author;
	}
	public String toString() {
//		오버라이딩 되는 메소드 
//		모든 필드의 값을 문자열로 반환
		return "title" + title +", author:" +author;
		
	}
	
//		접근제한자 예약어 반환형 메소드명(매개변수정보들) {}
//		동작할 내용
	
	public String getTitle() {
		return title;
		
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}

