package days24;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * 	[중첩 클래스와 중첩 인터페이스]
		 * 1. 클래스와 클래스들 간의 관계
		 * 		has-a 관계
		 * 		is-a 관계
		 * 2. 어떤 클래스(A)가 특정 클래스(B)와 관계가 있다면
		 * 		B라는 클래스 안(내부)에 A 클래스 선언
		 * 3. 중첩클래스(Nested Class)
		 * 		장점
		 * 		1) 두 클래스에 멤버들에 서로 쉽게 접근가능
		 * 		2) 불필요한 관계 클래스를 숨김 > 코드의 복잡성을 줄일 수 있음
		 * 4. Ex)
		 * 		Class A{
		 * 				//필드
		 *				//생성자
		 *				//메서드
		 *				//getter,setter
		 *				//중첩클래스
		 *			Class B{	
		 *				}
		 *				//중첩인터페이ㅡ
		 *			Interface IC{
		 *				}
		 *		}
		 *
		 *5. 중첩클래스의 종류 : 선언위치에 따라 구분
		 *		1) 클래스의 멤버로 선언
		 *				인스턴스 멤버클래스 		: A클래스에서 객체를 생성해야 B중첩클래스 사용 가능
		 *				정적 static 멤버클래스	: 객체생성없이 C중첩클래스 사용 가능
		 *
		 *	중첩클래스도 .class파일 생성 (A$B.class)
		 *		2) 특정메서드 내부에 선언			
		 *				로컬클래스					:메서드가 실행될 때 사용가능
		 *					A(외부)$1B(로컬클래스명).class			
		 *5-(2). Ex)	
		 *		class A{
		 *			viod disp(){ //메서드
		 *				classD{	//로컬클래스 : 접근지정자 사용x
		 *					(**static 필드, 메서드 선언불가)
		 *					D(){}; //생성자
		 *					int d; //변수
		 *				}
		 *
		 *				b.obj = newD();
		 *				obj.d1;
		 *				obj.test();
		 *			}
		 *			class B{	 //인스턴스멤버클래스
		 *				B(){} //생성자
		 *				int b1; // 인스턴스필드
		 *				void test(){} //인스턴스 메서드
		 *				(**static 필드, 메서드 선언불가)
		 *
		 *			A a = new A();		
		 *			A.B b = a.new B();	
		 *			b.b1 = 100;
		 *			b.test();
		 *			
		 *			}
		 *			static class C{ //정적멤버클래스
		 *			//모든 필드, 메서드 선언가능
		 *				int c1; // 인스턴스변수
		 *				static sc1;	// 변수
		 *				void test(){}; //인스턴스 메서드
		 *				static void test2(){}; //메서드
		 *				c(){}; 	//생성자
		 *	
		 *			외부객체 생성할 필요 없음
		 *			A.C c - new A.C();
		 *			c.c1 = 100;
		 *			c.test1();
		 *			A.c.sc1 = 100;
		 *			A.C.test2();
		 *			}
		 *		}
		 *
		 */
	}//m
}//c
