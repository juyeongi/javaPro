package days15;

import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//단일 상속
		//다중 상속 : 자바 지원x
		/*
		 * class Tv{int power}
		 * classVCR{int power}
		 * class TVCR extends Tv, VCR{   //tv +vcr 다중상속
		 * int power; tv상속
		 * int power; vcr상속
		 * }
		 * 인터페이스로 구현 가능
		 *
		 */
		/*
		오버라이딩 주의사항 
		정의 : 부모클래스로부터 상속받은 메서드 재정의
		override 사전적 의미 == overwrite == 위에 덮어쓰다
		조건: 	1)메서드명 수정 x
				2)매개변수 동일
				3)리턴타입 동일
				4)접근지정자 = 부모의 접근지정자의 범위보다 같거나 넓어야함
				5)부모의 메서드보다 맣은 수의 예외 선언 x 
				6)인스턴스 메서드<->static 메서드 변경불가

		*/
	}//main
}//class

class Parent{
	public int print( String n, int a) throws IOException,
	NullPointerException{
		return 100;
	}
}

class Child extends Parent{
	// The method print(String) of type Child must override or implement a supertype method
	//Cannot reduce the visibility of the inherited method from Parent
	//@Override
	protected int  print(String name) throws IOException, NullPointerException {
		
		return 200;
		//오버로딩으로 바뀌어 오류안남
	}
	
	
}