package com.kh.io;

import java.io.File;
import java.io.IOException;

public class IO001_File {


		
		/*
		 * 자바에서는 파일을 다루는 객체로, File(ja.util) 경로에 존재.
		 */
	public static void main(String[] args) {
//		test1();
		test2();
		}
	
	
		public static void test1() {
		}
		public static void test1() {
//			*sample 폴더 생성 후 myDiary.txt 파일 만들어보기!
			
//			sample폴더 생성(1)
			File folder = new File("sample");
			
//			폴더가 존재하지 않을경우 생성
			if (!folder.exists())  {
				folder.mkdir();
		}
//			sample 폴더에 마이다이어리 파일 생성
			File file = new File("sample\\myDiary.txt");
			
			try {
				file.createNewFile();
					
		} catch(IOException e) { 
			e.printStackTrace();
		}
//			File 겍체 생성
			File f1 = new File("test1.txt"); 
			
//			존재하는 파일명으로 객체 생성
			File.f2 = new File("D:\\test2.txt");
			
//			특정 경로의 존재하지 않는 파일명으로 생성해보기!
			File f3 = new File("D:\\test3.txt");
			
//			존재하지 않는 경로로 생성
//			File f4 = new File("D:\\tmp\\test4.txt");
			File f4_folder - new File("D:\\tmp");
			File f4 = new File("D:\\tmp\\test4.txt");
			
//			파일이 존재하는지 유무 확인
			File f5 = new File("test5.txt");
				
			
		try {
//			파일 생성
			fi.createNewFile();
			f2.createNewFile(); //존재하는 파일에 대해서는 따로 처리X
			f3.createNewFile();
//			f4.createNewFile();
			
//			*파일이 존재하는지 확인 : exists():boolean
			System.out.println("test1.txt파일이 존재하는가?"+ f1.exists());
			System.out.println("test5.txt파일이 존재하는가?"+ f5.exists());
//			존재하지 않는 경로에 파일을 생성하려고 하면 예외가 발생되었따 ...
//			폴더를 먼저생성하고, 그 다음에 파일을생성해야한다
			
//			*파일인지 확인 : isFile():boolean
			System.out.println("f4는 파일인가 ?" + f4.isFile());
			System.out.println("f4_folder 는파일인가? " +folder.isFile());
			
//			*폴더 생성 : mkdir
			f4_folder.mkdir();
			f4.createNewFile();
			
			
		} catch(IOException e) {
			e.printStackTrace(); 
			
		}
			
	}
	}

//F5 ,,,,,,,???????
