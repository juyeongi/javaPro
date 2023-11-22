package days19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
	public static void main(String[] args) {
		//정규표현식 ( Regular Expression ) ==정규식
		//String 			Regex
		//		문자열 속에 워하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해서 사용
		//		미리 정의된 기호
		//		String.matches(regex) //정규표현식 일치여부 확인
		//		java 정규표현식과 관련된 클래스 2개
		//		1)pattern클래스
		//		2)Matcher클래스
		
		String [] data = {"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
                , "combat", "count", "date", "disc", "fx"};
		
		//		1) data배열에 들어있는 단어들 중에 c로 시작하는 단어 출력
		//		(data[i].startsWith("c"))
		//		(data[i].matches(regex)
		//
		//String regex= "c.*";  // 문자 . 아무문자나 상관없음
		
		//String regex = "c[a-zA-Z]*"; // c 시작 +영문자 0이상 올수있음
		
		//String regex = "c[a-z]"; // 소문자 c + 소문자 1개 (2문자)   =ca , co
		
		//String regex = "c\\w";  //' \w'
		// == String regex = "c[a-zA-Z0-9]"; 
		
		//String regex = ".*"; //모든문자

		//String regex = "c.*t";  //시작c t끝

		//String regex = "c[0-9]";  //
		//  ==  String regex = "c\\d";  //
		
		
		//String regex = "c[^0-9]";  // 
		//  ==  String regex = "c\\D";  //c시작 숫자 x ^부정 
		//   \\s 공백 <=> \\S !공백
		
//		String regex = "(b|c).*"; //b 또는 c
//		String regex = "[bc].*"; 

//		String regex = "[bcd].{2}"; 
//		String regex = "[bcd].{2,3}"; 
//		String regex = "[bcd].+"; // 1개이상
//		String regex = "[bcd].?"; // 0,1개

//		String regex = "[bcd].*"; //b~d까지
//		String regex = "[b-d].*"; 

		String regex = "[a-zA-Z&&[^b-d]].*"; 

		
		
		Pattern p =Pattern.compile(regex); //regex 객체 생성
		
		for (int i = 0; i < data.length; i++) {
			Matcher m =p.matcher(data[i]);
			if(m.matches()){
				System.out.println(data[i]);
			}//if
		} //	for
		
		/*  //startsWith
		for (int i = 0; i < data.length; i++) {
			if(data[i].startsWith("c")){
				System.out.println(data[i]);
			}//if
		} //	for
		*/
		
	}//main
}//class
