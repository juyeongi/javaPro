package days20;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex05_02 {
//			날짜, 시간 정보를 사용자가 원하는 형식으로 출력
	public static void main(String[] args) {
		//SimpleDateFormat 형식화 클래스
		String pattern = "yyyy. MM. dd. a. HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//Date클래스
		/*
		Date today = new Date();
		String strToday = sdf.format(today);  //format calendar에서 사용불가능
		System.out.println(strToday);
		 */
		
		Calendar c = Calendar.getInstance();
		//Calendar>Date 변환
		
		//[1]
		//long t = c.getTimeInMillis();
		//Date today = new Date(t);
		
		//  == Date today = new Date (c.getTimeInMillis());
		//[2]
		Date today = c.getTime();
		String strToday = sdf.format(today);
		System.out.println(strToday);
		
	}//main
}//class
