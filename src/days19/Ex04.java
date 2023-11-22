package days19;

import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) {
		//StringTokenizer클래스
		String str = "고경림,김성준,김정주,김호영";
		//String []str.split(regex);
		StringTokenizer st = new StringTokenizer(str, ",");
		//System.out.println(st.countTokens()); //잘린 문자열 갯수
		/*
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		//NoSuchElementException 예외발생, 더이상 토큰 없음
		System.out.println(st.nextToken());
		*/
		//토큰 갯수까지 출력
		//nextToken 다음토큰을 호출 후 제거.  > countTokens도 변함> 변수선언하기
		/*
		int countToken =st.countTokens();
		for (int i = 0; i <st.countTokens(); i++) {
			System.out.println(st.nextToken());
		} //	for
		*/
		while (st.hasMoreTokens()) { // true, false
			System.out.println(st.nextToken());
		}
		
	}

}
