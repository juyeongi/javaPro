package days24;

public class Ex09 {
	public static void main(String[] args) {
		//[제네릭스의 제한]
		
		
	}//m
}//c
class Box02<T>{
	
//	Cannot make a static reference to the non-static type T
//1)	ㄴ 제네릭클래스에선 static필드 선언 불가
//	static T item2; // 정적필드 선언
	
//2)	static 메서드의 매개변수로 T타입 사용 불가
//	static int compare(T t1, T t2) {
//		return 0;
//	}
	
//3)	T타입 배열 선언 가능
	T[] itemArr;
}