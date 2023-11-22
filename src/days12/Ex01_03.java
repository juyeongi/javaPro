package days12;

public class Ex01_03 {
	public static void main(String[] args) {
		int [][]m= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
						};
		int [][]n=new int [2][6];
		//3*4 -> 2*6 변환
		dispM(m);
		//1차원  ex01,_2참고
		//int i = 4*행*열;
		//(4*행*열i)/6 (4*행*열)i%6;
	}//main

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				
			} //for
		} //for
		
	}
}//class
