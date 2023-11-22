package days14;

public class Ex10_02 {
	//[필드]
	//인스턴스변수
	String name="익명";  //명시적 초기화
	int age;
	boolean gender=true;  //명시적 초기화
	//클래스변수(static변수)
	static double rate = 0.05;  //명시적 초기화
	
	//생성자초기화
	Ex10_02(){
		this.name="홍길동";
		this.age=10;
		this.gender=false;
		
		// this.rate=0.01; static으로 객체값 없이 초기화되기 때문에 생상자에서 사용x
	}//Ex10_02
	
	{
		//[인스턴스 초기화 블럭]
		//오버로딩된 생성자에서 중복되는 초기화 코딩이 있다면
		//중복초기화 코딩을 인스턴스 초기화 블럭으로 따로 선언할 때 사용
	}
	
	static {
		//클래스 초기화 블럭 - 클래스 변수초기화
		//객체 생성과 상관없이 프로그램이 시작할 때
		//한번 static 초기화 블럭이 실행됨
	}
	
	public static void main(String[] args) {
		
		System.out.println(Ex10_02.rate);
		
		Ex10_02 obj = new Ex10_02 ();
		System.out.println(obj.name); 
		System.out.println(Ex10_02.rate); 
		//나중에 초기화되는것이 출력
		
		/*(인스턴스필드, 클래스필드)
		 * 필드 (멤버변수) 초기화
		 * 1) 명시적 초기화 :값을 지정함
		 * 2) 생성자 초기화 :
		 * 3) 초기화 블럭 {}
		 * 		(1) 인스턴스 초기화 블럭 - 인스턴스 변수 초기화
		 * 		(2) 클래스 초기화 블럭 - 클래스 변수 초기화
		 */
	}//main
}
