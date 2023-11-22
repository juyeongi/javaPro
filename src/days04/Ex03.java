package days04;

import java.util.Scanner;

//***제어문

public class Ex03 {

	public static void main(String[] args) {
		
		/*1. 정의 : 프로그램의 실행순서를 제어하는 문
		 *            (건너띄기, 반복처리..)
		 *2. 종류
		 *    1)조건문        if, ifelse, ifelseif..else
		 *    2)분기문        switch
		 *    3)반복문        for,  forreach
		 *    4)조건반복문   while, do~while
		 *    5)기타           break, continue
		 */
		
		//condition 조건식 : 참/ 거짓으로 판가름할 수 있는 식
		//boolean
		/*if (condition) {
			//조건식이 참일 떄만 {} 블록 수행
		}//if
		*/
		
		//정수를 입력받아서 n 변수에 저장하고 출력
		//짝수일 경우에는 "짝수(even number)" 출력
		int n;
		try (Scanner scanner = new Scanner(System.in);){
			System.out.print(">정수입력");
			n=scanner.nextInt();
			if(n%2==0) {
				System.out.printf("n=%d짝수(even number)", n);
			}//if 짝수조건문

			if(n%2!=0) {
				System.out.printf("n=%d홀수(odd number)", n);
			}//if 홀수조건문
			
			
			//scanner.close();
		}catch (Exception e) {
			
		}//catch
		
		/*
		Scanner scanner = new Scanner(System.in);
		//입력값에 대한 유효성 검사 코딩 추가
		//입력값을 int로 변환했기때문에 int만 들어가야함
		System.out.print(">정수입력");
		n=scanner.nextInt();
		
		System.out.printf("n=%d", n);
		
		//scanner.close();
		 * 
		 */
		
	}//main
}//class
