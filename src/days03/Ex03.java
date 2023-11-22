package days03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		int age, kor, eng, mat, total;
		double avg;
		System.out.print("이름 나이 국어 영어 수학 입력 ?");
		Scanner sc = new Scanner(System.in);
		
		name=sc.next();
		age= sc.nextInt();
		kor= sc.nextInt();
		eng= sc.nextInt();
		mat= sc.nextInt();
		total= sc.nextInt();
		
		total = kor + eng + mat;
		avg =(double) total/3;
		
	
		System.out.printf("\"%s\" %d살 %d %d %d %d %.2f\n",
				name, age, kor, eng, mat, total, avg );

	}//main

}//class
