package days26;

import java.io.InputStream;
import java.io.PrintStream;

public class Ex04 {
		// [ PrintStream ]
		// -데이터 기반 출력용 바이트스트림
		// -다양한 형태로 출력할 수 있는 메서드가 오버로딩되어있는 스트림클래스
	
	public static void main(String[] args) {
		InputStream is = System.in;
		PrintStream ps =	 System.out; //표준출력스트림
		
		//System.out.println();
		//System.out.print();
		//System.out.printf();
		
		//ps.printxxx();
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");
		
		//독립스레드 사용
		//에러메세지 출력
		System.err.println("F");
	}//main
}//class
