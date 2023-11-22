package days08;

import java.util.Arrays;
import java.util.Iterator;
public class Ex03 {
	public static void main(String[] args) {
		
		int firstTerm =1;
		int secondTerm =1;
		int nextTerm;
		int sum=firstTerm+secondTerm;
		System.out.printf("%d+%d+",firstTerm, secondTerm);
		
		for (int i = 1; i <=8; i++) {
			nextTerm =firstTerm+secondTerm;
			System.out.printf("%d+",nextTerm);
			sum+=nextTerm; 
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		} //for
		System.out.printf("=%d\n", sum);

	}//main
}//class
