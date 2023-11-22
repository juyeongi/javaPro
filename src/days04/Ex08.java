package days04;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		//if 조건문
		//for 반복문
		// swhich qnsrlans
		
		//key ; 변수, 수식 (정수, 문자열, 문자)
		//value ; 변수 사용 불가능
		/*
		switch (key) {
		case value:
			break;

		default:
			break;
		}//switch
		*/
		
		//정수를 입력받아서 짝,홀수 출력 : if,ifelse
		//switch로 출력
		int n;
		
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.print(">정수입력");
			n=scanner.nextInt();
			
			String result = null; 
			switch (n%2) {
				case 0:
					result ="짝수";
					break;
				case 1:
					result ="홀수";
					break;
			
			}//switch
			
			//The local variable result may not have been initialized
			//지역변수 지정안됨
			//result에 null값 지정
		
			System.out.println(result);
		} catch (Exception e) {
		}
		System.out.println("end");
		
	
		
	}//main

}//class
