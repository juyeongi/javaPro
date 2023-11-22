package days03;

import java.util.Scanner;

//**두 문자열 비교 / 디버깅

public class Ex09 {
	public static void main(String[] args) {
		//he value of the local variable name1 is not used 선언한 변수 사용안됨

		String name1 = "홍길동", name2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">비교할 이름을 입력");
		//String name2;
		
		name2= scanner.next();
		
		//System.out.printf("%s\n", name2);
		System.out.printf("[%s]\n", name2); // []표기로 name2값 확인 
		//line19 toggle breakpoint

		//System.out.println(name1 ==name2 );
		//**암기 두 문자열을 비교할때는 equals() 사용
		//System.out.println(name1. equals(name2) );// '거짓'
		System.out.println(name1.equals (name2));
		//System.out.println("홍길동".equalsIgnaoreCase("홍길동") );// 참
		//System.out.println("홍길동".equalsIgnaoreCase("홍길동") );// 참
		System.out.println("honG". equalsIgnoreCase("HONG"));
		
		
	
		/*String name1 = "홍길동", name2;		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("> 비교할 이름을 입력 ? ");		
		// String name2;
		name2 = scanner.next();
			
		System.out.printf("[%s]\n", name2);
			
		System.out.println(  name1.equals( name2 )  );
		System.out.println(  "keNik".equalsIgnoreCase( "KENIK" )  );

*/
		
		
	}//main

}//class
