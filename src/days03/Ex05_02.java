package days03;

public class Ex05_02 {

	
	//***산술연산자
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int i=10, j=3;
		System.out.println( i + j ); // 13
		System.out.println( i - j ); // 7
		System.out.println( i * j ); // 30
		System.out.println( i / j ); // 3==>int (정수)끼리 연산하여 나머지값이 안나옴
		System.out.println( (double)i / j ); //3.3333 ==> 실수 나오게하려면 double로 강제형변환
		//나머지연산자 %
		System.out.println( i % j ); // 1
		*/
		
		//**산술 연산자 중에 /, % 주의사항
		
		//System.out.println(10 / 0); //정수를 0으로 나눴을 때
		//java.lang.ArithmeticException: / by zero 
		//산술적 예외(오류)발생
		//System.out.println(10.0 / 0); //실수를 0으로 나눴을 때 : infinity 무한대 상수값
		
		//System.out.println(10 % 0); //java.lang.ArithmeticException: / by zero 
		//System.out.println(10.0 % 0); //NaN ( Not a Number)
		
	}//main

}//class
