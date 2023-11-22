package days12;

public class Ex01_02 {
	public static void main(String[] args) {
		//3행4열 2차원배열m 선언 1~12 배열초기화
		
		//int [][] m =new int {}{}{};
		int [][]m= {
							{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12}
						};
		dispM(m);
		
		//2차원-1차원 변환
		int []n =new int [m.length*m[0].length];
		//i j->
		//00->0
		//01->1
		//02->2
		//03->3
		//10->4
		//11->5
		//12->6
		//13->7
		//20->8
		//열갯수*행갯수(i)+열갯수(j)= index
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[m[0].length*i+j] =m[i][j];//4*i*j
			} //for
			
		} //for
		
		
		dispM(n);
	}//main

	private static void dispM(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%d]",n[i]);
			
		} //for
		System.out.println();
		
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
				
			} //for
			System.out.println();
		} //for
		
	}
}//class
