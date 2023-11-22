package days16;

import days15.Employee;
import days15.Regular;
import days15.SalesMan;
import days15.Temp;

public class Ex02 {
	public static void main(String[] args) {
		//ctrl + shift + o 관련import 자동생성
		//Regular  e1 = new Regular ();
		//dispGetPay(e1);
		SalesMan  e2 = new SalesMan ();
		dispGetPay(e2);
		//Temp  e3 = new Temp ();
		//dispGetPay(e3);
	}

//인스턴스 메서드 ( 객체생성필요) > 클래스메서드(static)로 변경
//매개변수 다형성
	public static void dispGetPay(Employee emp) {
		//emp객체가 Regular, sales, temp 중 어떤 객체인지 확인불가
		// instanceof 로 확인가능
		//if else if
		//상속관계 클래스는 자식클래스먼저 선언, 
		//부모클래스가 먼저 호출되기 때문에 
		if(emp instanceof SalesMan) {
			System.out.println(">emp 객체는 SalesMan타입이다");
			SalesMan s1 = (SalesMan)emp; //객체 확인 후 다시 다운캐스팅
		}else if(emp instanceof Regular) {
			System.out.println(">emp 객체는 Regular타입이다");
			Regular r1 =(Regular)emp;	 ////객체 확인 후 다시 다운캐스팅
		}else if(emp instanceof Temp) {
			System.out.println(">emp 객체는 Temp타입이다");
		}
		emp.getPay();
	}	

}
