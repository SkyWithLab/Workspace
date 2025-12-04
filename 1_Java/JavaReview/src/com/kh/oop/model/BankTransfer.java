package com.kh.oop.model;

//		paymentMethod 상속
public class BankTransfer extends PaymentMethod {
//		계좌번호
	private String accountNumber;
	
	public BankTransfer(String accountNumber) {
		this.accountNumber = accountNumber;
			super("계좌이체");
			this.accountNumber = accountNumber;
	}
	@Overvide
	public void process(double money) {
		System.out.println("결제방식:"+getMethodName());
		System.out.println(":")
		System.out.println(":")
	}
}
