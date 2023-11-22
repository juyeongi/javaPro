package days16;

public class Ex11 {
	public static void main(String[] args) {
		//	[default 메서드] 
		//5년 지난 후 IA조상 인터페이스에 
		//testXX() 추상메서드 추가  
		
		//1) 여러 인터페이스를 구현하면 디폴트메서드 충돌
		//			-> 충돌하는 디폴트메서드 오버라이딩으로 해결
		//2) 조상클래스의 메서드와 디폴트메서드 충돌
		//			-> 디폴트메서드 무시됨 (조상클래스의 메서드가 우선)
		//  ==>	기존 인터페이스에 추상 메서드만 가능하기 때문에 기본기능이 있는 default 메서드를 추가 
		
	}//main
}//class


interface IA{
	//3개의 추상메서드
	//void testXX(); //5년 뒤에 추가. > xx 
	//몸체가 구현된 메서드 불가능. 추상메서드만 가능
	default void testXX() {
		//몸체구현
	}
}
//IA 인터페이스 implements 클래스 200개
interface IB extends IA{
	//3개의 추상메서드
	//2개
}
//IA 인터페이스 implements 클래스 400개
interface IC extends IB{
	//3개의 추상메서드
	//2개
	//5개
}
//IA 인터페이스 implements 클래스 300개
interface ID extends IC{
	//3개의 추상메서드
	//2개
	//5개
	//13개
}
//IA 인터페이스 implements 클래스 100개