package days03;

public class Ex11 {
	
	//*** 인덱스 연산자 '[]'
	
	public static void main(String[] args) {
		//1. 국어점수를 저장할 변수 선언
		//int kor;
		
		//2. 국어점수를 5만명 저장할 변수 선언
		/*
		 * int 이주영kor;
		 * .
		 * .
		 */
		
		
		/*int kor00001;
		int kor00002;
		int kor00003;
		.
		.
		int kor50000;
		*/
		
		//인덱스(청자값)[]  연산자를 사용해서 배열선언
		
		// 참조형 : 배열, 클래스, 인터페이스 (new 연산자에 의해 동적영역에 메모리가 할당되어 []위치에 저장됨) 
		/* 1.배열 정의 : **동일한 자료형**을 메모리상에 연속적으로 놓이게 한 것.
		 * 2.배열 선언 형식
		 *    자료형 [] 배열명 = new 자료형 [배열크기]; 
		 *    자료형 배열명 [] = new 자료형 [배열크기];  ==배열요소는 0~시작됨
		 *   
		 */
		//
		
		
		int [] kors = new int[5];
		// int kors[] = new int[5];
		System.out.println( kors.length );
		System.out.println( kors.length-1); //배열크기 - 윗첨자값
		
		
		kors[0] = 90;
		kors[1] = 100;
		kors[2] = 80;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		
	
		 
		
		
		
	}//main

}//class
