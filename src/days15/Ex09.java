package days15;

public class Ex09 {
	public static void main(String[] args) {
		/*
		 * 1. 문제점
		 *  employee 클래스 안에 getPay()가 없어서 호출 불가

		 * 		Employee e1 =new Regular();		//업캐스팅
		 * 		Employee e2 =new Sales();		//업캐스팅
		 * 		Employee e3 =new Temp();		//업캐스팅
		 * 		e1.getPay (); x 
		 * employee 클래스 안에 getPay()메서드선언 x
		 * =>employee 
		 * 급여계산방식이 클래스마다 다르기때문에 선언시 계속 재정의해야함
		 * 
		 */
		
		//학생관리 : 초,중,고,대학생...
		//		추상클래스  학생클래스 : 공통적으로 멤버
		
		/*
		 * 		[다형성]
		 * 여러가지 형태를 가질 수 있는 능력
		 * 
		 * Employee  e1 = new Regular ();
		 * Employee  e1 = new Sales ();
		 * Employee  e2 = new Temp ();
		 * 
		 */
		
		
		//Cannot instantiate the type Employee ==객체생성 불가능
		//불완전클래스 ==추상클래스이기 때문에
		// ㄴ new연산자로 객체생성 불가능 
		//Employee emp1 =new Employee("홍길동", "서울 강남구", "010-1234-1234", "2022.12.12");
		/*
		Employee emp1= new Regular("고길동", "서울 양천구", "010-5678-5678",	"2021.03.21", 4000000);
		Employee emp2=new SalesMan("임길동", "경기도 성남시", "010-2345-2345", "2021.04.14", 500000, 20, 70000);
		Employee emp3=new Temp("김둘리", "서울 목동", "010-7890-7890", "2020.10.10", 20, 250000);
		*/
		/*
		emp1.getPay();
		emp2.getPay();
		emp3.getPay();
		*/
		//최상위 super클래스 배열생성
		/*
		Employee [] emps = new Employee[3];
		emp[0]= new Regular("고길동", "서울 양천구", "010-5678-5678",	"2021.03.21", 4000000);
		emp[1]=new SalesMan("임길동", "경기도 성남시", "010-2345-2345", "2021.04.14", 500000, 20, 70000);
		emp[2]=new Temp("김둘리", "서울 목동", "010-7890-7890", "2020.10.10", 20, 250000);
		*/
		//클래스 배열 초기화
		Employee[] emps= {
				new Regular("고길동", "서울 양천구", "010-5678-5678",	"2021.03.21", 4000000),
				new SalesMan("임길동", "경기도 성남시", "010-2345-2345", "2021.04.14", 500000, 20, 70000),
				new Temp("김둘리", "서울 목동", "010-7890-7890", "2020.10.10", 20, 250000)	
		};
		
		for (int i = 0; i < emps.length; i++) {
			emps[i].getPay();	
		} //	for
		
		dispGetPay(emps[0]);
		dispGetPay(emps[1]);
		dispGetPay(emps[2]);
	}//main
	
	//다형성
	//한 함수에 묶어서 출력
	//사원 급여 출력 메서드 
	public static void dispGetPay(Employee emp){ //매개변수
		System.out.println(emp.getPay());	
	}
	//오버로딩(중복함수)
	/*
	public void dispGetPay(Regular emp){ 
		System.out.println(emp.getPay());

	public void dispGetPay(SalesMan emp){ 
		System.out.println(emp.getPay());

	public void dispGetPay(Temp emp){ 
		System.out.println(emp.getPay());
	*/

	
}//class
