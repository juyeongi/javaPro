package days06;

import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		// ****
		// ****
		// ****
		// ****
		/*[1]
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		System.out.println("****");
		*/
		
		//[2]
		//i=1  t  -  j=1,2,3,4+개행
		//i=2  t  -  j=1,2,3,4+개행
		//i=3  t  -  j=1,2,3,4+개행
		//i=4  t  -  j=1,2,3,4+개행
		/*
		for (int i = 1; i <=4; i++) { //행 갯수 결정
			//System.out.println("****");
			//* x4 개행
			for (int j = 1; j <=4; j++) {//열 갯수
				System.out.print("*");
			} //for
			System.out.println();
		} //for
		*/
		
		//[1]
		/*
		for (int i = 1; i<=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			} //for
			System.out.println();
		} //for
		*/
				
		//[2]
		/*
		for (int i = 4; i >=1;i--) {
			for (int j =0 ;j<i ; j++) {
				System.out.print("*");
			} //for
			System.out.println();
		} //for
		*/
		//세번째줄 기준으로 양쪽 절대값 내기
		//3-I<0?-1*(3-I)  //절댓값
		/*
		for (int i = 1; i <=5; i++) {
		//공백
			for (int j = 1; j <=Math.abs(3-i); j++) {
				System.out.print("_");
			} //for
			//별
			for (int j = 1; j <=Math.abs(); j++) {
				System.out.print("*");
			} //for
			System.out.println();
		} //for
		*/

	}//main
}//class