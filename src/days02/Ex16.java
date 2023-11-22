package days02;

public class Ex16 {
	
	//**형변환
	
	public static void main(String[] args) {
		// 1. 자동형변환 
		int i = 10;  //          [][][][]
		long l = i; //[][][][][][][][]
		float f = l; //작은 자료형의 값을 큰 자료형으로 할당
		
		System.out.println( i );
		// 작은 단위의 자료형이 더 큰 자료형으로 자동변환
		
		long L = l + i; //큰 자료형으로 자동형변환 

		// 2. 강제형변환
		int a = 20;
		int b = 3;
		//System.out.println( a/b ); // 6 => int끼리의 연산은 몫값이 int가 나옴
		                                     // 6.66666.. 나머지값이 나오게 하려면 상수와 실수를 같이 연산해야함
		                                     // =>강제형변환
		System.out.println((double)a/b);
		//double과 int 연산시 더 큰 값인 double로 형변환이 됨
		//캐스트연산자로 나눠지기전에 double로 변환됨
		
		
		// 3*(5+2)  --()최우선연산자
		// (변환하고자하는 타입(자료형)) cast 연산자 == 캐스트강제형변환
	
		
	}//main

}//class
