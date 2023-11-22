package days22;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01_02 {
	
	//21일차 복습 2-2. String s = "2023.08.11 (금)" 문자열을 LocalDate 클래스로 변환
	public static void main(String[] args) {
		
		String s = "2023.08.11 (금)";
		String pattern = "yyyy.MM.dd (E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(s);
		LocalDate d= LocalDate.parse(s,dtf);
		System.out.println(d);
		/*
		String s = "2023.08.11";
		LocalDate d =LocalDate.parse(s);
		System.out.println(s);
		*/
	}
}
