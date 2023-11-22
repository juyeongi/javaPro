package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex17 {
	
	public static void main(String[] args) throws IOException {
		//이름, 국어, 영어, 수학(byte)을 입력받아서
		//총점(short)(---강제형변환), 평균(double)(---강제형변환)을 계산
		//[출력형식]
		//홍길동님은 국어: 89 영어: 78 수학: 56 총점 : 000 평균(%.2f) : 00.00 이다.
		
		//입력받기 buffer... - 
		
		String name;
		byte kor, eng, mat;
		short total;
		double avg;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(">이름 입력");
		name = br.readLine();
		System.out.print(">국어 입력");
		kor = Byte.parseByte(br.readLine());
		System.out.print(">영어 입력");
		eng= Byte.parseByte(br.readLine());
		System.out.print(">수학 입력");
		mat= Byte.parseByte(br.readLine());
		
		total =(short)(kor + eng + mat);
		avg  =(double) total/3;				
		
		System.out.printf("%s님은 국어: %d 영어: %d 수학: %d 총점 : %d 평균%.2f이다.", name, kor, eng,mat,
				total, avg);
		
				
		//total = kor + eng + mat;  ==우측 값이 int 나오면서 오류 : 효율성문제로 byte끼리 더했을 때 int 나옴
				
				                                 
		
		
	
	}

}
