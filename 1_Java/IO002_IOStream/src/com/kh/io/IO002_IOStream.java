package com.kh.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;         //ctrl shift o 임폴트 단축키

public class IO002_IOStream {

		/*
		 * 입출력
		 * : 프로그램상의 데이터를 외부 매체로 출력하거나, 반대로 외부 매체로부터 프로그램으로 데이터를 
		 *   입력받고자 할 때
		 *   -스트림 : 외부 매체로부터 들어오고 나가는 통로,,/ 
		 *          프로그램과 외부 매체사이의 데이터를 주고받는 통로 (단방향)
		 *     *틀징: 입력용 스트림 출력용 스트림이 나누어저 이씀
		 *     -> 입력용 출력용 동시에 하고자 한다면?
		 *     입력용 스트림과 출력용 스트림을 각각 사용해야함
		 *   -선입선출 : (FIFO) 
		 *   		   first in, first out 먼저들어온 데이터 먼저처리됨
		 *   *구분
		 *   >사이즈 : 바이트(1byte) / 문자(2byte)
		 *   
		 *   -바이트스트림: 1byte씩 데이터가 왔다갔다하는 통로
		 *   -> 입력용 : Input
		 *   -> 출력용 : outputStream
		 *   
		 *   -문자스트림: 2byte 씩 데이터가 왔다갔다 통로
		 *   -> 입력용 : reader
		 *   -> 출력용 : Writer
		 *   
		 *   외부매체와 직접연결 유무>
		 *   -기반스트림 : 외부 매체와 직접적으로 연결되는 통로, 필수로 사용해야 함.
		 *   -보조스트림 : 기반 스트림을 보조하는 통로
		 *   			속도를 빠르게 하거나, 유용한 기능을 제공하기 위한 스트림.
		 *   			단독사용 불가, 반드시 기반 스트림과 함께 사용
		 */
	
//==============================================================================
	
		public static void main(String[] args) {
//			IO Stream 을 사용해서 키보드로 입력받고, 콘솔창(모니터)에 출력하는 작업을 해보자

//			키보드 입력---->프로그램---->콘솔창출력됨  (데이터의 흐름)
			
			InputStream in = System.in; // 표준 입력 스트림
			OutputStream out = System.out; //표준 출력 스트림
			
			
			byte[] buf = new byte[1024];
//			 -> 입출력 시 버퍼의
			int len = 0; //데이터의 길이를 저장할 변수
			
			try {
				
			while( (len = in.read(buf)) != -1) {
				
				
				out.write(buf, 0, len);
				
				out.flush();
				
			}
			}catch(IOException e) { 
				e.printStackTrace();
			} finally {
//				 -> 예외 발생유무 상관없이 무조건 실행하는 내용
//				*사용한 스트림 객체(자원)을 해제(사용완료처리)
				
				
				try {
					in.close();
					out.close();
					
				
				}catch(IOException e) {
					e.printStackTrace();
				}finally{	
				}
			}
		}
}
