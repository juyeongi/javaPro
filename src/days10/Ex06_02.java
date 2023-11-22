package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//시험 01
public class Ex06_02 {
	public static void main(String[] args) throws IOException {

		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;
	
		//배열 사용
		final int STUDENT_COUNT=30;//인원이 변동될 때 용이
                      //상수. 단어바뀔때 _사용		
		String [] names =new String[ STUDENT_COUNT];// new ~ 지역변수 선언
		int [] kors=new int[ STUDENT_COUNT];;
		int [] engs=new int[ STUDENT_COUNT];
		int [] mats=new int[ STUDENT_COUNT];
		int [] tots=new int[ STUDENT_COUNT];
		double [] avgs=new double[ STUDENT_COUNT];
		int [] ranks=new int[ STUDENT_COUNT];;
	
		
		Scanner scanner =new Scanner(System.in);
		int count = 0; //입력받은 학생 수를 저장할 변수
		char con = 'y';//입력 여부를 묻는 변수
		
	do {
		System.out.printf(">이름, 국어, 영어, 수학, 입력 : ");
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();
		
		tot = kor + eng + mat ;
		avg = (double)tot/3;
		rank =1;//모든 학생의 점수 입력 끝난 후에 등수
		
		names[count]=name;
		kors[count]=kor;
		engs[count]=eng;
		mats[count]=mat;
		tots[count]=tot;
		avgs[count]=avg;
		ranks[count]=rank;
		
		count++;
		
			System.out.println(">입력 계속 ?");
			con=(char)System.in.read();
			System.in.skip(System.in.available());
		}while (Character.toUpperCase(con)=='Y');
		
		//등수처리
		procRank(tots, ranks, count);
	
		//모든 학생정보 출력
		printStudentInfo(names, kors, engs, mats, tots, avgs, ranks, count);
		//count 입력받은 학생의 수
		

	}//main

	private static void procRank(int[] tots, int[] ranks, int count) {
		for (int i = 0; i < count; i++) { //등수 지정 학생
			ranks[i] =1; 
			for (int j = 0; j < count; j++) { //j:비교대상 학생
				if (tots[i] <tots[j]) {
					ranks[i]++;
				}//if
			} //for
		} //for

	}//procRan

	private static void printStudentInfo(String[] names, int[] kors, int[] engs, int[] mats
			, int[] tots, double[] avgs,	int[] ranks, int count) {
		//1번 홍길동 89 93 38 ???  ??.??  1등
		for (int i = 0; i < count; i++) {
			System.out.printf("%d번 \t%s \t%d \t%d \t%d \t%d  \t%.2f  \t%d등\n"
					, i+1, names[i], kors[i],engs[i],mats[i],tots[i],avgs[i],ranks[i]);
			        // ㄴ for문 안의 i. 번호는 임의로 지정하지 않았기 때문, i는 0부터이기 때문에 +1
			
		} //for
	}
}//class
