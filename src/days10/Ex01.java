package days10;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int n=125;  //16진수로  : 0x7D
		//0123456789a(10)bcdef(15) ==16진수
		int share, reminder;
		
		char[] ch = {'a' , 'b' , 'c', 'd', 'e', 'f'};
		String s="";
		char one;
		while (n!=0) {
			share=n/16;
			reminder=n%16;
			if (reminder >=10) one =ch[reminder-10]; 
			else one=(char)(reminder+'0'); 
			              //문자로 강제형변환시 7 -> '7' ascii '0' 48 더하기
			s=one +s;
			n=share;
		}//while
		System.out.printf("0x%s",s);
	}//main

}//class
