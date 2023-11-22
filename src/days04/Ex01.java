package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		/*이름, 국어, 영어, 수학의 값을 입력받아서
		   총점, 평균을 계산하고 , 출력하기
		   ( 조건 : BufferedReader br을 사용해서 이름,국,영,수 한 번에 입력받아서 split() 하기. )
		   ( 조건 : 평균은 소수점 2자리까지 출력 )
		   출력형식 예)  이름="홍길동",국어=89,영어=78,수학=90,총점=257,평균=85.67
		   */
		
		
		String name;
		int kor,eng,mat,total;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print(">이름, 국어, 영어, 수학?"); //홍길동 89 78 90
		String inputData= br.readLine();
		//구분자 콤마, 공백 같이사용
		//String regex="\\s*,\\s*";
		String regex="[, ]";
		//String[] datas= inputData.split(",");
		String[] datas= inputData.split(regex);
		
		name = datas[0];
		
		kor = Integer.parseInt(datas[1]);  //숫자 입력시 공백 없이 입력
		eng = Integer.parseInt(datas[2]);
		mat = Integer.parseInt(datas[3]);
		
		total = kor +eng + mat ;
		avg = (double)total/3;
		
		System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f", 
				name, kor, eng,mat,total, avg);
		
		
	}//main

}//class
