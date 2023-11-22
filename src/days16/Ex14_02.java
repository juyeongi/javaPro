package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
		//[멀티 catch문 ]
public class Ex14_02 {
	public static void main(String[] args) {
		int a=0, b=0;

		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		
		try {
			System.out.println(">a, b 두 정수 입력");
			a= scanner.nextInt();
			b= scanner.nextInt();
		
			double c = a/b;		

			System.out.printf("%d/%d=%.2f",a,b,c);
			System.out.println("정상종료");
		
		}catch (InputMismatchException |ArithmeticException e) { //or연산자로 묶기 : 멀티catch
			System.out.println("[1]\n"+e.toString());
			System.out.println("[2]\n"+e.getMessage());
	
		} catch (Exception e) { 
			e.printStackTrace(); 
			
		} finally {
			System.exit(-1);
		}

		
	}//main
}//class
