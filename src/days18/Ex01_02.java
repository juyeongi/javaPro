package days18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Ex01_02 {
	public static void main(String[] args) {
		String [] names = {
				"김호영","박정호","주강민","김정주","고경림"
		};
		//toString에 string 타입이 없어도 string출력이 가능한 이유
		//							매개변수 String[] -> object[] ==매개변수 다형성
		System.out.println(Arrays.toString(names));
		//이름을 오름차순 정렬 출력 ㄱ~ㅎ
		Arrays.sort(names); // object타입의 sort에 string이 오버로딩 되어있기 때문에 string타입 출력가능 ==다형성
		System.out.println(Arrays.toString(names));
		//이름을 내림차순 정렬 출력 ㅎ~ㄱ
		//[1] string[] 내림차순 정렬 ==별찍기 내림차순
		/* 
		String [] temp = new String [names.length];
		for (int i = names.length-1; i>=0; i--) {
			temp[4-i]=names[i];
		} //	for
		//binarySearch 이진검색
		//compare비교
		//mismatch 일치여부
		//parallelSort정렬
		System.out.println(Arrays.toString(temp));
	*/
		//[2] String [] 내림차순 정렬
		// 배열의 기능을 구현된 클래스 : Arrays 클래스
		// 컬랙션의 기능 구현된 클래스 : Collections 클래스
		/*
		 											.비교잣대
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
		*/
		//[3] String [] 내림차순 정렬
		//익명클래스 사용

		/*
		Arrays.sort(names, new Comparator<String>() {
											//add unimplement method
			@Override
			public int compare(String o1, String o2) {
				//return o1.equals(o2);
				return o2.compareTo(o1); //양수,0,음수
			}
		} );
		System.out.println(Arrays.toString(names));
		*/
		//[3]_02 익명클래스를 람다식으로 표현
		Arrays.sort(names, (o1, o2) ->o2.compareTo(o1)); //양수,0,음수
		System.out.println(Arrays.toString(names));
		
	}//main
}//class
