package days10;

import java.util.Arrays;

public class Ex01_02 {
	public static void main(String[] args) {
		int n=125;  //16진수로  : 0x7D
		//0123456789a(10)bcdef(15) ==16진수
		int share, reminder;
		
		char[] ch = {'0','1' , '2' , '3', '4', '5', '6', '7' , '8' , '9', 'a' , 'b' , 'c', 'd', 'e', 'f'};
		String s="";
		char one;
		while (n!=0) {
			share=n/16;
			reminder=n%16;
			
			s=ch[reminder] +s;
			n=share;
		}//while
		System.out.printf("0x%s",s);
	}//main

}//class
