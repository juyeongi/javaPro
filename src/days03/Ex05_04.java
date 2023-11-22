package days03;

public class Ex05_04 {

	//***논리연산자
		
		/*참/거짓을 나타냄 (boolean)
		 * 1) 일반 논리 연산자
		 *     ㄱ.  &&    : 일반 논리  AND 연산자(논리곱)
		 *         참&&참 ==> 참
		 *         참&&거짓 ==> 거짓
		 *         거짓&&참 ==> 거짓
		 *         거짓&&거짓 ==> 거짓
		 *         **둘 다 참이여야 참
		 *         
		 *     ㄴ.  ||     : 일반 논리 OR 연산자(논리합)
		 *         참||참 ==> 참
		 *         참||거짓 ==> 참
		 *         거짓||참 ==> 참
		 *         거짓||거짓 ==> 거짓
		 *         **둘 다 거짓이면 거짓
		 *         
		 *     ㄷ.  !      : 부정 NOT 연산자
		 *         !참 -->거짓
		 *         !거짓 --> 참
		 *         
		 * 2)비트 논리 연산자 : & ^ | ~    
		 */

	public static void main(String[] args) {
		
	    // 연산자 우선순위 
		//산술> 비교> 논리> 대입 순으로 연산
		/*
		System.out.println(3 <= 5  &&  10 > 1); //참
		System.out.println(3 <= 5  &&  10 < 1); //거짓
		System.out.println(3 >= 5  &&  10 > 1); //참
		// 경고: Dead code
		//&&연산자 앞의 값이 거짓이면 뒤 연산자는 처리하지않음
		System.out.println(3 >= 5  &&  10 < 1); //거짓
		*/
		/*
		System.out.println(3 <= 5  ||  10 > 1); //참
		System.out.println(3 <= 5  ||  10 < 1); //거짓
		System.out.println(3 >= 5  || 10 > 1); //거짓
		System.out.println(3 >= 5  ||  10 < 1); //거짓
		*/
		
		// The operator ! is undefined for the argument type(s) int
		// 부정연산자 ! 은 int 피연산자에 사용할 수 없다.
		//                   boolean형 앞에만 사용 가능
		//                    단항연산자로 다른 어떤 연산자보다 우선순위가 높음
		//                   ! 는 기능적으로 논리연산자이나 단항연산자로서가 우선
		//System.out.println( ! 3 <= 5);
		// '!3'가 단항연산자라 괄호처리해야 성립이 됨
		System.out.println( ! (3 <= 5));

	}//main

}//class
