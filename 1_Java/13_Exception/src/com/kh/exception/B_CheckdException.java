package com.kh.exception;

import java.io.BufferedReader;        // ctrl shift o 
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckdException {
/*
 * CheckdException : 반드시 예외처리가 필요한 예외
 * 
 * -> 주로 외부 매개체와 입출력이 일어날 때 발생 (파일, 네트워크 통신)
 */
	
	public void test1() {
		//test2();
		  test3();
		 try {
			 test3();
		 }catch(IOException e) {
			 System.out.println("예외 발생@@");
		 }
	}
//	Scanner 와 비슷한객체 ( 문자열로만 읽음)
	
	public void test2() {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		System.out.print("입력 : ");
		//String str = br.readLine();
	
		try {
			String str = br.readLine();
			System.out.print(str);
			} catch (IOException e) {
				System.out.print("예외발생");
	
		}
	 }
	public void test3() throws IOException{
		BufferedReader br = new BufferedReader(
							new InputStreamReader(System.in) );
		
		System.out.print("입력 : ");
		
		String str = br.readLine();
		System.out.print(str);
		
	}
}
