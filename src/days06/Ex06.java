package days06;

public class Ex06 {
	public static void main(String[] args) {
		//구구단_for문
		//중첩for문
		for (int dan = 2; dan <=9; dan++) {
			System.out.printf("[%d단]\n", dan);
			for (int i = 1; i <9; i++) {
				System.out.printf("%d*%d=%d\n", dan, dan, 2*dan);
			}//for	
	
		} //for

		/*
		System.out.printf("[%d단]\n", 2);
		for (int i = 1; i <9; i++) {
			System.out.printf("%d*%d=%d\n", 2, i, 2*i);
		} //for
		*/
		
	}//main
}//class
