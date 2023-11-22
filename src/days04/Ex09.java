package days04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		//국어점수 입력받아서
		//수우미양가 등급출력
		// if문 > switch문
		
		int kor ;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print(">국어점수 입력");
			kor = scanner.nextInt();
			char grade = '가';
			
			//100
			//99~90
			//89~80
			//79~70
			//69~60
			//59~0
			// switch (kor/10)    /10 = 10, 9, 8 ...
			
			switch (kor/10) {
			case 10 : case 9 :
				grade = '수'; break;
			case 8 :
				grade = '우'; break;
			case 7 :
				grade = '미'; break;
			case 6 :
				grade = '양'; break;
			default:
				grade = '가'; break;
				// break;문 생략가능 : 제어문을 빠져나오기 위에 사용
				// break;문 삭제 후 출력 오류 grade '가'
				// ㄴ 브레이크 걸릴때까지 출력. 
				
				
			}//switch
			
			System.out.println(grade);
			
			
		} catch (Exception e) {
			System.out.println("end");
		}//catch
			
		
	}//main

}//class
