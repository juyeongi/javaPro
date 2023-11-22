package days10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex02 {
	
	//함수 프로토타입 (Prototype)=함수 원형
	public static void main(String[] args) {
		getTotalDays (2023,7,1);
	}//main
	
	public static int getAmericanAge(String rrn) {
		//만나이 =올해년도 -생일년도 (생일 지나면 -1) 
		//만나이 = 세는나이 (올해 -생일 +1)-1  (생일 지나면 -1)
		return 0;
	}//getAmericanAge
	
	public static int getDayOfWeek(int year, int month, int day) {
		//날짜, 시간 기능(일=함수=매서드) 구현된 클래스
		//java.util. Date, Calender
		//jdk1.8 추가... LocalDate, LocalTime, LocalDateTime
		LocalDate d = LocalDate.of(year, month, month);
		DayOfWeek w=d.getDayOfWeek();
		w.getValue(); // 1(월),2(화), ...7(일)
		       //요일. enum 열거형
		return w.getValue() %7; //나머지값 -> 0 (일), 1(월),~6(토)
	}//getDayOfWeek
	public static int getTotalDays(int year, int month, int day) {
		LocalDate startDate=LocalDate.of(1, 1, 1);
		LocalDate endDate=LocalDate.of(year, month, day);
		
		int totalDays =(int)startDate.until (endDate, ChronoUnit.DAYS)+1;
		//startDate.until (endDate.ChronoUnit.MONTHS)+1;
		//startDate.until (endDate.ChronoUnit.dYEARS)+1;
		
		return totalDays;
	}
	
	private static int getLastDay(int year, int month) {
		LocalDate d=LocalDate.of(year, month, 1);
		
		LocalDate lastDate= d.withDayOfMonth(d.lengthOfMonth());
		return lastDate.getDayOfMonth();//마지막 날짜 객체로 일만 얻어옴
	}
}//calss
