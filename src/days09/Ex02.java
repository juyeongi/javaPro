package days09;

import java.text.Format;
import java.util.Arrays;

//복습
//정수를 입력받아서 2진수로 출력하는 코딩을 하세요. 
//10 => 00000000000000000000000000001010
public class Ex02 {
	public static void main(String[] args) {
		int n=10;
		
		//[3]제어문 활용
		     //몫     //나머지
		int share, reminder;
		String s="";
		int [] binaryArr = new int [32];
		int index=binaryArr.length-1;
		
		while (n!=0) {
			share =n/2;
			reminder =n%2;
			System.out.println(reminder);
			binaryArr[index--]=reminder;
			s+=reminder;
			n=share;
		}//while
		//System.out.println(s);  //"0101"  -> "1010"
		System.out.println(Arrays.toString(binaryArr).replace(","," "));
		//String, StringBuilder, Stringbuffer 문자열 다루는 클래스
		
		
		
		/*
		share =n/2;   10/2=5  ====0
		reminder =n%2;
		System.out.println(reminder);
		n=share;

		share =n/2;    //2
		reminder =n%2;  //1
		System.out.println(reminder);
		n=share;
		
		share =n/2;    //2
		reminder =n%2;  //0
		System.out.println(reminder);
		n=share;
		share =n/2;    //1
		reminder =n%2;  //1
		
		System.out.println(reminder);
		n=share;
		*/

		//[2]
		/*
		String b=Integer.toBinaryString(n);
		System.out.println(b);
		//"1010" -> 1010
		//System.out.printf("%032d\n",Integer.parseInt(b));
		String s =String.format("%032d\n",Integer.parseInt(b));
		System.out.println(s);
		
		//2진수 변환 "1010"
		//System.out.println(Integer.toBinaryString(n));
		*/
		//[1]
		/*
		String s = "12340000000000000000000000000000"
		String b = Integer.toBinaryString(n);
		s+=b;
		System.out.println(n);
	//오버로딩
		s.substring(beginIndex);
		*/
		
	
	}
}
