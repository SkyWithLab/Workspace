package com.kh.collection.list.model.vo.Music;

public class Music {
	
	
//	기본생성자 , 모든필드를 매개변수로 가지는 생성자 
	
	public Music() {
		super();}
	
		
		
// getter, setter. toString 
	
	private String title;
	private String artist;
	public Music(String title, String atrtist) {
		super();
		this.title = title;
		this.artist = atrtist;
		
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAtrtist() {
		return artist;
	}
	public void setAtrtist(String atrtist) {
		this.artist = atrtist;
		
		
		
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", atrtist=" + artist + "]";
	}
}	
	
