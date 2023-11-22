package days20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex08 {
// 형식화클래스
//	DecimalFormat	
//		format()		숫자>원하는 형식의 문자열
//		parse()			문자열> 숫자

//	SimpleDateFormat
//		format()		날짜>원하는 형식의 문자열
//		parse()			문자열> 날짜	
	public static void main(String[] args) {
		//  23년 8월 9일 "수요일"	>	날짜
		//String strDate = "23년 8월 9일 (수요일)";
		String strDate = "23년 8월 9일 (수요일)";
		
		String pattern="yy년 MM월 dd일 (E)";  //복사
		SimpleDateFormat sdf= new SimpleDateFormat(pattern);
		try {
			Date d= sdf.parse(strDate);
			System.out.println(d.toLocaleString());
			//Date > Calendar
			Calendar c = Calendar.getInstance(); 
			c.setTime(d);
			System.out.println(Ex05.getPatternDate(c, pattern));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
