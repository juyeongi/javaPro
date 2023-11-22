package days25;

import java.util.Date;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		//	[ 어노테이션(Annotation)	]
		/*
		 * 1. 사전적 의미 : 주석
		 * 2. 프로그램의 소스코드 안에 다른 프로그램을 위해 미리 약속된 형식을 포함시킨것
		 * 3. 표준 어노테이션 : jdk에서 기본적으로 제공하는 어노테이션
		 * 4. 					   다른 프로그램(컴파일러)에 알려줌
		 * 5.			1) @Override : 컴파일러에게 오버라이딩한 메서드임을 알려주는 어노테이션 > 조건에 맞는지 체크해줌
		 * 				2) @SuppressWarnings : 컴파일러의 특정 경고메세지가 나타나지 않게 설정하는 어노테이션
		 * 				3) @Deprecated : 앞으로 없어질 생성자,필드,메서드.. 임을 알려주는 어노테이션
		 * 				4) @FunctionInterface : 함수형 인터페이스임을 알려주는 어노테이션
		 * 													  (람다식)
		 * 				5) @SafeVarargs : 제네릭타입의 가변인자에 사용되는 어노테이션
		 * 				6) @Native	: native메서드에서 참조되는 상수 앞에 붇는 어노테이션 (c언어 메서드)
		 * 		[메타 어노테이션] : 어노테이션에 사용되는 어노테이션
		 * 				7) @Target
		 * 				8) @Documeted
		 * 				9) @Ingerited
		 * 				10) @Retention
		 * 				11) @Repeatable
		 */
		
		//The value of the local variable scanner is not used
		// 컴파일러 선언 후 사용여부 체크 후 경고
		@SuppressWarnings("unused")
		Scanner scanner = new Scanner(System.in);
		String name = "홍길동";
		
		Date d= new Date() ;
	}

	@Override
	public String toString() {
		return "Ex04 []";
	}
	
	

}
