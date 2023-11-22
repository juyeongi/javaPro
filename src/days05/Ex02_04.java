package days05;

import java.util.Scanner;

public class Ex02_04 {
	
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
	
			if (Character.isDigit(one)) {  //[0-9] ==\d 정규표현식
				System.out.println("숫자");
			} else if (Character.isAlphabetic(one)){  //[a-zA-Z] 정규표현식
				System.out.println("알파벳");
			 
			}else if ('가' <- one &&one <- '힣' ) {
				System.out.println("한글");	
				//(#$!%@)정규표현식
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
