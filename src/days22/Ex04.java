package days22;

import java.time.LocalDateTime;

public class Ex04 {
	
//	21일차 복습	4. java.time.LocalDateTime 클래스 사용
//	   1) 설문 시작일 : 23.8.10   9:00:00
//	   2) 설문 종료일 : 23.8.15  18:00:00
//	   
//	   지금 현재 설문 가능여부에 대해서 출력 ( 가능, 불가능 )
	public static void main(String[] args) {
		LocalDateTime serveyStratDate= LocalDateTime.of(23,8,10,9,0,0);
		LocalDateTime serveyEndDate= LocalDateTime.of(23,8,15,18,00,00);
		
		LocalDateTime now = LocalDateTime.now();
//		now.isAfter();
//		now.isBefore();
//		now.isEqual();
//		now.compareTo();
		
		System.out.println(now.isAfter(serveyEndDate));
		/*
		LocalDate a = LocalDateTime.of(2012, 6, 30, 12, 00);
   		LocalDate b = LocalDateTime.of(2012, 7, 1, 12, 00);
   		a.isAfter(b) == false
   		***a.isAfter(a) == false		//같은 날짜 true값 포함x
   		b.isAfter(a) == true
		*/
		
//			설문 시작일, 종료일은 설문가능기간 X
		if (now.isBefore(serveyStratDate) || now.isAfter(serveyEndDate)){
			System.out.println("설문기간 x");
		}else
			System.out.println("설문기간 o");
		
	}

}
