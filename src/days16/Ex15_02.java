package days16;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15_02 {
	// [개발자가 강제/고의로 예외 발생]
	/*
	 * 1. new 예외클래스()  (예외 객체생성)
	 * 2. throw문을 사용해서 예외 발생
	 * 		ex)국어점수 입력받아서 수~가 등급 성적처리
	 * 			0<=~<=100 점수범위가 벗어나면 예외발생처리 
	 */
	public static void main(String[] args) {
	
		 //[checked 예외]
		//Unhandled exception type IOException  
		//public abstract int read() throws IOException;  //read
		//System.in.read();
		
		
		//****[unchecked]예외 runtimeException 상속*****
		//int kor =getScore();
		//System.out.println(kor);
		
		
		/*
		try {
			int kor =getScore();
			System.out.println(kor);
			
		} catch (InputMismatchException e) {
			System.out.println(e);
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//예외발생 유무 상관없이 처리
		}
		System.out.println("end");
		*/
	}//main

	private static int getScore() throws IOException{
												//	ㄴ발생할 수 있는 예외객체 > 선언 후 main에 try catch문 선언
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.println(">점수입력");
		String input = scanner.next();
		String regex ="100|[1-9]?\\d";
		
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		}else {
			//강제 예외발생 : throw new +객체
			throw new IOException("점수 범위 벗어남");
		}//if
		
	}
}//class
