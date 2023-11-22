package days24;

public class Ex14 {
	public static void main(String[] args) {
		//[열거형 (enums)]
		/*
		 * 1. jdk 1.5
		 * 2. 서로 관련된 실수를 편리하게 사용하기 위한 것
		 *  ex) 팀프로젝트
		 *  남/녀 체크
		 *  a팀원 1/0 체크 코딩
		 *  b팀원 true/false 체크 코딩
		 *  c팀원 'm' / 'f' 체크 코딩
		 *  표준화 x > 유지보수에 용이하지 않음
		 *  3. 열거형 선언형식
		 *  enum 열거형이름 {상수명, 상수명, ...};
		 *  4. 열거형 -> 컴파일될 때 -> 클래스로 컴파일됨 
		 *  열거형의 부모클래스는 java.lang.Enum 클래스
		 *  5. 열거형 사용방법 : 열거형이름.상수명
		 *  6. Enum클래스
		 *  	1) name() : 열거형 상수 "이름"을 문자열로 반환
		 *  	2) ordinal() : 열거형 상수가 정의된 "순서" 반환
		 *  	3) valueOf() : name과 일치하는 "열거형 상수" 반환
		 *  	4) getDeclaringClass() : 열거형의 "class객체" 반환
		 */
		Card[] cards = Card.values();
		for (Card card : cards) {
			System.out.printf("%s\t%d\n", card.name(), card.ordinal());
		}
		switch (Card.valueOf("HEART")) {
			case CLOVER:
				break;
			case DIAMOND:
				break;
			case HEART:
				System.out.println("하트");
			case SPADE:
			break;
		}
		
	}
//	class InnerA{}
//	interface InnerIA{}
//	enum InnerCard();
}
class A{
	
}
interface IA{}

//enum Card {}