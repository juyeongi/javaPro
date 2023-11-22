package days04;

public class Ex11 {
	public static void main(String[] args) {
		//배열 초기화
		//int n;
		//n = 10; ==>초기화
		
		int[]m=new int[5];
		
		m[0]=5;
		m[0]=3;
		m[0]=6;
		m[0]=2;
		m[0]=4;
		
		// 배열 초기화
		// ==int[] m = {5,3,6,2,4};
		
		
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[]=%d\n",i, m[i]);
			
		} //for
		/*
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);
		System.out.println(m[3]);
		System.out.println(m[4]);
		*/
		
	}//main
}//class
