package days02;

public class Ex05 {
	
	
	
	//**표준입력, 표준출력  ==> System 클래스 필요
	//System 안 표준출력함수
	//*함수 뒤에 ()붙여야함
	// println() : void println​(이름, 나이)	
	// printf()  : PrintStream printf​(String format, Object... args)
	// print()   : void print​(이름, 나이)
	
	public static void main(String[] args) {
		
		// Java. lang 패키지 안에 있는 System 클래스
		//Java.lang.System.out.println("이주영");
		
		//함수 (매서드) 3가지 파악을 해야 정확히 사용 가능 *시험3)
		// 1. 함수의 기능(일)파악
		// 2. 함수가 일처리를 할 때 필요한 값 (===> 매개변수, 파라미터, 인자, 인수)
		// 3. 함수가 일처리를 한 후에 반환(리턴)하는 값 파악 (===>리턴값)
		
		//ex) main()함수
		// 메인함수를 갖고있는 class
		//1. 기능파악 - 프로그램 시작/종료
		//2. 필요한것(매개변수) - 문자열배열 args =arguments=dlswkemf
		//3. 리턴값x, 리턴값이 없을 때 리턴자료형자리에  void선언
		                    //리턴자료형
		//public static void main(String[] args) {
		
		//System.out.printf("홍길동").printf("20");
	    System.out.println("이주영");
		System.out.println("이도경");
		System.out.println("토토");
		// println 개행가능(줄바꿈) print 개행x
		
		// 개행(줄바꿈) 방법 '\n'
	
		System.out.print("이주영"+'\n');
		System.out.print("이도경\n");
		System.out.print("토토");
		System.out.println(); //개행
		System.out.print("강다희");
		
		//Ctrl +Shift + a <-> alt + shift + a
	
		 
	 
		
 
		
	}//main

}//class
