package com.kh.inter.ex1;

public class Run {

	public static void main(String[] args) {
		/*사용자가 선택한 메뉴에 따라 동물 객체를 크기가 3인 배열에 담기
		*
		*/
	Scanner sc = new Scanner(System.in);
	//Animal[] i<aniArr.length; i++) {
	for(int i=0; i<aniArr.length; i++) {
		System.out.println("----- 동물 목록");
		System.out.println("1.고양이");
		System.out.println("2.호랑이");
		System.out.println("3.쥐");
		
		System.out.println(" : ");
		int menu = sc.nextInt();
		
		switch(menu) { 
		case 1:
			aniArr[i] = new Cat;
			break;
		case 2:
			aniArr[i] = new tiger;
			break;
		case 3:
		 aniArr[i] = new Mouse;
			break;
	}

	}
	//배열에 각 위치에 접근하여 메소드를 호출
	for (Animal animal : aniArr) {
		animal.makeSound();
		
		//baby일경웅는 움직이지 못합니다.출력
		if(animal instanceof Baby) {
			System.out.println("움직이지 못합니다.");
		}else {
			animal.move();	
	}
}
	}
	}
