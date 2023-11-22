package days22;

import java.util.LinkedList;

public class Ex08_02 {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("김호영");
		list.add("이지현");
		list.add("김정주");
		System.out.println(list);
		
		list.addFirst("유희진");
		System.out.println(list);
		
		list.add(1,"임경재");
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.contains("김동현"));
		System.out.println(list.indexOf("김동현"));
		System.out.println(list.lastIndexOf("김동현"));
		
//		김정주 > 고경림 수정
		
		int index;
		if ((index = list.indexOf("김정주")) !=-1) {
			list.set(index, "고경림");
			System.out.println(list);
			
			/*
			 *		[비교]
			 *	-읽기
			 *	ArrayList : 지정 노드값을 바로 읽음
			 *	LinkdeList : 지정 노드값을 읽으려면 앞에서부터 순차적으로 읽음
			 *	-삽입/추가/삭제
			 *	ArrayList : 느림
			 *	LinkdeList	: 빠름
			 *	ArrayList : 순차적인 추가/삭제 빠름
			 *	LinkdeList	: 데이터가 많을수록 접근성이 떨어짐
			 * */
		}
	}//main
}//class
