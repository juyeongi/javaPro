package days05;

import java.util.Scanner;

public class Ex02 {
	
	/*한 문자를 입력받아서
	   숫자, 알파벳(대,소문자), 한글, 특수문자(#$!%@)
	   입니다라고 출력하세요.
	   */
	public static void main(String[] args) {
		//한 문자 입력
		
		char one;
		
		try (Scanner scanner= new Scanner(System.in)) {
			System.out.print(">한 문자 입력?");
			//scanner.next char x
			//"A"  > 'A' 문자열의 첫번째 문자 A 읽어오기
			//"A"문자열은 항상 null 포함되어있음
			
			String inputData = scanner.next(); //"a"
			one = inputData.charAt(0); //'a'
			/*
			if (숫자조건식) {
				숫자
			} else if (알파벳 (대소 조건식)){
				알파벳
			} else if (한글조건식) {
				한글			
			} else if (특수문자조건식) {
				특수문자
			}else {
				알 수 없는 문자입니다.
			}
			*/
			if ('0'<=one && one<='9') {
				System.out.println("숫자");
			} else if ('a' <- one &&one <- 'z' || 'A' <- one&&one <- 'Z'){
				System.out.println("알파벳");
			 
			}else if ('가' <- one &&one <- '힣' ) {
				System.out.println("한글");		
			}else if (one =='#'|| one == '$'||one == '!'||one == '%'||one == '@') {
				System.out.println("특수문자");
			}else {
				System.out.println("X");
				
			}//if
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}//main

}//class
