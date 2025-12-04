package com.kh.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionPractice {
//		파일 경로를 저장할 변수
	private final String FILE_PATH = "todos.txt";
	
	
	public final static void main(String[] args) {
		
		
		
		
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in); // 입력용표쥰 스트림 시스템.인
		
//		파일 ---> 프로그램(입력) 데이터를 읽어와서 List에 추가
		loadTodos(list);
		
		
		
		while(true) {
		System.out.println("=====TODO LIST======");
		System.out.println("1.할 일 추가");
		System.out.println("2.전체보기");
		System.out.println("3.파일에 저장");
		System.out.println("9.종료하기");
		
		System.out.println("선택 :");
		int menu = sc.nextInt();
		sc.nextLine();//버퍼 비우기!
		
		switch(menu) {
		case 1:
			System.out.print("추가할 할일 입력 : ");
			String todo = sc.nextLine(); // \n
			
			
			list.add(todo);
			break;
		case 2:
			System.out.print("====전체 목록====");
			
			for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			}
			break;
		case 3:
			saveTodos(list);
//			List에 저장된 할일 목록을 파일에 저장
//			프로그램---> 파일 : 출력용 스트림
		case 9:
			System.out.print("종료합니다");
//			break; -> switch만 빠져나옴 종료 아님
			return; //메소드 자체를 종료시킴..
		default:
			System.out.print("없는 메뉴입니다 다시 선택해주세요");
		}
		}
	}
	/*
	 * 파일에 할 일 목록 저장
	 * @param todos 저장할 할일목록
	 */
	public static void saveTodos(List<String> todos) {
//		*출력용 스트림: FileWriter, BufferedWriter(속도가 빠름)
		
//		* try with resources 구문 -> 자원해제를 알아서 해주는 구문
//		String filepath = "todos.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH) )) {
			
//			반복문을 사용하여 리스트 안에 저장된 할일들을 하나씩 파일로 출력
			for(String todo : todos) {
				
				bw.write(todo);
				bw.newLine(); // 줄바꿈처리????
				
				
			}
			
			System.out.println("파일에 저장이 완료되었습니다.");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 파일에 저장된 내용을 읽어오는 메소드
	 * 
	 * @param todos 읽어온 내용을 저장할 리스트 
	 * 
	 */
	public static void loadTodos(List<String> todos) {
//		파일이 있는 경우레 읽어오기
//		파일이 없는 경우에는 메소드 종료
		exists()
		
		File file - new File(FILE_PATH);
		if( file.exists() ) { //파일이 존재하지 않는 경울 읽어오지 않음
			return;
		}
//		파일에서 데이터를 읽어오기 위해 입력용 스트림
//		FileReader : 기반스트림, BufferedReader : 보조스트림
		
		try (BufferedReader br = new BufferedReader)new FileReader(FILE_PATH) )) {
			
			String line;
			while( ( line = br.readLine()) != null ) {
				todos.add(line);
			}
			
			System.out.println("파일에 저장된 내용을 모두 읽어왔습니다.");
			
		}catch (FileNotFoundException e) {
			
			System.out.println("읽어올 내용이 없습니다.");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
