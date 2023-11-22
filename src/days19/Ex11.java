package days19;

import java.util.Date;

public class Ex11 {
		//		날짜, 시간 클래스 + 형식화(fommatting) 클래스
		//		[일정관리]
		//컬렉션 프레임워크
		//제네릭+어노테이션
		//자바 입출력 (IO)
		//스레드+네트워크
		//람다식+스트림
	public static void main(String[] args) {
		// jdk 1.0		java.util.Date
		// jdk 1.1		java.util.Calandar
		//									ㄴGregorianCalendar
		//	jdk 1.8		java.time 패키지 안에 하위패키지와 클래스 추가
		
		Date d= new Date();
		//Tue Aug 08 15:38:07 KST 2023
		//System.out.println(d.toString());
		System.out.println(d);
		//8 Aug 2023 06:38:07 GMT
		//그리니치 표준시, 세계표준시간
		System.out.println(d.toGMTString());
		//2023. 8. 8. 오후 3:40:10
		//지역 시간
		System.out.println(d.toLocaleString());
		
		//년
		System.out.println(d.getYear()+1900);
		//월
		System.out.println(d.getMonth()+1);
		//일
		System.out.println(d.getDate());		
		//요일
		System.out.println(d.getDay());
		System.out.println("일월화수목금토".charAt(d.getDay()));
		//시간
		System.out.println(d.getHours());
		//분
		System.out.println(d.getMinutes());
		//초
		System.out.println(d.getSeconds());
		//******ms		1000ms =1s 
		System.out.println(d.getTime());
		
	}//main
}//class
