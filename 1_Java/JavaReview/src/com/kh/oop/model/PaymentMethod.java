package com.kh.oop.model;

public class PaymentMethod {

//	결제 수단 정보를 담을 클래스 
	private String methodName;
	
	public PaymentMethod(String methodName);
	this.methodName = methodName;
	
	public String getMethodName() {
		return methodName;
	}
		
// 결제로직 -> 추상메소드
// 			: 몸체없는 메소드. 규격만 잡아놓은 메소드
	public abstract void process(double money);	
}

