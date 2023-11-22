package days13;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//1.OOP = 객체지향프로그래밍
		//2.클래스 = 객체를 만들기 위한 설계도 
		//3. 객체 = 클래스로 실제 존재하는 것 , 사물(유형) 또는 개념 (무형)
		//Scanner scanner;
		// 클래스를 자료형으로 선언한 참조변수
		//4. 인스턴스(Instance) = 생성된 객체
		//5. 인스턴스화 = 설계도(클래스)로 객체를 생성하는 과정
		//6. OOP의 특징 == 클래스 특징
		// 1) 캡슐화 2) 은닉화 3) 상속성 4) 다형성 ->인터페이스 5) 추상화
		//7. 객체 (물건, object)의 구성요소 =특징(속성) + 기능(일)
		//ex)         망치                       =손잡이+쇠+크기,재질  + 용도에 따라 기능이 달라짐
		//  1) 객체의 구성요소 "멤버"
		//  2) 특징(속성) = property = 멤버변수 = 필드 (field)
		//  3) 기능(일) = function = 멤버함수 = 매서드 (mathod)
		//7. 클래스를 설계하는 과정 
		//  1) 객체의 구성요소(기능, 속성) 파악 -> 목록작성 (매서드, 필드)
		//  2) 클래스 선언 
		//[접][기]class클래스명[extends Super클래스][implements인터페이스]{
		// 필드선언
		//매서드선언
		//}
		//  3) 객체생성 -테스트
		//  4) 문제점 파악 -유지, 보수
		//  5) 상용화 - 배포
		//  6) 버전관리 -기능 추가, 수정
		//9. 클래스
		//  자바의 자료형
		//  1)기본형 (8가지)
		//  2)참조형 - 배열, 클래스, 인터페이스
		//      ㄴ new연산자에 의해서 힙(동적)영역에 실제 저장공간이 할당되고 그 주소를 참조한다.
		// ex) 배열
		//          int []m ;         // 변수 ,참조변수, 배열명
		//          [4byte][4byte][4byte][4byte] [주소참조]
		//            0x100                                      m
		//          new int[5];  //시작 주소값을 할당
		//ex)
		Scanner scanner = null;
		//new 객체생성 -> new연산자로 생성된 객체 = 인스턴스
		//인스턴스화 하는 작업(코딩) : new 객체생성
		//scanner= new 객체생성;
		scanner = new Scanner(System.in);
	   //  ㄴ클래스    ㄴ변수,참조변수, 객체
		System.out.print(">이름입력");
		//The local variable scanner may not have been initialized
		//지역변수는 반드시 초기화해야 사용할 수 있다  ==>null로 초기화. null:참조하지않음
		//실행에러 java.lang.NullPointerException
		String name =scanner.next();
		System.out.println(name);
		
		Random rnd = new Random();
		//                    ㄴ객체 생성(인스턴스화)하는 코딩 
		//The constructor(생성자) System() is not visible
		//인스턴스화 할 수 없는 클래스 : System
		//System s = new System();
		
		//modifier 함정자, 수정자 = 점근지정자 + 기타제어자
		//Illegal modifier for parameter age; only final is permitted
		//지역변수 앞 접,기 사용x
		//public int age = 20;
		//public final int age = 20; final도 x
		//[클래스선언] Tv
		
		
	}//main
}//class