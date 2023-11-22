package days22;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex11 {
	public static void main(String[] args) {
//		PriorityQueue	FIFO구조
//		Priority우선순위
//		우선순위가 높은 것부터 꺼내오는 큐
		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		System.out.println(q);		//[1, 2, 3, 5, 4]
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());	//12345
		}//while
		//작은숫자가 우선순위가 높음
	}//main
}//class
