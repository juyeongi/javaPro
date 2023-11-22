package days20;

import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		int year = 2023;
		int month = 8;
		
		 int dayOfWeek = getDayOfWeek(year, month, 1);
	     int lastDay = Ex01.getLastDay(year, month);
	      
	     Date startDay = new Date(year-1900, month-1, 1);
	     startDay.setDate(startDay.getDate()-dayOfWeek);
	     
	     int m;
	     
	     for (int i = 1; i < 42; i++) { 
	    	 m=startDay.getMonth()+1;
	    	 if (month==m) {
	    		 System.out.printf("%d\t", startDay.getDate());
				
			} else {
				System.out.printf("\t");
			}
	    	 if (i%7==0) System.out.println();
	    	 startDay.setDate(startDay.getDate()+1);
			
		} //	for
		

	}//main

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900, month-1, 1);
		return d.getDay();
	}

	public static boolean inEqualsDate(Date d1, Date d2) {
		int index=10;
		d1.setHours(0);
		d1.setMinutes(0);
		d1.setSeconds(0);
		d2.setHours(0);
		d2.setMinutes(0);
		d2.setSeconds(0);
		//String s1 = d1.toLocaleString().substring(0,index);
		//String s2 = d2.toLocaleString().substring(0,index);
		
		return d1.toLocaleString().equals(d2.toLocaleString());
		
		
	}
}
