package days08;

import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6));
		System.out.println(sum(new int[] {1,2}));
		
		char one ='x';
		char upperOne= myUpperCase(one);
		System.out.println(upperOne);
	}//main

	public static char myUpperCase(char one){//(3)
		if ('a'<=one && one <='z') {
				one= (char)(one-32);
			
		}//if
		return one;
		/*(2)
		char UpperCaseOne=one;
		//return Character.toUpperCase(one);
		if (Character.isLowerCase(one)) {
			//UpperCaseOne=Character.toUpperCase(one);
			one=Character.toUpperCase(one);
			
		}//if
		
		return one;
		*/
		//return Character.toUpperCase(one); (1)
	}//upper

	private static int sum(int...args) {//가변인자 여러가지 사용 불가능.가장 마지막 매개변수로 선언해야함
		
		int result=0;
		/*
		for (int i = 0; i < args.length; i++) {
			result+= args[i];
			
		} //for
		*/
	
		//확장for문.for each 매개변수를 가변인자로 받기
		for (int i : args) {
			result +=i;
		}//foreach
		return result;
	}//sum
}//class
