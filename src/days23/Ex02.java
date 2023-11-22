package days23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import days10.Ex06_04;

public class Ex02 {
	//3반 30명 학생의 이,국,영,수,총,평,등,전등를 처리하는 코딩
	public static void main(String[] args) throws IOException {
		ArrayList<Student>class1List = new ArrayList<>();
		ArrayList<Student>class2List = new ArrayList<>();
		ArrayList<Student>class3List = new ArrayList<>();
		
		//한반의 classlist를 요소로 가짐
		ArrayList<ArrayList<Student>> sistList = new ArrayList<>();
		sistList.add(class1List);
		sistList.add(class2List);
		sistList.add(class3List);
		
		char con ='y';
		
		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;
		
		Scanner scanner =new Scanner(System.in);
		
		//1.반 입력
		int ban ;
		
		do {
			System.out.printf(">반을 입력하세요");
			ban =scanner.nextInt(); 
			
			ArrayList<Student>classList =sistList.get(ban-1);
			
			//2.반의 학생 정보입력
			
			System.out.printf(">%d반의 [%d번] 학생의 이름,국어,영어,수학점수 입력", ban,classList.size()+1);
			
			int no = classList.size()+1;
			name=Ex06_04.getname();
			kor=Ex06_04.getScore();
			eng=Ex06_04.getScore();
			mat=Ex06_04.getScore();
			
			tot=kor+eng+mat;
			avg=(double)tot/3;
			wrank=rank=1;

			Student s = new Student(no, name, kor, eng, mat, tot, avg, rank, wrank);
			classList.add(s);
			
			//입력계속
			System.out.print(">입력 계속");
			con=(char)System.in.read(); //throws
			System.in.skip(System.in.available());
		}while (Character.toUpperCase(con)=='Y');
		
		
		
		//총학생수 출력
		
//		[1]		
		/*
		int totalStudents=0;
		Iterator<ArrayList<Student>> ir = sistList.iterator();
		while (ir.hasNext()) {
			ArrayList<days23.Student> classList = ir.next();
			totalStudents += classList.size();
		}//while
		System.out.printf("\t\t학생정보 출력 (%d명)\n", totalStudents);
		*/
		
		//[2]
//		System.out.println("-".repeat(10));
//		sistList.stream().mapToInt(classList->classList.size()).forEach(학생수->System.out.println(학생수));
		// map 새로 형성
//		System.out.println("-".repeat(10));
		//각 반의 학생수 (size)를 갖고있는 int형태의 Stream


		//[3] 메서드참조
//		sistList.stream().mapToInt(ArrayList::size).forEach(System.out::println);

		//[4]
		int totalStudents=sistList.stream().mapToInt(ArrayList::size).sum();
		System.out.printf("\t\t학생정보 출력 (%d명)\n", totalStudents);
		System.out.println("-".repeat(10));
		//출력
		Iterator<ArrayList<Student>> ir = sistList.iterator();
		ban=1;
		while (ir.hasNext()) {
			ArrayList<Student> classList = ir.next();
			System.out.printf("[%d반 학생 : %d명] \n", ban++, classList.size());
			
			Iterator<Student> ir2= classList.iterator();
		while (ir2.hasNext()) {
				Student s = ir2.next();
			System.out.println(s);//tostring()
			}
		}
		
	}//main
}//class
