package days20;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/*
		 * Date(jdk1.0)
		 * Calendar (jdk1.1)
		 * 
		 * [ jdk1.8 날짜, 시간클래스( java.time 패키지) ]
		 * 
		 * 1.	java.time 패키지 - 날짜, 시간을 다루는 핵심 클래스 제공
		 * 			>>4개의 하위 패키지들로 구성
		 * 		ㄴj.t.chrono : 표준(ISO)이 아닌 달력시스템을 위한 클래스 제공
		 * 		ㄴj.t.format : 형식화(파싱) 클래스 제공
		 * 		ㄴj.t.temporal(시간의) : 날짜, 시간의 필드(field)와 단위(unit)클래스 제공
		 * 		ㄴj.t.zone : 시간대(time-zone) 클래스 제공
		 * 	Temporal, TemporalAdjuster 인터페이스 구현
		 * 
		 * 2.	java.time
		 * 		1)	날짜:	LocalDate클래스
		 * 		2)	시간:	LocalTime클래스
		 * 		3)	날짜 + 시간:	LocalDateTime클래스
		 * 		4) 날짜+ 시간+ 시간대:	ZoneDateTime클래스
		 * 
		 * 3.	new연산자로 객체생성 x	>	now(), of() 메서드 사용
		 * 
		 * 4.	날짜와 날짜 사이의 간격 : Period
		 * 		시간과 시간 사이의 간격 : Duration
		 * 		TemporalAmount 인터페이스 구현
		 * 
		 * 5.	날짜와 시간의 단위 정의 
		 * 		ㄴTemporal[unit] 인터페이스
		 * 		ㄴChronoUnit 클래스 (인터페이스 구현)
		 * 
		 * 	6.	날짜와 시간의 [필드(Field)] 정의
		 * 		ㄴTemporalField 인터페이스
		 * 		ㄴChronoField 클래스
		 * 	
		 * 		ex) Ex12.java
		 * 
		 * 	7.	특정 필드 (년, 월, 일 시간 ...) 가져오기
		 * 		ㄴgetXXX()
		 * 		ㄴget(필드)
		 * 
		 * 	8.	특정 필드 수정 :		with(), plus(), minus()
		 * 		Date d.setYear(??);
		 * 		Calendar c ;
		 * 		c.set(Calendar.YEAR, ??)		roll()		add()
		 * 
		 */	
public class Ex11 {
	public static void main(String[] args) {
		
	}//main
}//class
