package days04;

import java.util.Iterator;
import java.util.Scanner;

//***제어문

public class Ex03_02 {

	public static void main(String[] args) {
		
		int sum=0;
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d+",i);
			sum = sum +=i;
			System.out.printf("%d", sum);
			
		} //for
	}//main
	
}//class
