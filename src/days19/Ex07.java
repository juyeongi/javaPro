package days19;

public class Ex07 {
	public static void main(String[] args) {
		//[오토박싱(boxing) 오토언박싱(unboxing)]
		int i = 100; //정수를 저장할 변수
		Integer j=i; // 기본형 (i) -> 클래스타입 객체(j)  == 오토박싱
	
		//jdk1.5 이전
		//Integer k = new Integer(i);
		
		int k = j; //객체(j) -> 기본형(i) 변환 == 오토언박싱
		
		test(i); // int >Integer 박싱 > object 업캐스팅
		test(j); //(object업캐스팅)
		test("홍길동"); //String (object업캐스팅)
	}//main
	
	// 모든 자료형 매개변수를 받아서 처리
	private static void test(Object i) { //Integer > int 언박싱
		System.out.println(i);
	}
	/*
	private static void test(int i) { //Integer > int 언박싱
		System.out.println(i);
	}
	*/

}//class
