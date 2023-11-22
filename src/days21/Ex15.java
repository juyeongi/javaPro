package days21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex15 {
	
//	한 반에 30명 학생. 국,영,수,총점,평균,등수
//	1차원배열 처리
//	다차원배열 처리 (2,3차원)
//	Student클래스배열 처리
//	Student클래스 처리+ArrayList처리
	
	public static void main(String[] args) throws IOException {

		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;
		int wrank;
		
		final int STUDENT_COUNT = 30;
		ArrayList list = new ArrayList();
		
		Scanner scanner =new Scanner(System.in);
		
		char con = 'y';
		int no =1;
		
		do {
			System.out.printf(">이름, 국어, 영어, 수학, 입력 : ");
	
			name =getname(); //scanner.nextLine();
			kor = getScore();
			eng = getScore();
			mat = getScore();

			tot = kor + eng + mat ;
			avg = (double)tot/3;
			rank =1;//모든 학생의 점수 입력 끝난 후에 등수
			wrank =1;
			
			Student s = new Student(no++, name, kor, eng, mat, tot, avg, rank, wrank);
			list.add(s);

			System.out.println(">입력 계속 ?");
			con=(char)System.in.read(); //checked 예외
			System.in.skip(System.in.available());
		}while (Character.toUpperCase(con)=='Y');
		
		//[문제]
		//1. 등수처리
		//1. 성적순 오름차순정렬
		
		// 모든 학생 출력
		System.out.println(">입력받은 학생 수 : "+list.size());
		Iterator ir =list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}

	}//main

	public static String getname() {

		Random rnd =new Random();
		char[] nameArr =new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i]=(char)(rnd.nextInt('힣'-'가'+1)+'가');

		} //for

		//char > string
		String name = String.valueOf(nameArr);
		return name;
	}

	public static int getScore() {
		return (int)(Math.random()*101);
	}//getScore
}//class
