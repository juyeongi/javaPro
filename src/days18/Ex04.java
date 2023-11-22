package days18;

public class Ex04 {
	//	[Object.hashCode() 메서드]
	// 해시 -> 해시함수(해싱기법)
	//  ㄴ 데이터를 관리하는 기법 중 하나
	//     데이터관리 : 저장 , 검색 ...
	//  ㄴ 객체 메모리에 저장 > 객체가 저장된 주소값 > 해시코드로 변환 > 변환값을 반환하는 메서드
	// hashCode가 같음 = 같은 주소값 = 같은 Instance
	// [참고] 동일한 객체 체크 = equals() + hashCode() 오버라이딩
	public static void main(String[] args) {
		//클래스   String은 참조형이기 때문에 new연산자로 표기해야함
		// String = ""; 으로 표기가능한 이유 "" 가 주소값을 말함.
		//String s1="홍길동";			
		//String s2="홍길동";        ==s1,s2 해시코드값 동일
													//""같은 주소값
		String s1=new String ("홍길동");
		String s2=new String ("홍길동");   // ==다른객체인데 해시코드값 동일 
														 //Stirng값(문자열)이 같으면 해시코드값이 같도록 오버라이딩됨
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
