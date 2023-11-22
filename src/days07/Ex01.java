package days07;

import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		//구구단 가로출력
		// for i=1
		//    for j=1
		//i=1  j=1,2,3,4,~9
		//i=2  j=1.2.3.4.~9
		//2*1 2*2 ~2*9
		/*
		for (int i = 2; i <=9; i++) {
			System.out.printf("[%d]단", i);
		
			for (int j = 1; j <=9; j++) {
				System.out.printf("%d*%d=%02d  ", i, j, i*j);
								
			} //for
		System.out.println();
			
		} //for
		*/
		
		
		//구구단 세로
		/*
		for (int i = 2; i <=9; i++) {
			System.out.printf("[  %d]단\t", i);
			for (int j = 1; j <=9; j++) {
				for (int dan =2 ; dan <=9; dan++) {
					System.out.printf("%d*%d=%02d\t", i, j, i*j);
				} //for
				
			} //for
		System.out.println();
			
		} //for
		*/
		
		for (int i = 1; i <=3; i++) {
			System.out.printf("%d:",i);
			for (int j = 1; j <=3-i; j++) {//공백
				System.out.print("_");
			for (int j2 = 1; j <=i; j++) { //별
				

				
			} //for별	
				
			} //for공백
			
		} //for
		
		//    *
		//  ***
		// *****
		/*
		for (int i = 1; i <=3; i++) {//행갯수 
			for (int j = 1; j <5; j++) {//열
				if(i+j==4 && j-i<=2)System.out.print("*");
				else System.out.print("_");
			} //for
			System.out.println();
		} //for
		
		
		*/
		//대각선*, x*
		
		
	}//main

}//class
