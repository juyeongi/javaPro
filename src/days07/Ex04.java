package days07;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		int user;
		String inputData;
		
		Scanner scanner= new Scanner(System.in);
	
		//[1]
		/*
		do {
			System.out.print("> 가위(1), 바위(2), 보(3) 선택?");
			inputData= scanner.next();
		} while(!(inputData.equals("1") || inputData.equals("2") ||inputData.equals("3")));
		*/
		
		
		//[2]잘못 입력시 문구입력(정규표현식)
		// 첫번째 선택 + 그 외 (다시 반복될 때) 구분
		
	/*	
		String regex="[1-3]";
		boolean flag = false;
		do {
			if (flag) {//잘못 입력하고 다시 돌아왔을 때 if
				System.out.println(">[알림]입력 잘못(1~3)!!!");
			}//if
			System.out.printf("> 가위(1), 바위(2), 보(3) 선택?");
			inputData= scanner.next();
			flag=true;
		}while (!inputData.matches(regex));
			user = Integer.parseInt(inputData);
			System.out.println(user);
		*/	

		String regex="[1-3]";
		boolean flag = false;
		do {
			if (flag) {//잘못 입력하고 다시 돌아왔을 때 if
				System.out.println(">[알림]입력 잘못(1~3)!!!");
			}//if
			System.out.printf("> 가위(1), 바위(2), 보(3) 선택?");
			inputData= scanner.next();
			flag =true;
		}while (!inputData.matches(regex));
		
			user = Integer.parseInt(inputData);
			System.out.println(user);
 		
		
			
			
			/* 대소문자 아무거나 입력해도 특정문자로 변환
		System.out.println(Character.toUpperCase('y'));
		System.out.println(Character.toUpperCase('Y'));
		
		System.out.println(Character.isLowerCase('y'));
		System.out.println(Character.isLowerCase('Y'));
		//string문
		
		System.out.println("abc".toUpperCase());
		System.out.println("abc".toLowerCase());
		*/
		

	}//main

}//class 
