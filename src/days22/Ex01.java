package days22;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	
	//21일차 복습 2
	
//	형식화클래스 Date, Calendar  ==> 	SimpleDateFormat
//													parse(), format()
	public static void main(String[] args) {

		LocalDateTime ldt= LocalDateTime.now();
		
		String pattern = "yyyy/MM/dd E요일   hh:mm:ss.SSS";
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern(pattern);
		String output = dtf.format(ldt);
		System.out.println(output);	
	}//main
}//class
