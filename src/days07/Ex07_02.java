package days07;

import java.util.concurrent.ForkJoinPool;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex07_02 {
	//[2] 20개 항까지의 합을 구해서 출력
		//    1+2+4+7+11+16+ ... + =191 //수열 : 수를 늘어놓고 그것에 순번을 붙이는 것
		//    (+1 +2 +3 +4 +5 +6 +7 ....) ----계차수열 
		//    초항값과 계차수열을 더하면 다음항값을 알 수 있다. 

	
	public static void main(String[] args) {
		int term=1; //항(용어값)
		int defference=0;; //계차 --for문에 넣기위해 0..
		int sum=0; //총합
		
		for (int i = 1; i <=20; i++) {
			//term = term + defference;
			term += defference;
			System.out.printf("%d+", term); //1+2+ 
			sum += term;
			defference++; //2
		} //for
		System.out.printf("=%d\n", sum);
		
		
		
		//계차수열 공식  (n^2-n)/2+1
		/*
		for (int i = 1; i <=20; i++) {
			term = (int).((Math.pow(i, 2)-i)/2+1);
			System.out.printf("%d+", term);
			..합 구하기
			
		} //for
		*/
		
	
		
	}//main

}//class
