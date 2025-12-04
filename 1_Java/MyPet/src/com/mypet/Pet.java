package com.mypet;


public class Pet {		//	1. 펫의 정보를 담을 클래스 


		private String name;  		//변수명 이름
		private int fullnessScore;		//포만감점수
		private int happyScore;		//즐거움점수
		private int cleanScore;		//청결함점수
		private petType type;		//펫의 종류!!! 종류는 다양하게 추가할 수 있음 호랑이다람쥐 ...등
									//확장될 수 있어서 따로 분리할거임


//=======================================================================================

		public Pet() {} 			//클래스명과 동일하게, 매개변수가 없는 생성자를 기본생성자라고 함
		
		public Pet(String name, PetType type) {			//매개변수가 있는 생성자.. 이름, 펫타입
			
			this.name = name;
			this.type = type;
		
//			상태(포만감, 즐거움, 청결함) 에 대해서는 기본값(50)으로 초기화
			this.fullnessScore = 50;		//this를 생략해도 됨
			this.happyScore = 50;
			this.cleanScore = 50;
	}
	
//=======================================================================================
	public void eat() {  
		type.eat(this);
	}
	public void clean() {
		type.play(this);
	}
	public void play() { 
		type.clean(this);
	}
	
	public void updateFullnessScore(int value) {
		
}
	public static void main(String[] args) {
		
	}
}
