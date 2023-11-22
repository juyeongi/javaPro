package days02;

public class Ex15 {
	//**형변환 : 같거나 다른 자료형끼리 변환하는 것
	public static void main(String[] args) {
		
		// String -> byte 형변환
		// "20" -> 20 으로 변환
		// byte age = "20";
		int i = Integer.MAX_VALUE; // int 자료형의 가장 큰 값을 대입 2147483647
		//래퍼클래스 ( wrapper class )기본형 8지를 사용하기 쉽도록 물건(객체, object, 클래tm)으로 만들어놓은 것
		
		int j = Integer.parseInt("20");
		
		//기본형byte //래퍼클래스Byte
		byte age =	 Byte.parseByte("20");
	
		
		
	}//main

}//class
