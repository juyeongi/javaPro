package days15;

public class Ex08 {
	public static void main(String[] args) {
		//[1]
		/*
		Employee emp1 =new Employee("홍길동", "서울 강남구", "010-1234-1234", "2022.12.12");
			emp1.dispEmpInfo();
		//object.toString () -> Overriding
			System.out.println( emp1.toString());
			System.out.println( emp1); //toString 생략
		*/
		
		//is-a (상속)
		//정규직은 사원이다. 0
	
		//[2]
		/*
		Regular emp2= new Regular("고길동", "서울 양천구", "010-5678-5678",
				"2021.03.21", 4000000);
		//문제점 : 기본급 출력 x
		emp2.dispEmpInfo();
		System.out.println(emp2);// @toString() 기본급 출력 x
		*/
		
		//	[3]
		/*
		//[상속]관계일 때 가능
		//Employee=Regular 타입 불일치, 클래스들간 자동형변환
		//부모클래스 emp2=new 자식클래스
		//[업캐스팅(upcasting)]
		//상속관계가 있는 클래스들간의 형변환
		//new연산자를 통해 자식객체를 생성해서 부모객체타입에 참조
		//Regular를 Employee에 참조시켰지만 Employee 클래스의 dispEmpInfo값이 아닌 실제 생성된 Regular객체의 dispEmpInfo 메서드 호출
		Employee emp2= new Regular("고길동", "서울 양천구", "010-5678-5678",
				"2021.03.21", 4000000);
		emp2.dispEmpInfo();
		//[업캐스팅 문제점]
		//emp2.getPay(); Employee에 선언되지 않아서 호출불가
		//다운캐스팅(downcasting) cast연산자 강제형변환
		//[조건] 업캐스팅된 객체만 다운캐스팅 가능 
		//자식객체생성 -> 부모객체에 참조 업캐스팅
		//
		Regular emp =  (Regular) emp2; //cast 형변환
		*/
		/*
		//컴파일+런타임오류 =빌드
		//Type mismatch: cannot convert from Employee to Regular (컴파일오류)
		//타입불일치, Employee를 Regular로 형변환
		// cast연산자 == class 형변환 가능
		//java.lang.ClassCastException 런타임오류 (실행시 오류) :: 업캐스팅되지 않은 new연산자는 다운캐스팅 불가
		Regular emp=(Regular) new Employee("홍길동", "서울 강남구", "010-1234-1234", "2022.12.12");
		*/
		//[참고]
		//int n=100;
		//long l = n; //long(8byte) =int(4byte) 타입 불일치 , 자동형변환 좌측이 우측보다 클 때 
		
		//[4] SalesMan, Regular, Employee 참조
		/*
		Employee emp3=new SalesMan("임길동", "경기도 성남시", "010-2345-2345", "2021.04.14", 500000, 20, 70000);
		emp3.dispEmpInfo();
		System.out.println(emp3.getPay());	//호출x Employee에 getPay x
		*/
		
		//[5]
		
		Employee emp4=new Temp("김둘리", "서울 목동", "010-7890-7890", "2020.10.10", 20, 250000);
		emp4.dispEmpInfo();
		System.out.println(emp4.getPay()); // x
		
	}//main
}//class