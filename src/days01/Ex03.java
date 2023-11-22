package days01;

//Alt + Shift + J - 주석처리
/**
 * @author user 이주영
 * @DATE
 * @SUBJECT 자바의 변수와 상수
 * @CONTENT 1.변수,상수의 개념설명, 변수 개념
 */
public class Ex03 {

	public static void main(String[] args) {
		
	
	//1. 변수(variable)
	//변하는 수 (수학 의미)
	//메모리상의 값을 저장하는 공간

    // 2. 상수(const)
	// 변화하지 않는 수 (== 고정된 수)
	// 메모리상의 값을 저장하는 공간(프로그램 언어)
	
	//	[선언형식] 1. 클래스 2.함수(매서드)
	// 3.변수 선언 형식
	//자료형 변수명[=초기값];
	//자료형==데이터 타입 [data type]
    //4. 실습
	//; 세미콜론 명령라인 종결
	//이주영 오류string cannot be resolved to a type
	//자바에서 문자열 == 문자의 나열  "문자열"
	//자바에서 한 문자 '이'
	//System.out.println(이주영); 자바에서 변수로 인식
	
		
		//문자열 변수
		//이름을 저장하는 문자열변수 선언
		//변수 이름을 명명짓는 규칙 p26
	  String name ="이주영"; 	 //자료형 변수명[=초기값]; ( "=" 대입(할당)연산자.우측의 문자열값을 좌측" name "에 대입 ) 
	  System.out.println(name);
	  //Duplicate local variable name 
	  //name 로컬변수 중복선언됨
	  // 
	  name ="이도경"; 	 //자료형 변수명[=초기값]; ( "=" 대입(할당)연산자.우측의 문자열값을 좌측에 대입 ) 
	  System.out.println(name);
	
    }//main
					 
					 
    		
}//class