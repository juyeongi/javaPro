package days10;

import java.util.Scanner;

//시험 01
public class Ex06 {
	public static void main(String[] args) {
		// 한 반에 최대 30명 학생
		// 성적처리( 이름, 국,영,수,총점,평균,등수)
		//1.학생 정보 입력
		//2.총점, 평균
		//3.등수
		//4.학생 정보 출력
		//5.파일 저장 또는 db저장
		
		//한명 학생의 정보를 저장할 공간
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
		//rank는 점수입력이 끝난 후에 
		/*
		//the local variable name may not~ 지역변수 선언 x
		name[0]= "홍길동";
		System.out.println(name [0] );
		*/
		
		Scanner scanner =new Scanner(System.in);
		int count = 0; //입력받은 학생 수를 저장할 변수
		
		char con = 'y';//입력 여부를 묻는 변수
		
		//입력계속?
		System.out.printf(">이름, 국어, 영어, 수학, 입력 : ");
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();
		
		tot = kor + eng + mat ;
		avg = (double)tot/3;
		rank =1;//모든 학생의 점수 입력 끝난 후에 등수
		
		names[0]=name;
		kors[0]=kor;
		engs[0]=eng;
		mats[0]=mat;
		tots[0]=tot;
		avgs[0]=avg;
		ranks[0]=rank;
		
		count++;
		
		
	}//main
}//class
