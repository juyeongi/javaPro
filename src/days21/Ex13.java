package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex13 {
//		1. 컬렉션 클래스 - ArrayList
//				ㄴ 가장 많이 사용되는 컬렉션 클래스
//				ㄴ List 인터페이스를 구현한 클래스
//					(순서유지o, 중복허용o)
//				ㄴ 배열 요소 (Element)
//				ㄴ 배열의 단점이 보완됨	->		ArrayList (days10.Ex03)
	public static void main(String[] args) {
		String [] names = new String [3];
		names[0] = "홍길동";
		names[1] = "고길동";
		names[2] = "김둘리";
		System.out.println(names.length);
		//ArrayIndexOutOfBoundsException
//		names[3] = "이또치";
		//검색 후 출력
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("고길동")) {
				System.out.println(names[i]);
			}
		} //	for
		Arrays.fill(names, null);
		
		System.out.println(names[1]);
//		ArrayList list = new ArrayList();  //초기용량 디폴트 10개
		ArrayList list = new ArrayList(3);
		list.add("홍길동");
		list.add("고길동");
		list.add("김둘리");
		System.out.println(list.size());
		list.add("이또치");
		
		System.out.println(list.contains("고길동"));
		int index = list.indexOf("고길동");
		if (index !=-1) {
			System.out.println(list.get(index));
			list.remove(index);	//하나의 요소 삭제
			list.add(index, "고희동");	//새로운값 삽입
		}else {
			System.out.println("고길동없음");
		}//else
		System.out.println(list);
		
//		index=list.lastIndexOf("고길동");	//뒤에서부터 찾기
		//list.clear(); //모든 요소 삭제
		System.out.println(list.isEmpty());// true. 요소 비워진거 확인
		System.out.println(list);
		
//		iterator()****요소를 순차적으로 처리할 수 있는  반복자를 반환하는 메서드
								
		Iterator ir =list.iterator();
//		hasNext () : 반복처리할 요소가 있을 때 true, 없을 때 false
//		next() : 다음 요소를 얻어오는 메서드
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}//while
		
	}	
}
