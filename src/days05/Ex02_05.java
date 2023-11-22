package days05;

import java.util.Scanner;

public class Ex02_05 {
	
	/*한 문자를 입력받아서
	   숫자, 알파벳(대,소문자), 한글, 특수문자(#$!%@)
	   입니다라고 출력하세요.
	   */
	public static void main(String[] args) {
		//한 문자 입력
		
		char one;
		
		try (Scanner scanner= new Scanner(System.in)) {
			System.out.print(">한 문자 입력?");
			String inputData = scanner.next(); //"a"
		
			String regex ="[#@$!]";
			if(inputData.matches(regex)){
				System.out.println("특수문자");
			}//if  []안에 하나만 일치해도 true
			//matches : true/false
			
			
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}//main

}//class
