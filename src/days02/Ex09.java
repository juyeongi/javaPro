package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09 {

	//import [java.lang.]*;(모든 클래스 생략가능)
	             //패키지명       
	//import구문 추가 : 패키지명 생략 (java.io., =>io (input,output)java.lang....)
	

	//컨트롤스페이스 누르깅,,
	public static void main(String[] args) throws IOException {
		
		String name = "이주영";
		//바이트스트림-> 문자 스트림 변환-> 라인단위 처리 스트림 변환
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		
		System.out.print(">이름을 입력하세요");	
		name = br.readLine();
			
		System.out.printf("> 이름 : %s\n", name);
		
	}//main
}//class
