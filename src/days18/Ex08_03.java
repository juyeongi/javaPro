package days18;

import java.util.Arrays;

public class Ex08_03 {
	public static void main(String[] args) {
		//[11]
		String s = "안녕하세요. 입니다. 입니다. 입니다.";
		String name = "홍길동";
		//1)
		//첫번째 "입니다."를 찾기 > 앞에 "홍길동" 입력
		//"안녕하세요. 홍길동입니다. 입니다. 입니다."
		/*
		//indexOf 문자열의 위치값 알려줌. 없을 시 -1
		//int index = s.indexOf('입');  // '입'  int -> char 형변환됨
		int index = s.indexOf("입니다");  //7
		s = s.substring(0,index) +name+ s.substring(index); //처음부터 찾은 위치까지
		System.out.println(index);
		*/
		
		//[문제]
		//마지막 "입니다" 찾아서 그 앞에 "홍길동"입력
		//"안녕하세요. 입니다. 입니다. 홍길동입니다."
		//"입니다" 위치 뒤에서부터 찾기 
		/*
		String []sArr=s.split("입니다"); //잘라내기 //length-1 배열 마지막위치 
		System.out.println(Arrays.toString(sArr));
		*/
		/*
		int index = s.lastIndexOf("입니다");
		System.out.println(index);  // 
		s = s.substring(0,index) +name+ s.substring(index);
		System.out.println(s);
		*/
		/*
		int fromIndex=0;
		int Index = s.indexOf("입니다", fromIndex);
		System.out.println(Index); //7
		fromIndex=Index+"입니다".length();
		int secondIndex =s.indexOf("입니다", fromIndex);
		System.out.println(Index);  //12
		*/
		
		int fromIndex =0;
		int index =-1;
		while ((index = s.indexOf("입니다", fromIndex))!=-1) {
			System.out.println(index);//찾앗을떄
			fromIndex= index+"입니다".length();
		}//while
		//함수 만들어보기
		//메서드 : indexOf
		//매개변수 : String target, String sw(Search word), int no(순번)
		//리턴값 : int index ;
		
		
		//
		"abc".toUpperCase(); //"ABC"
		"Abc".toLowerCase(); //"abc"
		
		
		//String [] "홍길동,김길동,이길동,박길동".split(regex);
		//regex(정규표현식 )
		String [] nameArr ="홍길동,김길동,이길동,박길동".split(",",2);
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
		} //	for
	}//main
}//class
