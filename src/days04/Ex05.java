package days04;


public class Ex05 {
	
	//**for 반복문

	public static void main(String[] args) {
		// 반복되는 규칙 찾기
		/*
		System.out.println("홍길동");
		System.out.println("홍길동");
		System.out.println("홍길동");
		System.out.println("홍길동");
		System.out.println("홍길동");
		*/
		
		//i : 반복횟수
		//      초기식;    조건식;             증감식;
		//for (int i = 0; i < args.length; i++) {
		
		//}//for
		// [1~10까지의 합 출력]
		//i=1
		int sum=0;
		for (int i =1 ; i <= 10; i++) {
			System.out.printf("%d+",i);
			sum+=i;
		
		}//for
		System.out.printf("=%d\n", sum);

		
	}//main

}//class
