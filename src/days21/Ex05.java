package days21;

import java.time.LocalDate;

public class Ex05 {
	public static void main(String[] args) {
//		plusXXX() , plus(), minusXXX(), minus()
//		날짜와 시간 비교 : isAfter(), isBefore(), isEqual()
//		오늘 생일
//		1999.8.10	
//		2023.8.10
//		년도를 맞춘 후 날짜객체로 비교
		LocalDate today = LocalDate.now();
		
		LocalDate birth = LocalDate.of(1999,8,1);
		birth = birth.withYear(today.getYear()); //1999>2023
		System.out.println(birth);
		
		System.out.println(today.isBefore(birth));
		System.out.println(today.isEqual(birth));
		System.out.println( today.isAfter(birth));
		
		System.out.println(today.compareTo(birth));		
	}//main
}//class
