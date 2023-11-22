package days05;

import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		int code;
		char one;
		
		//[1]
		System.out.print("한 문자 입력?");
		code = System.in.read(); 
		//키보드로 읽어들이는 함수, (int) 매개변수 x
		//ASCII 코드값을 불러들이는 함수
		System.out.printf("code =%d\n",code);
		//one = (char) code;
		//System.out.printf("one=%c\n",one);
		
		/*
		System.in.read(); //13
		
		 //한 문자 입력?a
         //code =97
         //한 문자 입력?code =13  :입력시 엔터값
		 
		System.in.read(); //10
		//한 문자 입력?a
		//code =97
		//한 문자 입력?code =10
		 */
		//System.in.skip(2); 
		System.in.skip(System.in.available()); //남은 바이트값 다 넘기기

		
	
		//[2]
		System.out.print("한 문자 입력?");
		code = System.in.read();
		System.out.printf("code =%d\n",code);
		//one = (char) code;
		//System.out.printf("one=%c\n",one);
		
		/*
		 * 한 문자 입력?a
            code =97
            한 문자 입력?code =13  :입력시 엔터값
		 */
	
	}//main

}//class
