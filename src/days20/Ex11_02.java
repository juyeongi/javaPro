package days20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex11_02 {
	public static void main(String[] args) {
		//j.t패키지 핵심클래스 객체생성
		//		now() 메서드
		/*
		LocalDate ld = LocalDate.now();
										//2023-08-09
		System.out.println(ld.toString());

		LocalTime lt = LocalTime.now();
										//15:49:22.456029700
		System.out.println(lt.toString());
		
		LocalDateTime ldt = LocalDateTime.now();
										//2023-08-09T15:49:58.708943500
		System.out.println(ldt.toString());
		*/
		//		of() 메서드
		
		LocalDate ld = LocalDate.of(2015, 11, 23);
		System.out.println(ld);
		LocalTime lt = LocalTime.of(3, 20, 11);
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.of(ld, lt);
		System.out.println(ldt);
	
	}//main
}//class
