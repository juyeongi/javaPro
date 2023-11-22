package days10;

import java.util.Arrays;

public class Ex01_03 {
	public static void main(String[] args) {
		int n=125;  //16진수로  : 0x7D
		//0123456789a(10)bcdef(15) ==16진수
		int share, reminder;
		
		String hex ="0123456789abcdef";
		StringBuilder sb =new StringBuilder();
		while (n!=0) {
			share=n/16;
			reminder=n%16;
			
			sb.append(hex.charAt(reminder));
			n=share;
		}//while
		System.out.printf("0x%s",sb.reverse());  //reverse 문자열 뒤집기
	}//main

}//class
