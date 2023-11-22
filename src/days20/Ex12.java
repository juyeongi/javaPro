package days20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.IsoEra;
import java.time.temporal.ChronoField;

public class Ex12 {
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
//		LocalDate d = LocalDate.of(2023,8,9);
//		LocalDate d = LocalDate.ofYearDay(2023, 365);
		System.out.println(d);	//2023-08-09

		//년
		int year =d.getYear();
		System.out.println(year);
		year = d.get(ChronoField.YEAR);
		System.out.println(year);
		//월
		//int month= d.getMonth();		//Type mismatch: cannot convert from Month to int
													// Month타입 - j.t의 열거형
		Month eMonth =d.getMonth();
		System.out.println(eMonth); //AUGUST
		
		int month = d.getMonthValue();
		System.out.println(month);	//8
		
		month=d.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);
		
		//일
		int day=d.getDayOfMonth();
		System.out.println(day);
		day=d.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day);
		
		System.out.println();
		
		//
		LocalTime t = LocalTime.now();
		//시간
		int h = t.getHour(); //24시간 기준
		System.out.println(h);
		h=t.get(ChronoField.CLOCK_HOUR_OF_AMPM); //12~24
		System.out.println(h);
		h=t.get(ChronoField.CLOCK_HOUR_OF_DAY); //0~24
		System.out.println(h);
		h=t.get(ChronoField.HOUR_OF_AMPM); //0~11
		System.out.println(h);
		h=t.get(ChronoField.HOUR_OF_DAY); //1~12
		System.out.println(h);
		
		System.out.println();
		
		//분
		int m =t.getMinute(); 
		System.out.println(m);
		m= t.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println(m);
		
		//초
		int s =t.getSecond();
		System.out.println(s);
		s = t.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(s);
		
		//ns
		int ns =t.getNano();
		System.out.println(ns);
		
		//요일
		DayOfWeek dof =d.getDayOfWeek();
		// Date      0(일)1(월)2(화)~6(토)
		// Calendar  1(일)2(월)3(화)~7(토)
		// LocalDate 1(월)2(화)~~~~ 6(토)7(일)
		System.out.println(dof);
		System.out.println(dof.getValue());
		
	}//main
}//class
