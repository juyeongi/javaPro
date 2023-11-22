package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex04 {
//			jdk1.1 calendar 추상클래스 - 날짜, 시간
//									: 지역에서 필요한 달력을 불러와서 사용할 수 있도록
	public static void main(String[] args) {
		//Calendar c=new GregorianCalendar();
		//				ㄴ BuddhistCalendar 태국
		Calendar c =Calendar.getInstance();
		//c.add(int field(날짜,연도,시간..), -2);
		//c.clear(시간,분,초); ==d2.setHours(0);
		//년

		System.out.println(c.get(1)); // 2023
		System.out.println(c.get(Calendar.YEAR));
		//월
		System.out.println(c.get(2)+1); //8
		System.out.println(c.get(Calendar.MONTH)+1); //8
		//일
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		//시간
		System.out.println(c.get(10));  
		System.out.println(c.get(Calendar.HOUR)); //12hours 
		System.out.println(c.get(11));
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //24hours
		//분
		System.out.println(c.get(Calendar.MINUTE));
		//초
		System.out.println(c.get(Calendar.SECOND));
		//ms
		System.out.println(c.get(Calendar.MILLISECOND));
		//요일
		//date 0일, 1월~ 6토
		//calendar 1일 1월 3화~7토
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.PM));
		//해당 연도의 몇번째주
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		//해당월의 몇번째주
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		
		
	}//main
}//class
