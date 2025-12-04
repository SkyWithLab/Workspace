package com.kh.collection.map.model.vo;

public class Snack {

	private String flavor;  //맛
	private int calory;     //칼로리
	
	
//	기본생성자, 모든 필드를 매개변수로 가지는 생성자
	public Snack() {
		super();
	}
	
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

//	getter, setter
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

//	toString
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}

}
