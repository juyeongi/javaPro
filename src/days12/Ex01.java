package days12;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  };
		dispM(m);
		/*
		        행 열
		1=0   0  0   i/2 행값, i%2 열값
		1=1   0  1
		1=2   1  0
		1=3   1  1
		1=4   2  0
		*/
		int [][] n = new int[6][2];  
		
		for (int i = 0; i < n.length; i++) {
			n[i/2][i%2]=m[i];
			
		} //for
		dispM(n);
	}//main

	private static void dispM(int[][] n) {
		for (int i = 0; i < n.length; i++) {//행갯수
			for (int j = 0; j < n[i].length; j++) {//열갯수
				System.out.printf("n[%d][%d]=%d",i,j,n[i][j]);
		
			} //for
			System.out.println();
		} //for
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n",i,m[i]);
			
		} //for
		
	}

}//class
