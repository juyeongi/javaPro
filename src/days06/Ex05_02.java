package days06;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05_02 {
	public static void main(String[] args) {
		//잘못 입력된 값 
		//정규표현식, 예외처리
		int n; //정수를 저장할 변수 선언
		
		try (Scanner scanner= new Scanner(System.in)) {
			//문자x,실수x 정수만 가능
			System.out.print(">정수(n)입력");
			String inputData=scanner.nextLine();

			//정규표현식 (regular experssion)
			//0~9 숫자로만 이루어진 문자열 체크하는 정규표현식
			//String Regex="^[0-9]+$"; [0-9] == \d
			String Regex="^\\d+$";//숫자가 한개 이상으로 이루어져야함
			//"[0-9]+";//숫자가 한개 이상으로 이루어져야함
			//^시작부터 / %끝까지
			boolean flag =inputData.matches(Regex);
			
			if (!flag) { //flag==false 참/거짓 바꾸는 연산작업
				n= Integer.parseInt(inputData);
				System.out.println(n);
			} else {
				System.out.println("입력잘못");
			}//if
			
			
			/*
			if (!flag) { //flag==false 참/거짓 바꾸는 연산작업
				n= Integer.parseInt(inputData);
				System.out.println(n);
			} else {
				System.out.println("입력잘못");
			}//if
			//n=scanner.nextInt();
			 * */
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
	}//main

}//class
