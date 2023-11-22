package days14;
		// 변수 초기화
		//1) 지역변수   2) 인스턴스변수   3)클래스변수

		/*
		 * 	1. 초기화 : 변수를 선언하고 처음으로 값을 할당하는  것
		 * 2. 지역변수는 반드시 초기화해야 사용 가능
		 * 3. 인스턴스 변수
		 * 		클래스변수
		 * 초기화하지 않으면 각 자료형의 기본값으로 초기화되어져있음
		 * 자료형의 기본값 
		 * double  :  0.0 ,  0.0D
		 * int , byte, short  :  0
		 * lont  :  0L
		 * float  :  0.0f
		 * 
		 * String(클래스) ==참조형  :  null;
		 * 
		 * char  :  '\u0000'
		 * bloolean  :  false
		 */
public class Ex10 {
	double avg; //인스턴스 변수
	static double rate; //클래스변수
	public static void main(String[] args) {
		String name= "홍길동"; 
		
		//The local variable name may not have been initialized
		//지역변수 초기화해야 사용가능
		System.out.println(name);
		
		
		System.out.println(Ex10.rate);
		
		Ex10 obj = new Ex10();
		System.out.println(obj.avg);
		
	}//main
}//class
