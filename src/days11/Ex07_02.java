package days11;

public class Ex07_02 {
	public static void main(String[] args) {
		/*
		int [][]m= new int [2][4];
		//1.배열의 크기 : 배열명.length
		System.out.println(m.length);
		System.out.println(m[0].length);
		System.out.println(m[1].length);
		*/
		//2차원배열 초기화
		/*
		int[][]m=new int[][] {
			{1,2,3,4},
			{5,6,7,8}
		};
		*/
		int[][]m=new int[][] {
										{1,2,3,4},
										{5,6,7,8}

			
										};
		dispM(m);//2차원배열 호출
		
		
	}//main
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d", i, j, m[i][j]);
			} //for
			System.out.println();
		} //for
	}//dispM
	
}//class
