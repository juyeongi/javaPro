package days07;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
	
		//string 함수
		//String.repeat()
		/*
		System.out.println("*".repeat(1));
		System.out.println("*".repeat(2));
		System.out.println("*".repeat(3));
		System.out.println("*".repeat(4));
		*/
	
		
		Scanner scanner = new Scanner(System.in);
			System.out.print(">이등변삼각형 행의 갯수를 입력하세요?");
			int row= scanner.nextInt();//row --행
			//row 행
			//3->5
			//4->7
			//n->2*n-1
			int col = 2*row-1;
			for (int i = 1; i <=row; i++) {
				for (int j = 1; j <=col; j++) {
					if (i+j>-row+1 && j-i<=row-1) System.out.print("*");
					else System.out.print("_");
				} //for
				System.out.println();
				
			} //for
			
		
	}//main
}//class
