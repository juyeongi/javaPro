package days24;

import java.util.Arrays;
import java.util.Comparator;


public class Ex06_02 {
	
	// 익명클래스 
	public static void main(String[] args) {

		String[]names= {"이지현","김호영","임경재","유희진"};
		System.out.println(Arrays.toString(names));
		/*
		부모타입	객체명 	= new 부모타입(매개변수){
						//필드
						//메서드
						@Overaide 재정의함수 구현		
					};
		*/
		/*
		Comparator c =new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};

		Arrays.sort(names,c);
		*/
		// Ex)
		//		sort () 호출부분에
		//		매개변수로 익명클래스 사용
		/*
		Arrays.sort(names,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		*/
		//Comparator 함수 1개만 선언 가능 
		//                   ㄴ compare
		//arrays.sort(배열, new 비교기 (Comparator))
		Arrays.sort(names, (o1, o2) -> o2.compareTo(o1));
		System.out.println(Arrays.toString(names));

	}
}
//1. Comparator 인터페이스 구현한 클래스 선언 > new연산자로 객체생성하여 사용

//Descending 기준만들기
/*
class StringDescendingComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}	
}
*/