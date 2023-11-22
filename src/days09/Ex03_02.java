package days09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03_02 {
	//[주민등록번호] : Resident Registration Number, RRN
	//생년월일
	//나이
	//성별, 내/외국인
	//검증번호
	
	public static void main(String[] args) {
		
		String rrn="990123-1700001";
		int age =0;
		//나이 출력
		//세는 나이 countingAge
		age = getCountingAge(rrn);
		System.out.println(">세는 나이: " + age);
		//만 나이  AmericanAge
		age = getAmericanAge(rrn);
		System.out.println(">만 나이: " + age);
		
	}//main
	private static int getAmericanAge(String rrn) {
		//오늘날짜 기준 생일이 지났는지 체크
		//생일이 지나지 않았다면 -1
		//만나이 =[(올해년도-생일년도+1)-1]       -1(o,x))
		//           세는나이-1         생일여부에따라-1
		
		//1999.1.23     //2023.7.25
		//생일 지남 여부에 년도는 필요없음
		//월.일 합쳐서 정수로 표기
		//오늘(725) - 생일(123)  >=0
		//1999.1.23
		int birthMMdd=Integer.parseInt(getBirth(rrn).substring(4).replace(".",""));
		//[1]
		/*
		Calendar c Calendar.getInstance();
		int thisMonth=c.get(calendar.MONTH);
		int thisDay =c.get(Calendar.DATE);//DATE==DAY_OF_MONTH
		int thisMMdd= thisMonth*100+thisDay;
		*/
		//[2] 2023[0725]==>725
		/*
		Date d =new Date();
		//년도 d.getYear()+1900
		int thisMonth = d.getMonth()+1;  //1월(0)~ 12월 (11)
		int thisDay = d.getDate();
		int thisMMdd= thisMonth*100+thisDay;
		*/
		//[3]simpleDateFormat :간단하게 날짜로부터 형식화.원하는 날짜형식 받기
		Date d =new Date();
		String pattern= "MMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		int thisMMdd= Integer.parseInt( sdf .format(d));

		boolean flag= thisMMdd- birthMMdd>=0; //ture 생일지남

		int americanAge=getCountingAge(rrn)-1 +(flag? 0:-1); 
		
		return americanAge;
	}
	private static int getCountingAge(String rrn) {
		// 올해 2023년도
		//[1]
		//Calendar c =Calendar.getInstance();
		//int thisYear=c.get(Calendar.YEAR);
		//[2]//  (date >> java.util로 불러오기)
		Date d= new Date();
		int thisYear=d.getYear()+1900;
		// 생일 1999년도
		int birthYear=Integer.parseInt(getBirth(rrn).substring(0,4));
		
		// 세는 나이 = 올해년도 - 생일년도 +1
		int CountingAge=thisYear-birthYear+1;
		return 0;
	}//counting
	
	public static int getGender(String rrn) {
		//return Integer.parseInt(rnn.substring(7,8));
		return rrn.charAt(7)-'0' ;   //'0'   48 ascii코드  int일 때 48+7로 불러옴
		//rrn.charAt(7)-'48' 
	}//getGender

	private static String getBirth(String rrn) {
		//String year = rrn.substring(0,2);
		int year = Integer.parseInt(rrn.substring(0,2));
		//String month = rrn.substring(2,4);
		int month = Integer.parseInt(rrn.substring(2,4));
		//String day = rrn.substring(4,6);
		int day = Integer.parseInt(rrn.substring(4,6));
		//System.out.printf("%s.%s.%s\n",year,month,day);
		//7번째자리로 연대 측정가능. 
		//"1999.1.23"
		int ㅅ =getGender(rrn);
		int centry=1800;
		switch (ㅅ) {
			case 1: case 2 : case 5: case  6:
				centry =1900;
				break;
			case 3: case 4: case 7: case 8:
				centry =20;
				break;
			case 9: case 0:
				centry =18;
				break;
		}
		year =centry +year;
		String birthday = String.format("%d.%d.%d",year, month, day);
		
		return birthday;
	}//getBirth



}//class
