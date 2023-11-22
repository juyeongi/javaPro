package days18;

import java.util.Arrays;
import java.util.Collections;

public class Ex01 {
	public static void main(String[] args) {
		int[] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		//오름차순 정렬
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		
		//[1] 내림차순
		/*
		int [] temp = new int [m.length];
		for (int i = m.length-1; i>=0; i--) {
			temp[4-i]=m[i];
		} //	for
		
		System.out.println(Arrays.toString(temp));
		*/
		//[2]내림차순 정렬 
		//*The method sort(int[]) in the type Arrays is not applicable for the arguments (int[], Collections.reverseOrder())
		// *ㄴ 기본형 int[]에는 적용 불가능, comparable인터페이스 구현된 class타입만 가능
		//*	ㄴsort(T[] a, Comparator <? super T> c) // Type의 T는 반드시 class 
		// * 		ㄴ T는 Generic Class로 어떠한 객체도 허용하게 해주었지만, int는 객체가 아닌 primitive type -> Integer []로 변환하여 사용 가능 
		
		//*Arrays.sort(m, Collections.reverseOrder());
		//*System.out.println(Arrays.toString(m));
		
		//[2]_02내림차순 정렬 
		//기본형 int[] -> Integer[] (wrapperClass) 변환
		//public final class Integer extends Number implements Comparable<Integer> {    //Integer f3
		//																인터페이스 comparable 구현됨.
		// 박싱 언박싱
		Integer[] temp= Arrays.stream(m).boxed().toArray(Integer[]::new);
		//						int[]을 Integer[](wrapperClass)로 변환 
		Arrays.sort(temp, Collections.reverseOrder());
		System.out.println(Arrays.toString(temp));
	} // main
}//class
