package days03;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		
		//java.util.IllegalFormatConversionException: d != java.lang.String
		//잘못된 Conversion 형식(%d)때문에 오류가 발생함
		System.out.printf("%d\n","홍길동");
		
	    //%tm %te,%tY	
		
		Calendar c = Calendar.getInstance();
		System.out.printf("%1$tm %1$te %1$ty\n", c);
		
		//printf의 기본형식
		//%[argument_index$][flags][width][.precision]conversion
		
		System.out.printf("%(d\n",-123); //(123)
		System.out.printf("%,d\n",1234123); //1,234,123****
		

	}//main

}//class
