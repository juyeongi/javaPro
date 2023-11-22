package days02;

import java.io.BufferedReader;
import java.util.Scanner;

//***스캔으로 변경

public class Ex17_02 {
	
	public static void main(String[] args) {
		//이름, 국어, 영어, 수학(byte)을 입력받아서
		//총점(short)(---강제형변환), 평균(double)(---강제형변환)을 계산
		//[출력형식]
		//홍길동님은 국어: 89 영어: 78 수학: 56 총점 : 000 평균(%.2f) : 00.00 이다.
		
		//입력받기 baffer... - 
		
		String name;
		byte kor, eng, mat;
		short total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("> 이름 국어 영어 수학 입력 ");
		name = sc.next(); //String
		kor = sc.nextByte(); //byte로 변환
		eng = sc.nextByte(); // byte로 변환
		mat = sc.nextByte(); // byte로 변환
		
		total = (short) (kor + eng + mat);
		avg = (double) total/3;
		System.out.printf("%s님은 국어: %d 영어: %d 수학: %d 총점 : %d 평균 : %.2f 이다.", name, kor, eng, mat, total, avg);
	
	}			//main

}  // class
