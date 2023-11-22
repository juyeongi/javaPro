package days22;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Ex12 {
	public static void main(String[] args) {
//		ArrayList	(<List)					요소
//		Vecter	(<List)		동기화 o		요소(element)
//		LinkedList	(<List)					요소(node)
//		Stack				FIFO구조
//							(<Vecter< List)
//		Queue
//		Deque
//		PriorityQueue
		
//		[Iterator(반복자), Enumeration(열거자)]
//		ListIterator(반복자)
//			ㄴIterator에 양방향으로 조회기능이 추가된 반복자
//				ㄴ List인터페이스를 구현한 클래스에만 사용가능
		
		Vector v= new Vector();
		
		v.add("유희진");
		v.add("임경재");
		v.add("김호영");
		v.add("이지현");
		
		ListIterator ir = v.listIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		System.out.println(">역방향 진행");
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name);
		}
		
	}//main
}//class
