package days05;

public class Ex05 {
	
	//***조건반복문 while
	
	public static void main(String[] args) {
		
		/* 열거자 반복처리
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();
			
		}//while
		*/
		/*반복자 반복처리
		while (it.hasNext()) {
			type type = (type) it.next();
			
		}while
		*/
		/*
		while (condition) {
			//조건식이 참일동안 반복{}실행
		}//while
		*/
		
		//for 반복문과 while 조건반복문 차이점
		// ㄴ 반복횟수     ㄴ반복조건
		
		// [1~10까지의 합 (while문)]
		
		/*1)
		int i =1, sum=0;
		while (i<=10) {
		
			System.out.printf("%d+",i);
			sum+=i;
			i++;
		}//while
		System.out.printf("%d+\n", sum);
		*/
		//
		/*[2]
		int i =0, sum=0;
		while (i<10) {
			i++;
		
			System.out.printf("%d+",i);
			sum+=i;
		}//while
		System.out.printf("=%d\n", sum);
		*/
		//[3]
		int i =0, sum=0;
		while (++i<=10) {
			System.out.printf(i==10? "%d" :"%d+",i);
			sum+=i;
			
		}//while
		System.out.printf("=%d\n", sum);
		
		
	}//main

}//class
