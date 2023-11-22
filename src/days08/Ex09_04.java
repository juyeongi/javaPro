package days08;

import java.util.Random;

public class Ex09_04 {
	public static void main(String[] args) {
		//람다식과 스트림
		new Random().ints(1,46)//1-45정수
		.distinct()//중복제거
		.limit(6)//6개만
		.sorted()//오름차순 정렬
		.forEach(System.out::println); // 매서드 참조
		//forEach(n->System.out::println(n)); 
		
		
	}//main
}//class
