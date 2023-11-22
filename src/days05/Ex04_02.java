package days05;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		/*
		int sum=0;
		for (int i = 1; i <=10; i++) {
			System.out.printf(i==10?"%d":"%d+", i);
			sum+=i;

		} //for
		System.out.printf("=%d", sum);
		 */

		//문제) 두 정수 n,m을 입력받아서
		//두 정수 사이의 합을 출력.
		//예)2, 5

		int n,m, sum =0;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print(">n,m 입력");
			n=scanner.nextInt();
			m=scanner.nextInt();
			/* [1]
			for (int i = n; i <=m; i++) {
				sum+= i;
				System.out.printf("%d+",i);

			} //for
			    System.out.printf("=%d\n", sum);
			 */
			/*
			if (n>m) {
				int temp =n;
				n=m;
				m=temp;
				
			}
			
			for (int i = 0; i < args.length; i++) {
				String string = args[i];
				
			} //for
			
			
			
			/*
			int min = n>m? m:n;
			int max= n>m? n:m;
			for (int i = min; i <=max; i++) {
				sum+= i;
				System.out.printf("%d+",i);

			} //for
			 */
			
			
			 // math클래스 수학관련 매서드
			 //Math.random();
			 //Math.min();
			 //Math.max();
			 
			
			int min =Math.min(n,m);
			int max=n>m?n:m;

			for (int i = n; i <=m; i++) {
				sum+= i;
				System.out.printf("%d+",i);

			} //for
			System.out.printf("=%d\n", sum);

		} catch (Exception e) {
			e.printStackTrace();

		} //catch

	}//main
}//class
