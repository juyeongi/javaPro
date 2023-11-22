package days17;

import java.util.Arrays;
import java.util.Scanner;

public class CutOperation {
	/*
	입력 예제 #1
	6
	5 4 4 2 2 8

	출력 예제 #1
	6
	4
	2
	1*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] sticks = new int [n];
		int sticksLength = sticks.length;
		
		for (int i  = 0; i  < sticksLength; i ++) {
			sticks[i]=scanner.nextInt();
		} //	for
		Arrays.sort(sticks);//오름차순 정렬
		System.out.println(Arrays.toString(sticks));
		
		int index =0;
		int sticksCount =sticksLength-index;
		//int sticksCount =n;
		System.out.println(sticksCount);
		
		for (int i = 0; i < sticksLength; i++) {
			if (sticks[index] != sticks[i]) {
				index = i;
				sticksCount =sticksLength-index;
				System.out.println(sticksCount);
			}
			
		} //	for
	}//main
}//class
