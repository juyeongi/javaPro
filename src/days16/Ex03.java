package days16;

public class Ex03 {
	public static void main(String[] args) {
		/*
		 * final
		 * 1.지역변수 > 상수 : final키워드
		 */
		//double pi= 3.141592;
		//double PI = 3.141592;
		//FinalTest.PI; // final static
		//Math.
		//3.141592 계속 반복해서 출력 > 값 입력 오류 있을 때
		//final변수로 변환하면 변수 > 상수가 되고 값이 바뀌지 않음
		FinalTest obj = new FinalTest();
		System.out.println(obj.PI);
		
		
		
		//The final field FinalTest.PI cannot be assigned
		//파이널변수 PI 클래스의 멤버변수가 상수가 되었기 때문에 다른값 선언 불가능
		//obj.PI=3.14;
		//Math.PI
		
		//Child c = new Child();
	}
}
//변수 앞 final 
final class FinalTest{
	//필드
	//public final static double PI = 3.141592; //명시적 초기화
			//final static 기타제어자 
	//The blank final field PI may not have been initialized	
	//초기화되지 않음
	final double PI;
	//인스턴스 초기화블럭
	/*
	{
		PI=3.14;
	}
	*/
	public FinalTest() {	//생성자초기화
		PI=3.14;	
	}
	//int value 지역변수, 매개변수
	public void finalTest(final int value) {
		//
		//
		//value++; x
		//value - 1000; x 
		//상수로 선언되었기 때문에 값이 바뀌지 않음
	}
}

// 메서드 앞 final 
/*
class Parent{
	//서브클래스가 재정의 할 수 없는 최종메서드
	final void dispA() {
	}
	
}
class Child extends Parent{
	
//	@Override
//	void dispA() {
//	}
	

}
*/