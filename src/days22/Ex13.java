package days22;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Ex13 {
	public static void main(String[] args) {
//		[Comparable 인터페이스 : 기본 정렬 기준을 구현]
//		[Comparator인터페이스 : 기본 정렬 기준 외에 다른 기준으로 정렬하고자할 때 사용]
		
		String[]names= {"이지현","김호영","임경재","유희진"};
		System.out.println(Arrays.toString(names));
		
		//오름차순
//		Arrays.sort(names);
//		[김호영, 유희진, 이지현, 임경재]
//		System.out.println(Arrays.toString(names));
		
		//내림차순
		Arrays.sort(names, new StringDescendingComparator());
		System.out.println(Arrays.toString(names));

		//대소문자 구분 없이 오름차순
		Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
//		Collections.c		
		System.out.println(Arrays.toString(names));
		
	}
}
//Descending 기준만들기

class StringDescendingComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}


	
}