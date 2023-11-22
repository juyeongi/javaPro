package days19;

import java.util.Date;

public class Ex13_03 {
	public static void main(String[] args) {
		Date today = new Date();
		today.setHours(0);
		today.setMinutes(0);
		today.setSeconds(0);
		
		// today에 생성자 .. 
		
		//2023. 8. 8. 오후 5:27:45
		System.out.println(today.toLocaleString());
		System.out.println(today.getTime());
		
		Date d = new Date(2023-1900, 8-1, 8);
		System.out.println(today.toLocaleString());
		
		System.out.println(today.equals(d));
		System.out.println(d.getTime());
	}
}
