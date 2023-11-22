package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {
//	List - ArrayList 컬렉션클래스
//	
//	String [] > ArrayList 변환
//	ArrayList >String [] 변환
	
	public static void main(String[] args) {
//		String [] > ArrayList 변환
		String [] nameArr = {"송해영","유희진","임경재","정하영"};
//		[1]
		/*
		ArrayList list = new ArrayList();
		for (int i = 0; i < nameArr.length; i++) {
			list.add(nameArr[i]);
		} //	for
		System.out.println(list);
		*/
//		[2] // <T> :Type==클래스
//		List<T> list = ListArrays.asList(T..a);
		List list =Arrays.asList(nameArr);
		System.out.println(list);
		
		
//		ArrayList
		ArrayList list2 = new ArrayList(list); //매개변수다형성
		System.out.println(list2);
		
		System.out.println(list);

	}//main

}//class
