package days23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ex05_03 {

	public static void main(String[] args) {
		int [] score = {80, 95, 50,85,45,65,10,100};
		
		//[1]
		/*
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		} //	for
		*/
		//[2]
		//int [] -> TreeSet<E> 반환
		//int [] > ArrayList > TreeSet 변환
		//Arrays.asList(T..a배열);
		//					ㄴ T는 클래스입력
		//ArrayList<Integer> list = ;
		
		//IntStream > Int x(기본형x), Integer Stream(클래스)으로 변환
		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(score).boxed().collect(Collectors.toList());
		TreeSet<Integer>ts = new TreeSet<Integer>(list);
		//1) 75보다 큰 정수
				/*
				for (int i = 0; i < score.length; i++) {
					if (score[i]>75) System.out.println(score[i]);
				} //	for
				*/
		
		//tailSet(값)		:	지정한 값보다 큰 값의 객체들 반환
//		ts.tailSet(75);
//		ts.tailSet(75, true); //>=75
		NavigableSet<Integer> ss = ts.tailSet(75, false); //>75
		System.out.println(ss);	//[80, 85, 95, 100]
		
		//2) 50보다 작은 정수
		NavigableSet<Integer> ss2 =ts.headSet(50, false);
		System.out.println(ss2);	//[10, 45]
		
		//3) 50~75 사이의 정수
//		NavigableSet<Integer> ss3 = ss.headSet(50, false);
		//IllegalArgumentException: toKey out of range
//		System.out.println(ss3);
		
		NavigableSet<Integer>ss3 = ts.subSet(50, false, 75, false);
		System.out.println(ss3);	//[65]
		
	}

}
