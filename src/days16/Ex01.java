package days16;

public class Ex01 {
	public static void main(String[] args) {
		//up-casting (추상클래스)
		//Parent p1=	new Child();  //[1]
		
		//Child c1 = new Descendant();  //[2]
		Parent p1 = new Descendant();  //[2]
	}
	
}
//추상메서드가 없는데 클래스 생성된 이유
//상속계층도
//자식클래스
//객체생성하지 않기 위함
abstract class Parent{
	//필드
	//메서드
	//추상메서드
	abstract void dispA();
	abstract void dispB();	
}

abstract class Child extends Parent{
//하나의 메서드만 재정의
//남은 한 메서드는 여전히 추상메서드이기때문에 기타제어자 abstract 선언 
	@Override
	void dispA() {
	}
}
class Descendant extends Child {

	@Override
	void dispB() {

	}	
}
/*
class Child extends Parent{

	@Override
	void dispA() {

	}

	@Override
	void dispB() {
	
	}
	
}
*/

/*
//The type Child must implement the inherited abstract method Parent.dispA()
class Child extends Parent{
	//필드
	//메서드
}
*/