package days20;

import java.util.Date;
		//ms 자르기
public class Ex02_02 {
	public static void main(String[] args) {
		Date d =new Date(2023-1900,8-1,1);
//		2023. 8. 1. 오전 12:00:00
		System.out.println(d.toLocaleString());
		System.out.println(d.getTime()); //1690815600000
		
		Date today = new Date();
		today.setHours(0);
		today.setMinutes(0);
		today.setSeconds(0);
		System.out.println(d.toLocaleString());
		System.out.println(today.getTime()); //1691506800533
		
		//ms 제거
		//today와 d ms 뒤 세자리 0으로 맞춰서 같게 만들기
		long tgt = today.getTime();
		//System.out.println(tgt/1000*1000);
		
		today = new Date(tgt/1000*1000);
		System.out.println(d.toLocaleString());
		System.out.println(today.getTime());
		
		System.out.println(d.equals(today));
		System.out.println(d.before(today));
		System.out.println(d.after(today));
		
				//날짜 다음 .위치 찾아서 자르기
		int index = d.toLocaleString().lastIndexOf(".");
		System.out.println(index);
		
		
		
		/*
		String s1 = d.toLocaleString().substring(0,index);
		String s2 = d.toLocaleString().substring(0,index);
		
		System.out.println(s1.equals(s2));
		*/
	}

}
