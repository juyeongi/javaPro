package days05;

import java.util.Iterator;
import java.util.Scanner;
public class Ex04_03 {
	public static void main(String[] args) {
		/*
		int sum=0;
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d+", i);
			sum+=i;
				
		} //for
		System.out.printf("=%d",sum);
		*/
		//문제) 두 정수 n,m을 입력받아서
				//두 정수 사이의 합을 출력.
				//예)2, 5
		/*
		int n,m, sum=0;
		try(Scanner scanner = new Scanner(System.in )) {
			System.out.print(">n,m input ?");
			n=scanner.nextInt();
			m=scanner.nextInt();
			
			int min = Math.min(n,m);
			int max = Math.max(n, m);
			
			for (int i = min;  min<=max ; i++) {
				sum+=i;
				System.out.printf("%d+",i);
			} //for
			System.out.printf("=%d\n",
					sum);
		} catch (Exception e) {
			e.printStackTrace();
			
		}//catch
		*/
		int n, m, sum=0;
		try (Scanner scanner=new Scanner(System.in)){
			System.out.print(">n,m input?");
			n=scanner.nextInt();
			m=scanner.nextInt();
			
			int min = Math.min(n, m);
			int max = Math.max(n, m);
			if (min%2==0) min++;// {}생략
			for (int i = min; i <max; i+=2) {
				System.out.printf("%d+",i);
				sum+=i;
			} //for
			System.out.printf("=%d\n", sum);
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		
		
	}//main
	
}//class


		/*
		int  n,m, sum =0;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println(">n,m 입력");
			n=scanner.nextInt();
			m=scanner.nextInt();
			int min =Math.min(n,m);
			int max=Math.max(n,m);

			if(min%2==0) min++;
			for (int i = min; i <=max; i+=2) {
				sum+= i;
				System.out.printf("%d+",i);	
			} //for
			System.out.printf("=%d\n", sum);
	}//main
	*/


