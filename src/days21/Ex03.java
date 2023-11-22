package days21;

import java.util.Date;

public class Ex03 {
	public static void main(String[] args) {
//		수료일(2023.12.27)까지 남은 기간을 아래와 같이 출력하세요 . 
//		예)27일 22시간 17분 1초 883밀초  
		
		Date eday = new Date(2023-1900,12-1,27);
		Date today = new Date();
		days20.Ex03.dispDiffDays(today, eday);
	}//main
}//class
