package days22;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ex14 {
	public static void main(String[] args) {
//		[Set 계열 인터페이스 구현한 컬렉션 클래스]
//			-특징 : 순서유지x, 중복허용x
//			[HashSet 컬렉션클래스]
//		Set+ 순서유지 >> LinkedHashSet
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
//		Set특징1)	[1, 9, 10, 15] 저장 순서 유지x
		System.out.println(hs);
		
		hs.add(1);
//		Set특징2)	[1, 9, 10, 15] 중복 허용x
		System.out.println(hs);
		
		System.out.println(hs.size());
		
	}//main
}//class
