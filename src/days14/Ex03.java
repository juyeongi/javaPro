package days14;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//필드 초기화하는 생성자
		Random rnd = new Random(10000L); //Long seed
		
		Scanner scanner = new Scanner(System.in);
		
		int year = 2023;
		int month=10;
		int day =25;
		
		Date d = new Date(year-1900, month-1, day);
		//2023. 8. 1. 오전 10:48:52 해당지역 
		System.out.println(d.toLocaleString());
		System.out.println(d.toString());
		
		System.out.println(d.getDay()); //3 수요일
	}

}
