package days19;

import java.util.Date;

public class Ex12 {
	public static void main(String[] args) {
		//[달력]
		//년, 월, 1일 무슨요일
		int year = 2010;
		int month =5;
		int date =1;
		/*
		Date d = new Date();
		//get 뒤에 값을 가져옴 set 값을 불러옴
		d.setYear(year-1900);
		d.setMonth(month-1);
		d.setDate(date);
		
		d.setHours(0);
		d.setMinutes(0);
		d.setSeconds(0);
		*/
		
		Date d = new Date(year -1900, month-1, date);
		System.out.println(d.toLocaleString());
		System.out.println(d.getDay());
		System.out.println("일월화수목금토".charAt(d.getDay()));
		
		//2010.5 마지막날짜
		d.setMonth(month);
		System.out.println(d.toLocaleString());
		//2010. 6. 1. 오전 12:00:00  -1day
		date=d.getDate()-1;
		d.setDate(date);
		System.out.println(d.toLocaleString());  //2010. 5. 31. 오전 12:00:00
		System.out.println(d.getDate());  // 마지막날짜 : 31
	
	}//main
}//class
