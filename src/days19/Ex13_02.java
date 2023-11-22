package days19;

import java.util.Date;
import java.util.Iterator;

public class Ex13_02 {
			//달력그리기 - Date클래스
	public static void main(String[] args) {
		int year=2023;
		int month=8;
		//오늘날짜객체 2023.8.8
		//Date today = new Date();
		
		int dayOfWeek=getDayOfWeek(year, month, 1);
		int lastDay= getLastDay(year, month);
		// System.out.println(dayOfWeek +"/"+lastDay);
		
		Date d = new Date(year -1900, month-1, 1); //2023.8.1
		int date = d.getDate()-dayOfWeek;
		d.setDate(date); 
		//System.out.println(d.toLocaleString());
		for (int i = 1; i <42; i++) {
			
			// true / false  d.after(d2)  특정날짜 이후 
			// true / false  d.before(d2)  특정날짜 이전
			// true / false  d.equals(d2) 
			// d.compareTo(d2) 
			
			//System.out.println(d.toLocaleString());
			int y = d.getYear()+1900; // for문밖으로 선언하기 
			int m = d.getMonth() +1;
			int dd = d.getDate(); // for문밖으로 선언
			// 오늘날짜 [] : 년, 월, 일 ==  
				System.out.printf(m==month?"%d\t":"(%d)\t",d.getDate());
			if(i%7==0) System.out.println();
			date = d.getDate() +1;
			d.setDate(date);
		
		} //	for
		
	}//main

	private static int getLastDay(int year, int month) {
		Date d = new Date(year -1900, month, 1); //다음달 1일 - 1일
		int date = d.getDate()-1;
		d.setDate(date);
		return d.getDate();
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year -1900, month-1, date);
		return d.getDay();  //0(일)~6(토)
	}
}//class
