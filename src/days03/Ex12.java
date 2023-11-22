package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12 {
	public static void main(String[] args) throws IOException {
		String name;
		int kor, eng, mat;
		int total;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//홍길동 90 78 99 엔터
		System.out.print(">이름, 국어, 영어, 수학 입력");
		String inputData = br.readLine();
		//System.out.println( inputData );
		
		//(,)구분자 콤마 잘라내기 "홍길동 " "90" "78" "99"
		// 1)기능 2)매개변수 3)리턴값
		String [] datas =inputData.split(",");
		
		name = datas[0]; //"홍길동"
		kor = Integer.parseInt(datas[1]); //"90"
		eng = Integer.parseInt(datas[2]);//"78"
		mat = Integer.parseInt(datas[3]);//"99"
	
		
		total =kor + eng + mat;
		avg  =(double) total/3;				
		
		System.out.printf("%s님은 국어: %d 영어: %d 수학: %d 총점 : %d 평균%.2f이다.", 
				name, kor, eng, mat, total, avg);
		
	}//main

}//class
