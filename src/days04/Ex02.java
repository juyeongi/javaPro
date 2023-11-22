package days04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x;
		
		System.out.print(">실수입력");
		x = scanner.nextDouble();
		x= (int)(x*100 +0.5)/100d;
		System.out.printf(">결과:%f",x);
		
		
	/*
		 Scanner scanner = new Scanner(System.in);
		 double x ;
			
		System.out.print(>실수입력);
		x= scanner.nextDouble();
		//연산자 우선순위 파악. cast연산자 > 산술
		x= (int)(x*100 +0.5)/100d;//d 안붙이면 int int연산돼서 정수만 표기됨
		System.out.println("> 결과 :%f",x	);
		/*
		String sKor =" 90   ";
		int kor = Integer.parseInt(sKor.trim()); //문자열 앞뒤 공백제거 trim(매개변수 불필요)
		System.out.printf("kor=%d\n", kor);
		*/
		
		/*int x=5, y=10;
		int max = x>y? x: y;
			System.out.printf("max=%d\n, max");
			*/
		
		
		
	}

}
