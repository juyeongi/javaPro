package days22;

import java.util.Stack;

public class Ex09 {
	public static void main(String[] args) {
		//컬렉션클래스 ArrayList, Vecter, LinkedList,큐(queue)
//			[스택(stack) 컬렉션클래스]
//		마지막에 입력된 데이터가 가장 먼저 출력되는 구조 
//		LIFO(last in final out)구조
//		>>Stack 구조 활용 : 뒤로가기,앞으로가기	ex) 웹브라우저
		
//		->push() 요소를 넣는 메서드
//		<-pop() 마지막요소를 꺼내는 메서드
//			(peak() 마지막요소를 읽기만 하는 메서드)
//		empty() 요소 유무 확인
//		index search() 요소 위치찾기 (1부터 시작)
		
		//Vecter의 sub클래스  Vecter 동기화처리 o
		Stack s = new Stack();
		s.push("유희진");
		s.push("임경재");
		s.push("김호영");
		s.push("이지현");
		System.out.println(s);
		/*
		System.out.println(s.pop());	//이지현
		System.out.println(s.pop());	//김호영
		System.out.println(s.pop());	//임경재
		System.out.println(s.pop());	//유희진
		System.out.println(s.pop());	//예외발생(empty
		*/
		/*
		while (!s.empty()) {
			System.out.println(s.pop());
		}
		*/
		/*
		System.out.println(s.peek()); //이지현
		System.out.println(s.peek()); //이지현
		System.out.println(s.peek()); //이지현
		System.out.println(s.peek()); //이지현
		*/
		
		System.out.println(s.search("임경재"));
	}//main
}//class
