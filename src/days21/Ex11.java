
package days21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.Temporal;

public class Ex11 {
	
//		[DateTimeFormatter 형식화클래스]
//		java.time 패키지 	핵심클래스
//		문자열-> 파싱->		핵심클래스
//		     	<-포맷<-
//		     	DateTimeFormatter형식화클래스
//		LocalDateTime implements Temporal
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
//		2023-08-10T14:05:40.555932100
		System.out.println(dt);
		
		String pattern="yyyy/MM/dd E요일 hh:mm:ss.SS";
//		DateTimeFormatter dtf  new 연산자 x
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern(pattern);
		
		String output= dtf.format(dt);
		//2023/08/10 목요일 02:11:04.07
		System.out.println(output);
		
	}
}
