package days16;
// 		[예외처리 ( Exception Handling)]
public class Ex13 {
	public static void main(String[] args) {
		/*
		 * 1. 프로그램 오류 - 프로그램 오작동 또는 비정상 종료되는 원인
		 * 2. 오류의 발생 시점 
		 * 		1) 컴파일 오류
		 * 			int i=10
		 * 		2) 실행 오류 == 런타임(runtime) 오류
		 * 			int [] m= null;
					m[0] = 100;
						(1) 에러 (Error) - 메모리 부족, 스택어블로워, 복구할 수 없는 심각한 오류  
								(=시스템적 오류)
								Error 클래스를 물려받은 서브클래스 [~~ Error]
						(2) 예외 (Exception) - 수습될 수 있는 오류, 개발자가 해결해야할 오류
								Exception클래스를 물려받은 서브클래스
					1) + 2) == 빌드 오류
		 * 		3) 논리적 오류 
		 * 			int a = Integer.MAX_VALUE;
					int b = a+100;
					System.out.println(b); //	-2147483549
					
				예외처리 1) try catch문
						   2) throws절
		 */

		
	}//main
}//class
