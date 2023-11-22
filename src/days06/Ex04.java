package days06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		String name;
		try(Scanner scanner= new Scanner(System.in)) {
			System.out.print(">name input");
			//name = scanner.next();//공백 못읽음
			name = scanner.nextLine(); //결과값의 공백도 읽음
			
			/*
			char[] nameArr= new char [name.length()];
			for (int i = 0; i < nameArr.length; i++) {
				nameArr[i]= name.charAt(i);				
			} //for
			System.out.println( Arrays.toString(nameArr));
			*/
			// String. toCharArray()  문자열을 캐릭터배열로 변환
			char[] nameArr=name.toCharArray();
			
			//<->char배열=> string
			//name= String.valueOf(nameArr);
		} catch (Exception e) {
			e.printStackTrace();		
		}//catch

		
	}//main
}//class
