package days09;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * [배열]+제어문
		 * 1. 자료형
		 *     기본형 (8가지)
		 *        ㄴ숫자형
		 *             ㄴ정수형
		 *                  문자
		 *             ㄴ실수형
		 *          ㄴ논리형
		 *       참조형 -[배열], 클래스, 인터페이스
		 * 2.정의 = 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것.
		 *   (array)
		 * 3.배열 선언
		 *   자료형[]변수, 참조변수, 배열;
		 *   ex) int [] m;
		 *   동적영역(heap)                          스택(stack)영역
		 *   lowerbound  upperbound
		 *   첨자값 ==index
		 *   0요소 1요소 2요소
		 *   [4byte(int)][4byte][4byte]         [0x100주소값]
		 *    0x100                                            m
		 *    배열 생성
		 *      m=new int[3]
		 * 4. 배열 크기  = 배열명.lenght
		 *     upperbound(윗첨자)   = qodufaud.lenght -1
		 *     lowerbound(아래첨자) = 0
		 */
	
		int [] kors =new int [3];
		/*
		//100점으로 초기화
		for (int i = 0; i < kors.length; i++) {
			kors[i]=100;
		} //for
		*/
		
		//Arrays클래스 : 배열을 사용하기 쉽도록 기능(함수)이 구현된 클래스
		//[1]Arrays.toString(kors)
		//[2]Arrays.fill(kors,100); //100으로 초기화 
		
		//java.lang.NullPointerException  : 참조하고있찌 않음
		kors=null; //heap영역의 참조값이 잡히지 않음
		dispKors(kors);
		
		
		
	}//main

	private static void dispKors(int[] kors) {
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("kors[%d]-%d\n",i,kors[i]);
			
		} //for
		
	}
}//class
