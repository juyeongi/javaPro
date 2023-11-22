package days24;

import java.util.ArrayList;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		//Arrays : 배열을 사용하기 쉽도록 기능이 구현된 요소
		//				sort(), binarySearch(), fill(), copy()
		//Collection클래스
		
		ArrayList<Integer> list = new ArrayList<Integer>()	;
		System.out.println(list);
		
		//1,2,3,4,5
		//list.add(1)
		//				          Collection<? super Object>
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		// [3, 4, 5,1, 2]
		Collections.rotate(list, 2); //2칸씩 회전
		System.out.println(list);
		//[1, 5, 4, 2, 3]
		Collections.swap(list, 0, 2);
		System.out.println(list);
		//임의의 위치로 자리바꿈
		Collections.shuffle(list);
		Collections.shuffle(list);
		Collections.shuffle(list);
		System.out.println(list);
		//오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		//내림차순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.fill(list, -1);
		System.out.println(list);
		
//		Collections.copy(null, null);
//		Collections.replaceAll(null, null, null);
	}//m
}//c
