package days16;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
		// [중첩 catch]
public class Ex14_03 {
	public static void main(String[] args) {
		int a=0, b=0;

		InputStream source = System.in;
		Scanner scanner = new Scanner(source);
		
		try {
			System.out.println(">a, b 두 정수 입력");
			a= scanner.nextInt();
			b= scanner.nextInt();
			
			try {
				double c = a/b;
				System.out.printf("%d/%d=%.2f",a,b,c);
				System.out.println("정상종료");
			} catch (ArithmeticException e) {
				System.out.println(e);
			}//catch

		}catch (InputMismatchException e) { 
			try { } catch (Exception e2) {}//**trycatch 어디든 중첩가능
			System.out.println("[1]\n"+e.toString());
			System.out.println("[2]\n"+e.getMessage());
	
		} catch (Exception e) { 
			e.printStackTrace(); 
			
		} finally {
			try { } catch (Exception e2) {}//**trycatch 어디든 중첩가능
			System.exit(-1);
		}//finally

		
	}//main
}//class
