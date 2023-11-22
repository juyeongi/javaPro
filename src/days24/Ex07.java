package days24;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex07 {
	public static void main(String[] args) {
		/*
		 * [제네릭 (Generics)]
		 * 1. jdk1.5 -제네릭
		 * 		jdk1.8 - 람다식
		 * 2. 제네릭 : [다양한 타입]의 객체를 다루는 메서드, 컬렉션클래스에서
		 * 				 [컴파일시] 타입을 체크해주는 기능
		 * 3.	제네릭 사용이유와 장점 : 	1)	객체의 타입을 컴파일시에 체크하기 때문에 객체의 타입 안정성을 높이고
		 * 									2) 형변환의 번거로움 줄어든다.	> 코드 간결해짐
		 * 
		 */
		
		
		//제네릭 없이 사용 > 형변환해야함
		/*
		ArrayList list = new ArrayList();
		list.add("홍길동");
		String name = (String) list.get(0);
		System.out.println(name);
		
		list.add(20);
		// int <- Object.get() 다운캐스팅(형변환). 언박싱
		int age = (int) list.get(1);
		System.out.println(age);
		
		list.add(boolean);
		list.add('A');
		*/
		
		// 제네릭 클래스
		ArrayList<String> list = new ArrayList<>()	;
		//				ㄴ컴파일시 타입 지정 > 다른타입 사용불가
		list.add("홍길동");
		list.add("김정주");
		list.add("이지현");
		list.add("김호영");
		
		//제네릭 사용x > 형변환해야함
		/*
		String name = list.get(0);
		System.out.println(name);
		*/
		/*
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			//						ㄴ다운캐스팅
			System.out.println(name);
		}
		*/
		
		//제네릭 사용
		Iterator<String> ir= list.iterator();
		while (ir.hasNext()) {
			String name = ir.next();
			System.out.println(name);
		}
	}//m
}//c
