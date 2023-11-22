package days26;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Ex03 {
	//Sequence[InputStream]
	//순차적+ 입력용바이트스트림
	// - 용량이 큰 하나의 파일을 여러개의 파일로 분리 > 분리된 파일을 읽어올 때 사용
	// - 여러개의 입력스트림을 연속적으로 연결해서
	//	  하나의 스트림으로 데이터를 처리할 수 있는 바이트스트림
	
	public static void main(String[] args) throws IOException {
		byte [] a = {1, 2, 3};
		byte [] b = {4, 5, 6};
		byte [] c = {7, 8, 9};
		//byte[] > ByteArrayInputStream 메모리스트림
		
		ByteArrayInputStream bais1 = new ByteArrayInputStream(a);
		ByteArrayInputStream bais2 = new ByteArrayInputStream(b);
		ByteArrayInputStream bais3 = new ByteArrayInputStream(c);
		
		//bais1~3 순차적으로 처리
		
		//[1]
//		SequenceInputStream sis = new SequenceInputStream(bais1, bais2);
//		SequenceInputStream sis2 = new SequenceInputStream(sis, bais3);
		
		//[2] 순서가 있는 컬렉션클래스 생성  bais 1,2,3 입력, 컬랙션클래스에서 열거형 인터페이스 불러오기
		// 			ㄴ	List계열 컬렉션클래스 arraylist는 열거형 객체 x
		
		Vector<ByteArrayInputStream> list = new Vector<ByteArrayInputStream>() ;
		list.add(bais1);
		list.add(bais2);
		list.add(bais3);
		Enumeration<ByteArrayInputStream> en = list.elements(); //열거형 인터페이스
		SequenceInputStream sis = new SequenceInputStream(en);
		int code;
		while ((code =sis.read())!=-1) {
			System.out.println(code);
		}
	
	}//main
}//class
