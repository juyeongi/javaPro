package days15;

import static java.lang.Math.random;

public class Ex06 {
	public static void main(String[] args) {
		/*
		 * 1. 패키지 (package)
		 * 		1) 관련있는 클래스들의 묶음, 인터페이스의 묶음
		 * 		2) 클래스를 효율적으로 관리
		 * 			ex) java.io패키지 - input/ output 입출력
		 * 		3) 클래스의 이름이 충돌하는 것을 막아줌
		 * 			다른 개발자가 구현한 클래스 라이브러리의 클래스와 이름이 
		 * 			충돌되는것을 피할 수 있음
		 * 		4) 자신만이 사용할 패키지의 체계가 있어야함
		 * 			도메인명
		 * 			naver.com
		 * 			sist.org
		 * 		5) 클래스 > 물리적으로 >???.class (클래스파일)
		 * 			패키지 > 물리적으로 >디렉토리 생성
		 * 			ex) java.lang.System 클래스
		 * 			java폴더 
		 * 				ㄴlang폴더
		 * 					ㄴSystem.class파일
		 * 		6) 선언형식
		 * 			소스파일의 첫번째 라인 (문장) 단 한번 선언
		 * 			package패키지명.패키지명;
		 * 		7) 패키지명은 소문자로 작명
		 * 
		 * 2. import문
		 * 		1) 소스파일에서 다른 패키지의 클래스를 사용하려면
		 *		    패키지명이 포함된 클래스이름을 사용
		 *		2) 패키지이름+클래스이름=클래스의 풀네임
		 *			ex) java.io.클래스명
		 *		3) 풀네임
		 *			java.lang.System.out.println();
		 *		4) import문 사용해서 미리 풀네임을 명시 
		 *			ex) import java.lang.System;
		 *					> System.out.println();
		 *		5) import문 x
		 *			Ctrl+ Shift+ 0 
		 *		6) import java.*; 컴파일러가 자동으로 추가
		 *			ex) import java.io.BufferedReader;
         *         		  import java.io.InputStreamReader;
		 *		
		 *		7) static import 문
		 */
		
		//static random(), PI
		/*
		System.out.println(Math.random());
		//							클래스명.메서드명()
		System.out.println(Math.PI);
		//							클래스명.필드명			
		*/
	}//main
}//class
