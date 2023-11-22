package days03;

public class Ex07 {
	public static void main(String[] args) {
		
		char lowerCase , upperCase; //소문자, 대문자
		
		lowerCase = 'x';
		
		//upperCase 변수에는 lowerCase의 대문자를 저장해서 출력
		//'A' 65 - 'a' 97  *차이 32
		
		//Type mismatch: cannot convert from int to char : 강제형변환 필요
		//upperCase = lowerCase-32;
		upperCase = (char) (lowerCase-32);
		System.out.printf("%c\n", upperCase);
		lowerCase = (char)(upperCase +32);
		System.out.printf("%c\n", lowerCase);

	}//main

}//class
