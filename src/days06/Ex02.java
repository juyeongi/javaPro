package days06;
//5일차복습3)
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		int code;
		//Syntax error on token "continue", invalid VariableDeclaratorId
		//예약어(continue)를 변수로 사용 불가능 
		//char continue='y';
		char con='y';
		do {
			System.out.print("한 문자 입력?");
			code = System.in.read(); 
			System.out.printf("code =%c\n",(char)code);
			
			System.in.skip(System.in.available());
			
			System.out.print("\n\n 계속할거냐?");
			//br, scanner, System.in.read() 사용가능
			code = System.in.read(); //'y','n'
			con=(char)code;
			
			System.in.skip(System.in.available());
					
		} while(con =='y' || con=='y');
		System.out.println("end");
		
		/*
		//[1]
		System.out.print("한 문자 입력?");
		code = System.in.read(); 
		System.out.printf("code =%d\n",(char)code);
		//System.in 입력스트림['a']['\r13']['\n10']
		//a엔터 (\r,\n) =엔터입력값
		//0~255 int read() next 1byte
		System.in.skip(System.in.available()); //남은 바이트값 다 넘기기

		
	
		//[2]
		System.out.print("한 문자 입력?");
		code = System.in.read();
		System.out.printf("code =%d\n",(char)code);
		
		*/


	}//main

}//class
