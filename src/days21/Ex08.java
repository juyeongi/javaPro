package days21;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class Ex08 {
	public static void main(String[] args) {
		// 이번달 마지막 날짜 며칠까지?
	
		//date
		/*
		Date d = new Date();
		d.setMonth(d.getMonth()+1);
		d.setDate(1);
		d.setDate(d.getDate()-1);
		System.out.println(d.toLocaleString());
		*/
		
		//calendar
		
//		Calendar c = Calendar.getInstance();
//		c.getActualMaximum(Calendar.DATE);
		//localdate 이번달 마지막 날짜
		/*
//		String source ="2009년 12월 30일";
//		String source ="2009.12.30";
		String source ="2009-12-30";
		LocalDate d = LocalDate.parse(source);
		System.out.println(d);
		*/
//		[1]
		/*
		LocalDate today = LocalDate.now();
		LocalDate firstDay = today.withDayOfMonth(1);
		System.out.println(firstDay);
		
		System.out.println(today.lengthOfMonth());
		LocalDate lastDay = today.withDayOfMonth(today.lengthOfMonth());
		System.out.println(lastDay);
		*/
		
//		[2]
		LocalDate today = LocalDate.now();
		LocalDate lastDay= today.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastDay);

	}

}
