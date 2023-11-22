package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		int a=0, b=0;
		//double c ;
		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		//(JVM)InputMismatchException 예외객체 생성 -> 개발자 오류 파악 처리
		/* 
		 * 자바 예외처리방법
		 * 1) try -catch
		 */
		try {
			//예외발생 가능성 있는 코딩 입력
			System.out.println(">a, b 두 정수 입력");
			a= scanner.nextInt();
			b= scanner.nextInt();
			//예외 발생 시점에서 catch문으로 넘어감
			
			double c = a/b;		
			//try문 안의 지역변수로 선언되어 try문 밖에서 인식불가
			//System.out.printf("%d/%d=%.2f",a,b,c);
			System.out.println("정상종료");
		
			//다중catch문
			// ***부모 예외 클래스를 밑에 코딩
		} catch (InputMismatchException e) {//예외메세지
			System.out.println(">[알림] 정수만 입력");
			//System.exit(-1);// 프로그램 강제종료
		} catch(ArithmeticException e) {
			System.out.println(">[알림] 0으로 나눌 수 없음");
			//System.exit(-1); //프로그램 종료
		
			//부모에 해당되는 메서드를 가장 마지막에 선언 
		} catch (Exception e) { //최상위예외 /매개변수 다형성
			e.printStackTrace(); //다른 예외 찾음
			//System.exit(-1);
		} finally {//예외 발생 유무에 상관없이 처리할 구문
			System.exit(-1);
		}
		/*
		double c = a/b;	
		//c cannot be resolved to a variable : c 변수 인식불가
		//try문 안의 지역변수로 선언되어 try문 밖에서 인식불가
		System.out.printf("%d/%d=%.2f",a,b,c);
		System.out.println("정상종료");
		*/
		
		/*
		String input = "1 fish 2 fish red fish blue fish";
		//string source scanner 사용			//구분자
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
		*/
		
		
	}//main
}//class
