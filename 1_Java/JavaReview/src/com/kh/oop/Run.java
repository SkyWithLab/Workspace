package com.kh.oop;

public class Run {

	public static void main(String[] args) {
//		결제 방식별 객체 생성
		Toss toss = new Toss();
		BankTransfer bt = new BankTransfer("1234-1231");
		
		toss.process(1000);
		System.out.println();
		bt.process(3000);
		
//		다형성 적용. 부모 타입으로 자식 객체들을 다루는 기술
		PaymentMethod pm1 = new Toss();
		PaymentMethod pm2 = new BankTransfer("1234-1234");
		
		pm1.process(5000);
		System.out.println();
		pm2.process(7700);
		
//		----------------------------------------------------
		PaymentMethod[] methods = new PaymentMethod[4];
		
	}

}
