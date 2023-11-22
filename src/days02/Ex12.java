package days02;

public class Ex12 {
	
	public static void main(String[] args) {
		//**기본형(Primitive Type) - 숫자형 - 정수계열 - 문자형(char(2))
		// [진법변환] - 정수
		//10진수 : 1~9
		//16진수 : 1~9,a~f
		
		
		byte b = 10; // [00001010] 2진수로 변환,
		//int i = 10; // [00000000 00000000 00000000 00001010]
		
		char c ='A'; //2진수로 변환하여 넣기 'A'는 정수 65와 매칭 [ASCII코드표] 7비트(128문자)
		// 자바 유니코드 2바이트 [00000000][01000001]
		// 확장 ASCII코드표 (8비트 256문자)
		// 인코딩(encoding) 'A' -> 65 변환 <---> 디코딩(decoding) 65 -> 'A'
		// 문자를 정수값으로 변환하여 입력하기때문에 문자형 char이 정수
		// '\u0000' ~ '\uffff' 유니코드 표기
		// 16진수 61 ->10진수
		char d = '\u0061';
		System.out.printf("d:%c\n", d); //a 97, A 65
		//대문자-소문자 =32
		
		
		
	}//main

}//class
