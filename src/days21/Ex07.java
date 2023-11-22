package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex07 {
	public static void main(String[] args) {
		
//		LocalDate
//		LocalTime
//		날짜+시간
		/*
		LocalDateTime dt = LocalDateTime.now();
//		2023-08-10T11:20:59.041907
		System.out.println(dt);
		
		//truncate 절삭(내림)
		dt=dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);
		*/
		/*
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		
		LocalDateTime dt = LocalDateTime.of(d, t);
		LocalDateTime dt2 =d.atTime(t);
		LocalDateTime dt3 =t.atDate(d);
		*/
		
		LocalDateTime dt = LocalDateTime.now();
//		변환
//		LocalDateTime >LocalDate
		LocalDate d= dt.toLocalDate();
//		LocalDateTime >LocalTime
		LocalTime t = dt.toLocalTime();
	}//main
}//class
