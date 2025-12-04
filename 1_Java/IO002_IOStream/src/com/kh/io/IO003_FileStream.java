package com.kh.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO003_FileStream {

	public static void main(String[] args) {
		
//		fileSave();
		fileRead();
		
	}

//	프로그램---> 파일: 출력
	public static void fileSave() { 
//		*기반스트림 : FileWriter. 파일을 직접적으로 연결하여 2바이트씩 출력하는 스트림
//		*보조스트림 : bufferedWriter. 속도 향상을 도와주는 보조스트림

		System.out.println(" **** file save****");
		
		/*
		BufferedWriter bw= null;
		
//		1.기반스트림생성
		try {
			
		
		FileWriter fw = new FileWriter("file1.txt");
		
//		2.보조 스트림 생성
		BufferedWriter bw = new BufferedWriter(fw);
//		보조 스트림 객체 생성 시 기반 스트림 객체를 전달한다
		*/
//		try eith resources 구문  ->  자원을 알아서 해제해주는 구문
		try (BufferedWriter bw = new BufferedWriter(
								new FileWriter("file1.txt"))) {
		bw.write("기반 스트림으로 출력!");
		bw.write("입출력 재밌다");
		bw.newLine(); //줄바꿈처리
		
		bw.write("오늘은 비가 왓당");
		
		bw.flush();
		
//		bw.close();
		
		}catch (IOException e ) { 
			e.printStackTrace();
		}/*finally {
			try {
				if(bw!=null) {
					bw=close();
				}
			}catch (IOException e ) { 
				e.printStackTrace();
			
		}
		
	}*/
  }
	
	public static void fileRead() {
//		파일-----> 프로그램 : 입력
		
//		*FileReader : 기반스트림 *BufferedReader : 보조스트림.한줄씩 데이터를 읽어오도록 도와줌
		System.out.println("****file read ****");
		
		try( BufferedReader br = new BufferedReader( new FileReader("file1.txt") )){
			
//			파일내용읽어오기
			/*
			System.out.println( br.readLine() );
			System.out.println( br.readLine() );
			System.out.println( br.readLine() );
//			읽어올 내용이 없을 땐 null 로 반환됨.
			*/
			String data;
			while( (data = br.readLine()) != null ) {
				System.out.println(data);
				
			}
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

