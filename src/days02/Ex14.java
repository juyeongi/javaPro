package days02;

public class Ex14 {
	
	//ㄴ. 실수계열 - float(4), [double(8)]
	public static void main(String[] args) {
		float f ; //32비트 [[부호]8자리 지수값2^n값 소수점][23자리 가수값(소수점 아래숫자)
		double d ; //64비트[[부호]11지수][52자리 가수값]	*실수의 저장되는 값이 많아서 오차범위가 적음 
		                                                                   // 모든 실수 자료형 double을 기본으로 사용
		// 10 = 0000 1010
		// -10 => 2의 보수법 => 1111 0110
		// 'A' => 65 => 00000000 01000001
		//  9.1234567 유한실수 =>1101.0001111100...
		//2진수로 변환시 무한실수가 될 수 있기 때문에 오차 발생
		//==> 1.xxx  x 2^n 정규화
		//1.001000111111...  x2^3
		
		//Type mismatch: cannot convert from double to float
		/*float pi = 3.14;
		 * 
		 * float pi = 3.14f;
		 * double pi = 3.14;
		 * float pi = (float) 3.14;
		 */
		float pi = 3.14f;
		System.out.println();
		 
		
	
		
		
		
		
		
	}//main

}//class
