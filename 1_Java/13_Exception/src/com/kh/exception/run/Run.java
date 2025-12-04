package com.kh.exception.run;

import com.kh.exception.A_UnCheckdException;
import com.kh.exception.B_CheckdException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 에러종류
		 * -시스템에러 :컴퓨터의 오작동으로 발생, 소스코드로 해결 불가. 심각...
		 * -컴파일에러 :오타, 문법문제.. 소스코드 문법상의 오류 -> 빨간줄로 표시(개발자 실수)
		 * -런타임에러 :소스코드상 문법문제는 없지만,, 실행중발생하는 에러다..
		 * 실행 환경이나 입력문제 등으로 발생
		 * 
		 * -논리에러 : 프로그램 문법에는 문제가 없지만, 의도한 동작이나 결과가 다르게 나오는경우
		 *			기능자체가 이상할떄
		 *-> 시스템 에러를 제외한 (컴파일,런타임,논리) 에러들을 개발자가 처리할 수 있는 예외에해당
		 *										(Exception)에 해당
		 *이렇게 예외가 발생했을 떄 프로그램이 비정상 종료되지 않도록 처리하는 방법이 -> 예외처리
		 *
		 *1. try - Catch
		 *2. throws 이용
		 */
		A_UnCheckdException a = new A_UnCheckdException();
		//a.test1();
		B_CheckdException b = new B_CheckdException();
		b.test1();
		
	}

}
