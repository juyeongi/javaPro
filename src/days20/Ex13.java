package days20;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex13 {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		//년도 수정
		//d.withYear(2020);	//불변
		/*
		d=d.withYear(2020);
		d=d.withMonth(6);
		d.withDayOfMonth(11);
		*/
		d=d.with(ChronoField.YEAR, 2010);
		System.out.println(d);
		
		
		String a = "asdf";
		a.replace('a', 't');
		System.out.println(a);	//asdf
		//string은 불변. 새로운 객체 생성
		String b =a.replace('a', 't');
		System.out.println(b);	//tsdf
	
	}//main
}//class
