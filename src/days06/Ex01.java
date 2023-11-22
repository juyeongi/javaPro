package days06;
//5일차복습 1)
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int a, b, c ;
		try(Scanner scanner= new Scanner(System.in)) {
			System.out.print("> a, b, c input?");
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=scanner.nextInt();
			/*[1]
			if (a>b) {
				a
				if (a>C) {
					c
				} else {
					if (b>c) {
						b
					} else {

					}ifelse

				}ifelse
				
			}if
			*/
			//[2]삼항연산자
			//int max = a>b? (a>c? a:c) :(b>c? b:c);
			
			//[3]
			//int max =Math.max(a,b);
			//max= Math.max(max,c);
			//[3]_1
			
			int max=Math.max( Math.max(a, b),c);
			for (int i = 1; i< max; i++) {
				System.out.printf("%d",i);
			} //for
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}//main

}//class
