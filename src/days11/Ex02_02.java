package days11;

import java.util.ArrayList;

public class Ex02_02 {
	//->컬렉션(collection)클래스
	public static void main(String[] args) {
		//검색(Search)
		//1. 순차검색 ( sequential Search )
		//2. 이진검색 ( binary Search )  + 정렬
		
		
		//int[]m= {3,5,2,4,1};
		//배열 m 사용 단점
		//1)요소추가 (배열크기 자동 증가/감소)
		//2)요소삽입
		//3)요소삭제
		//4)요소수정x
		
		//->컬렉션(collection)클래스
		//ArrayList<E>  <>  jdk1.5 제네릭스 
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(1);
		
		int index=list.indexOf(4);//요소위치
		System.out.println(index);
		System.out.println(list);
		list.add(index,100);//요소삽입
		System.out.println(list);
	}//main

}//class
