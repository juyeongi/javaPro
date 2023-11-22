package days04;

import java.util.Iterator;

public class Ex07{
	public static void main(String[] args) {
		/*
		int sum =0;
		for (int i = 1; i<=10;i++) {  
			
			System.out.printf("%d+",i);
			sum+=i;
	 
		}//for;
		System.out.printf("\b=%d\n", sum);
		*/
		
		
		
		/*
		int sum =0, i = 1; 
		for (; ;) {  //for문 식이 다 빠지면 무한루프
			//for문 안의 초기식(int i=1) 을 main의 지역변수로 선언
			if (i > 10) break;
			
			System.out.printf("%d+",i);
			//sum = sum+i;
			sum+=i;
			i++;//증감식 
		}//for;
		System.out.printf("\b=%d\n", sum);
		*/
		/*
		int sum =0;
		//초기식 변수 여러가지 가능
		//조건식 참/거짓만 나오면 여러조건 가능
		for (i = 1, j=1, k=10; &&k<=10||j> ;i++) {  
			
			System.out.printf("%d+",i);
			sum+=i;
	 
		}//for;
		System.out.printf("\b=%d\n", sum);
		*/
		
		int sum =0;
		for (int i = 10; i>=1;i--) {  
			
			System.out.printf("%d+",i);
			sum+=i;
	 
		}//for;
		System.out.printf("\b=%d\n", sum);
		
		
		
	}
}
