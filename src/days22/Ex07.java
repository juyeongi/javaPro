package days22;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
//		Vector 컬렉션 클래스
//		List 인터페이스 구현
//		순서유지, 중복허용
//		ArrayList와 동일
//			ㄴ (차이점) : 멀티스레드에 안전 (동기화처리 o)
		
//		StringBuilder : 멀티스레드에 안전하지 않음. 동기화처리 x
//		StringBuffer : 멀티스레드에 안전. 동기화처리 o
		
		Vector v = new Vector();
		v.addElement("홍길동"); // ==add()
		v.add("고길동");
		v.add("김둘리");
		
		
		System.out.println(v.size());
		System.out.println(v.capacity());	//용량10
		
		v.trimToSize();
		System.out.println(v.capacity());
		v.setSize(5);	// null값의 요소추가  [a][b][c][미정][미정]
//								[홍길동, 고길동, 김둘리, null, null]		
		System.out.println(v.size());
		System.out.println(v);
		
		//[n]번째 요소출력
		v.get(0);
		v.elementAt(0);
		
		//[반복자][열거자]차이점
		//[반복자] 읽어오는 중에 데이터에 변경이 있으면 즉시 예외발생
		//[열거자] 읽어오는 중에 데이터에 변경이 있어도 원래값대로 처리
		
		//반복자
		Iterator ir = v.iterator();
		//열거자	
		Enumeration en = v.elements();
//		v.elements();	
//		hesElements() 요소값 더 있는지 확인
		while (en.hasMoreElements()) {
											//다음요소를 얻어오는 메서드
			String name = (String) en.nextElement();
			System.out.println(name);
		}//while
		
		/*
		String 제거한 이름 =(String)v.remove(0);
		v.removeElementAt(0);		//리턴값 void
		*/
		
		//v(벡터) null 요소 제거한 나머지 요소 출력
		
		v.removeIf(n -> n==null);
		System.out.println(v); //[홍길동, 고길동, 김둘리]
		
		v.forEach(System.out::println);
		v.forEach(n->System.out.println(n)); // ==
		
//		v.firstElement();  ==	v.get(0);
//		v.lastElement();	==	v.get(v.size()-1);
		
//		v.insertElementAt("이또치", 1);	==	v.add("이또치");
		
//		v.listIterator();
		
		List subList = v.subList(0, 2);
		System.out.println(subList); 	//[홍길동, 고길동]
		
		
	}
}
