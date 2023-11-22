package days05;

public class Ex04 {
	public static void main(String[] args) {
		
		/*	 [1]	1~10까지 합
		int sum=0;
		for (int i = 1; i <=10; i++) {
			System.out.printf(i==10?"%d":"%d+", i);
			sum +=i;
				
		} //for
		System.out.printf("=%d\n", sum);
		
		*/
		
		/*  [2]   1~10 홀수의 합
		int sum=0;
		for (int i = 1; i <=10; i++) {
			if (i%2!=0) {
				sum +=i;
				System.out.printf("%d+", i);
			}//if
	
		} //for
		System.out.printf("=%d\n", sum);
		*/
		
		/* [3]   반복문에서 countine 아래 코딩은 실행하지 않고 증감식으로 간다.
		int sum=0;
		for (int i = 1; i <=10; i++) {
			if(i%2==0) continue;
			sum +=i;
			System.out.printf("%d+", i);
	
		} //for
		System.out.printf("=%d\n", sum);
		*/
		
		//[4]홀수의 합__2
		
		int sum=0;
		for (int i = 1; i <=10; i+=2) { //2씩 증가 효율성
			sum +=i;
			System.out.printf("%d+", i);
	
		} //for
		System.out.printf("=%d\n", sum);
		
		/*  [5] 1~n까지의 합
		int sum=0;
		for (int i = 1; i <=n; i++) {
				sum +=i;
			System.out.printf("%d+", i);
	
		} //for
		System.out.printf("=%d\n", sum);
		*/
	
	}//main

}//class
