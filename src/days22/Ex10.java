package days22;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ex10 {
	public static void main(String[] args) {
//		[큐(queue) 컬렉션인터페이스] : Collection 인터페이스를 받은 인터페이스
//		FIFO (first in first out) 구조 
//		offer() : 요소를 넣는 메서드
//		poll() : 요소를 꺼내는 메서드
//				peak() : 요소를 읽어오기만 하는 메서드
		
//		Deque (더블큐) : 양방향 queue
		
//		Queue q = new LinkedList();
		Deque q = new LinkedList();
		q.offer("유희진");
		q.offer("임경재");
		q.offer("김호영");
		q.offer("이지현");
		
//		q.offerFirst("홍길동");
//		q.offerLast()
		
//		q.pollFirst()
//		q.pollLast()
		
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
//			String name = (String) q.remove();
//			System.out.println(name);
		}
		
	}//main
}//class
