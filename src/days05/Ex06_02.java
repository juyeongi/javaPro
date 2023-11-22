package days05;

import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) {

	      //[문제] 두 정수 n, m 을 입력받아서
	      // 두 정수 사이의  홀수의 합을 출력.  
	      int n, m, sum = 0; 
	      try ( Scanner scanner = new Scanner(System.in) ){
	         System.out.print("> n, m input ? ");
	         n = scanner.nextInt();
	         m = scanner.nextInt(); 
	         int min = Math.min(n, m);
	         int max = Math.max(n, m);
	         // 2+1   9
	         //for (int i = min%2==0?min+1:min; i <= max; i+=2) {
	         if( min % 2 == 0 ) min++;
	         // for >while문 변경
	         /*
	         int i =min;
	         while (i<=max) {
				sum+=i;
				System.out.printf("%d+",i);
				i+=2;
			}//while
			*/
	      
	         while (min<=max) {
				sum+=min;
				System.out.printf("%d+",min);
				min+=2;
			}//while
	         System.out.printf("=%d\n", sum);

	      } catch (Exception e) {
	         e.printStackTrace();
	      } // catch

	}

}
