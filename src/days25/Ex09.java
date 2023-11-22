package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex09 {
	public static void main(String[] args) throws IOException {
		//이름 입력받아서 출력
		// Scanner 사용
		// BufferedReader 사용
		
		//1. 표준입력장치 (키보드)로부터 입력받기 > 표준입력스트림
		//												System.in
		//						byte스트림, String 읽어올 수 없음
//		InputStream is =System.in; //system in : byte스트림
		System.out.println(">한글 한 문자 입력");
//		InputStreamReader isr = new InputStreamReader(is);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int code = isr.read(); //InputStreamReader int로 반환
		System.out.println((char)code);
		
		/*
		int code ;
		System.out.println(">name input");
		code = is.read(); //1바이트(0~255 정수 int) 반환하는 메서드
		System.out.println((char)code);
		*/
		/*
		byte [] cbuf = new byte[3];
		System.out.print(">name input");
		is.read(cbuf);
		*/
		// byte [] cbuf > char one 변환
		
		//InputStream[Reader] 보조 문자스트림
		//byte > char 변환해주는 보조스트림
		
		//Buffered[Reader]
		//InputStream[Reader] 가 변환시킨 문자를 라인으로 읽어옴
	}//main
}//class
