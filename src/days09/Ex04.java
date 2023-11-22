package days09;
import java.util.Scanner;

public class Ex04 {
	//달력
	//1)년, 월, 1일 요일?
	//2)년, 월 마지막 날짜?
	public static void main(String[] args) {
		
		int year, month;
		try (Scanner scanner =new Scanner(System.in)){
			System.out.print(">년도 월 입력");
			year = scanner.nextInt();
			month = scanner.nextInt();
			
			printCalendar(year, month);
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
	//2023 달력출력
		/*
		int year=2023;
		for (int i = 1; i <=12; i++) {
			printCalendar(year, i);
		} //for
		*/
		
	//2020~2023달력출력
		/*
		for (int y = 2020; y <=2023; y++) {
			for (int i = 1; i <=12; i++) {
				printCalendar(y,i);
				
			} //for
		} //for
		 */

	}//main
	//[2]
	//**달력출력
	private static void printCalendar(int year, int month) {
		//1일 요일
		int dayOfWeek=getDayOfWeek(year, month,1);
		int lastDay = getLastDay(year, month);
		//달력 선 출력
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		System.out.println("-".repeat(60));
		String week="일월화수목금토";
		//문자열 나누기 
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c",week.charAt(i));
		} //for
		System.out.println();//개행
		System.out.println("-".repeat(60));
		//날짜출력
		//1일 날짜 앞의 공백찍는 for문
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");	
		} //for
		for (int i = 1; i < lastDay; i++) {
			System.out.printf("\t%d",i);	
			//일자 개행시 + 1일 시작 전 공백
			if(( i+dayOfWeek)%7==0)System.out.println();
			
		} //for
		System.out.println();//개행
		System.out.println("-".repeat(60));
		
	}//printCalendar
	//*달 시작요일
	private static int getDayOfWeek(int year, int month, int day) {
		//1.1.1~year.month.day 총날짜수
		int totalDays= getTotalDays(year,month,day);
		int dayOfWeek=totalDays%7;
		//System.out.println("일월화수목금토".charAt(daysOfWeek));
		return dayOfWeek;
	}//getDayOfweek
	//**총날짜수
	private static int getTotalDays(int year, int month, int day) {
		//int year=2023, int month=7, int day =1
		int totalDays=0;
		/*
		for (int i = 1; i <year; i++) {//전년도까지 총날짜수,윤년 수
			totalDays+= days08.Ex05.isLeapYear(i) ? 366 :365;//전년도까지 윤년 수
		} //for
		*/
		//totalDays에 윤달 포함x  윤달=년도/4의 몫.
		totalDays+=(year-1)*365+(year-1)/4 - (year-1)/100+(year-1)/400;
		//                2022년도까지   윤달            
		
		
		//2023 1~6월까지,+1(7월 일수)
		for (int i = 1; i <month; i++) {//전달까지 total
			totalDays+=getLastDay(year, i);
		} //for
		totalDays++;	
		return totalDays;
	}//getTotalDays
	
	//**마지막날짜
	private static int getLastDay(int year, int month) {
		int lastDay= 0;
		int[]months= {31,28,30,31,30,31,31,31,30,31,30,31};
		lastDay= months[month-1];
		if (month==2 &&days08.Ex05.isLeapYear(year) ) lastDay++;
		return lastDay;		
	}//getLastDay
	
	//==============================================================
	
	//[1]
	/*	
	 //**달력출력
	private static void printCalendar(int year, int month) {
		System.out.printf("\t\t[%d년 %d월]\n", year, month);
		
		int lastDay = getLastDay(year, month);
		
	}//printCalendar
	//**마지막날짜
	private static int getLastDay(int year, int month) {
		int lastDay =0;
		switch (month) {
		case 2:
			lastDay=(days08.Ex05.isLeapYear(year))?29:28;
			break;
		case 4: case 6: case 9: case 11:
			lastDay=30;
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay=31;
			break;
		}//switch
		return lastDay;
	}//getLastDay
	*/
}//class
