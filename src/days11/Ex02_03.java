package days11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex02_03 {

	public static void main(String[] args) {
		int[]m= {3,5,2,4,1};
		//int [] ->ArrayList 변환
		//[2]
		List<Integer>list=IntStream.of(m).boxed().collect(Collectors.toList());
		int index=list.indexOf(4);
		list.add(index, 100);
		/*[1]
		ArrayList list =new ArrayList();
		for (int i = 0; i < m.length; i++) {
			list.add= (m[i]);
			System.out.println(list);
			
		} //for
		*/
	}//main

}//class
