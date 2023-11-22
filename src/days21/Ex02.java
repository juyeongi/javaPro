package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex02 {
	public static void main(String[] args) {
//		개강일(2023.7.13)로부터 100일 되는 날짜를 출력
//		1) Date 클래스 사용
		Date sday =new Date(2023-1900,7-1,13);
		sday.setDate(sday.getDate()+100);
		System.out.println(sday.toLocaleString());
//		 2) Calendar 클래스 사용
		Calendar c = new GregorianCalendar(2023,7-1,13);
		c.add(Calendar.DATE, 100);
//	 	3) LocalDate 클래스 사용  //변경불가능한 클래스 수정불가. 새로운 객체생성
		LocalDate ld = LocalDate.of(2023,7,13);
		System.out.println(ld);
//		[1]
//		ld=ld.plusDays(100);
//		System.out.println(ld);
//		[2]
		ld =ld.plus(100,ChronoUnit.DAYS);
		System.out.println(ld);
	}
}
