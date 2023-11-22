package days06;

public class Ex06_03 {
	public static void main(String[] args) {
		/*
		for (int dan =2; dan <9; dan++) { //단 결정
			for (int i = 1; i <=9; i++) {
				System.out.printf("%d*%d=%02d ", dan, i, dan*i) ; //""마지막 개행대신 공백/ 02:열 맞춤
			
			} //for
			System.out.println(); //단 끝난 후 개행
		
		} //for
		*/
		/*dan =2, 2<=9 true
	     ㄴ i=1, 2 1<=9 true  ..... i =10 <=9 false
	 */
		//구구단 세로 출력
		//i=1  dan=2,3,4,5,6,7,8,9
		for (int i = 2; i <=9; i++) {
			System.out.printf("  [%d]단\t", i);		// ** \t : 'tab'key 기능 (라인 맞추기)
		
		} //for
		System.out.println();

		for (int i =1; i <=9; i++) { //단 결정
			for (int dan = 2; dan <=9; dan++) {	
				System.out.printf("%d*%d=%02d\t ", dan, i, dan*i) ; //""마지막 개행대신 공백
				
			} //for
			System.out.println(); //단 끝난 후 개행
			
		} //for
				
	}//main
}//class
