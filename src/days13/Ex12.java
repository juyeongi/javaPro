package days13;

public class Ex12 {
	public static void main(String[] args) {
		
		//Ex12 클래스 , Time 클래스  패키지 내부 
		Time t = new Time ();
		t.hour = 2; // public , protected, default 접근가능
		t.minute = 20;
		t.second = 59;
		//The field Time.milisecond is not visible
		// is not visible 원인 : 접근지정자 설정
		//t.milisecond = 1999;
		/*
		 * 1. 클래스 앞에 붙는 접근지정자 설명
		 * 2. 멤버 (필드 ,메서드, 생성자constructor) 앞에 붙는 접근지정자
		 * public    : 패키지 내,외부 점근,참조 가능
		 * default    :  패키지 내부에서만 접근 참조 가능
		 * protected    :  default + [상속] ( 패키지 외부라도 상속관계 참조 가능)
		 * private    :  클래스 내에서만 접근 참조 가능
		 * 3. 범위 public > protected > default > private
		 * 
		 * 참고 ) 지역변수는 접근지정자를 사용할 수 없다.
		 */
	}

}
