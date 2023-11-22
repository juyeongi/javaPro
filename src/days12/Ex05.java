package days12;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

import days10.Ex06_04;

public class Ex05 {
		//3개 반의 30명학생 이름, 국,영,수,총점,평균,반등수,전교등수 처리
	public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT=30;
		final int CLASS_COUNT=3;
		//행 =반 , 열 =번호
		String[][] names = new String[CLASS_COUNT] [STUDENT_COUNT];
		//3차원배열의 열 0 :국 1: 영 2: 수 3 : 총점 4: 등수 5:전교등수
		int[][][] infos=new int [CLASS_COUNT][STUDENT_COUNT][6];
		//행 =반 , 열 =번호
		double[][] avgs = new double[CLASS_COUNT] [STUDENT_COUNT];
		
		char con= 'y';
		//입력받은 학생수 저장할 변수
		//int count 1=0;  	 counts[0]
		//int count 2=0;		counts[1]
		//int count 3=0;		counts[2]
		
		int [] counts =new int [CLASS_COUNT];
		
		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;
		
		Scanner scanner =new Scanner(System.in);
		
		//1.반 입력
		int ban ;
		
		do {
			System.out.printf(">반을 입력하세요");
			ban =scanner.nextInt(); //1,2,3  
			
			//2.반의 학생 정보입력
			//ban -1   ==3반 입력시, 3반의 배열 counts[2] 이기 때문에.
			//+1 은 배열int 기본값 0부터이기때문. 
			System.out.printf(">%d반의 [%d번] 학생의 이름,국어,영어,수학점수 입력", ban, counts[ban-1]+1);
			name=Ex06_04.getname();
			kor=Ex06_04.getScore();
			eng=Ex06_04.getScore();
			mat=Ex06_04.getScore();
			
			tot=kor+eng+mat;
			avg=(double)tot/3;
			wrank=rank=1;
			
			//names[반][번호] = name; //학생 이름 저장 
			//[counts[ban-1] 반과 이름이 저장된 위치 에 번호를 저장
			names[ban-1][counts[ban-1]] = name; //학생 이름 저장 
			//infos[반][번호][0]=kors;
			infos[ban-1][counts[ban-1]][0]=kor;
			infos[ban-1][counts[ban-1]][1]=eng;
			infos[ban-1][counts[ban-1]][2]=mat;
			infos[ban-1][counts[ban-1]][3]=tot;
			infos[ban-1][counts[ban-1]][4]=rank;
			infos[ban-1][counts[ban-1]][5]=wrank;
			avgs[ban-1][counts[ban-1]]=avg;
			
			counts[ban-1]++;
			//입력계속
			System.out.print(">입력 계속");
			con=(char)System.in.read();
			System.in.skip(System.in.available());
		}while (Character.toUpperCase(con)=='Y');
		
		//등수처리
		for (int i = 0; i < counts.length; i++) {//등수처리할 학생 전체
			for (int j = 0; j < counts[i]; j++) {
				//infos[i][j][3]//학생의 총점
				infos[i][j][4]=1;//반등수
				infos[i][j][5]=1;//전교등수
				for (int i2 = 0; i2 < counts.length; i2++) { //같은반인지 확인. 반등수
					for (int j2 = 0; j2 < counts[i2]; j2++) {
						if (infos[i][j][3] <infos[i2][j2][3]){
							infos[i][j][5]++;
							if (i==i2) {//같은 반
								infos[i][j][4]++;
							}
						}
					}
				}	
			} //for
			
		} //for
		
		//학생정보 출력 (7명)
		/*
		[1반학생 :4명]
		1 이름 국~ 평균
		2
		3
		4
		[2반학생 :2명]
		1
		2
		[3반학생 :3명]
		1
		*/
		int 총학생수 =IntStream.of(counts).sum();
		/*
		for (int i = 0; i < counts.length; i++) {
			총학생수+=counts[i];
			
		} //for
		*/
		System.out.printf("\t\t학생정보 출력 (%d명)\n",총학생수);
		for (int i = 0; i < counts.length; i++) {  //i =반
			System.out.printf("[%d반 학생 : %d명] \n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {  //j=번호
	
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d\t%d\n"
						,j+1, names[i][j], infos[i][j][0],infos[i][j][1],infos[i][j][2],infos[i][j][3],avgs[i][j],infos[i][j][4],infos[i][j][5]);
			} //for

		} //for
		
	}//main
}//class
