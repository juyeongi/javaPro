package days21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex10 {
	public static void main(String[] args) {
		//수료일 -오늘날짜 : 
		
		//날짜-날짜 Period
		//시간-시간 Duration
		
//		between()   ==	     until()
//		static메서드	  ==	  instance메서드
//		of()	,	with()	변경메서드
//		plus()	,	minus()..
		
		//개강일 +100일
		
//		개강일
		LocalDate s = LocalDate.of(2023, 7, 13);
//		오늘날짜
		LocalDate t = LocalDate.now();
		t = t.plusDays(1);
//		날짜 차								   s<=	
		Period p = Period.between(s, t); //endDate포함x
		int year =p.getYears();
		System.out.println(year);
		
		long month = p.get(ChronoUnit.MONTHS);
		System.out.println(month);
		
		long day = p	.getDays();
		System.out.println(day);
		

		LocalTime st = LocalTime.of(9, 0, 0);
		LocalTime tt = LocalTime.now();
//		시간차 Duration		
		Duration d = Duration.between(st, tt);
		long ss = d.getSeconds();
//		System.out.println(ss); // s
//		System.out.println(ss/(60*60));  //h
		
//		Unsupported unit: Hours// 지원하지않음
//		long h = d.get(ChronoUnit.HOURS);
//		System.out.println(h);
		
	}//main
}//class
