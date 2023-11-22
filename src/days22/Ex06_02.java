package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex06_02 {
//	List - ArrayList 컬렉션클래스
//	
//	String [] > ArrayList 변환
//	ArrayList >String [] 변환
	
	public static void main(String[] args) {
//		[2]ArrayList >String [] 변환
		
		ArrayList list = new ArrayList();
		list.add("신종혁");
		list.add("고재림");
		list.add("이재영");
		
		/*
		String [] nameArr = new String [list.size()];
		Iterator ir=list.iterator();
		int index = 0;
		while (ir.hasNext()) {
			String name = (String) ir.next();
			nameArr[index++]=name;
		}
		System.out.println(Arrays.toString(nameArr));
		*/
		
		//[2] 		Object[] > String[]
		//Type mismatch: cannot convert from Object[] to String[]
		String [] nameArr = (String[]) list.toArray(new String [list.size()]);
		System.out.println(Arrays.toString(nameArr));
	}//main

}//class
