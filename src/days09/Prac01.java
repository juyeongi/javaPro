package days09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prac01 {
	public static void main(String[] args) {
		String rrn= "930515-2000001";
		//String birthday = getBirth(rrn);
		//System.out.println(birthday);
		
		int age = 0;
		age =getCountingAge(rrn);
		System.out.println("세는 나이");
		age =getAmericanAge(rrn);
		System.out.println("만나이");
	}//main

	private static int getAmericanAge(String rrn) {
		int birthMMdd=Integer.parseInt(getBirth(rrn).substring(4));
		Date d= new Date();
		String pattern ="MMdd";
		SimpleDateFormat sdf= new SimpleDateFormat(pattern);
		int thisMMdd= Integer.parseInt(sdf.format(d));
		
		boolean flag = thisMMdd-birthMMdd>=0;
		int americanAge= getCountingAge(rrn)-1 +(flag? 0:-1);
		return americanAge;
	}

	private static int getCountingAge(String rrn) {
		Date d =new Date();
		int thisYear = d.getYear()+1900;
		int birthYear=Integer.parseInt(rrn.substring(0,4));
		
		int countingage = thisYear - birthYear +1;
		return countingage;
	}

	private static String getBirth(String rrn) {
		int year = Integer.parseInt(rrn.substring(0,2));
		int month = Integer.parseInt(rrn.substring(2,4));
		int day = Integer.parseInt(rrn.substring(4,6));
		
		int ㅅ= getGender(rrn);
		int centry =1800;
		switch (ㅅ) {
		case 1: case 2: case 5: case 6: 
			centry=1900;
			break;
		case 3: case 4: case 7: case 8: 
			centry =2000;
			break;
		case 9: case 0:
			centry = 1800;
			break;
		}
		year = centry +year;
		String birthday =String.format("%d.%d.%d",year, month,day);
		return birthday;
	}

	private static int getGender(String rrn) {
		return rrn.charAt(7)-'0';
	}
}//class
