package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex06_02 {
	public static void main(String[] args) {
		//2023.8
		Calendar c = new GregorianCalendar(2023,8-1,1); //객체생성
		//하루 전
		/*		원하는 날짜로 지정할 때 사용. 증가감소 x
		c.set(Calendar.DATE, 1); //7/30
		c.set(Calendar.DATE, 0); //7/31
		c.set(Calendar.DATE, -1); //7/30
		//c.set(Calendar.DATE, 10);
		//c.set(Calendar.DATE, 32);
		*/
		//c.add(Calendar.DATE, -1); // 날짜 -1
		//c.add(Calendar.DATE, 1); // 날짜 1
		//c.roll(Calendar.DATE, -1); //xx
		System.out.println(Ex05.getPatternDate(c,"yyyy-MM-dd"));
		
	}//main
}//class
