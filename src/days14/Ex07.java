package days14;

//days14.Save
	//[static 키워드]
	/*
	 * 필드 앞
	 * 메서드 앞
	 * 클래스 앞
	 */
public class Ex07 {
	public static void main(String[] args) {
		//[우리반] -> 기업은행-> 보통예금
		// Save 클래스 선언 : 저축
		// 인스턴스변수 = 객체명.필드, 객체명.메서드(); : 객체마다 만들어져야 하는 변수
		// 클래스 변수 - 클래스명.static필드
		
		//rate 이자율 static 필드 선언 이유
		/*
		Save
		static double rate 필드 선언 -1번 선언. 공유해서 사용하기 때문 
		
		Method 코드 영역에 static 호출됨
		객체 생성 전(프로그램 시작 시)에 선언됨
		클래스명.필드명
		수만명의 Save 객체생성 -> name, money, rate 인스턴스 변수
		모든 사람의 rate가 동일하기 때문에 공유변수 사용
		*/
	
		//static 필드 언제사용
		//객체를 생성하지 않고 사용할 수 있음
		//객체들이 같은 값을 공유할 때 사용
		
		//정적 static 메서드 언제 사용?
		// 1)static 필드를 사용하기 위해
		// 2)
		
		
		//The field Save.rate [[is not visible]
		//메모리엔 올라가있지만 접근지정자로 인해 접근하지못함
		System.out.println(Save.getRate());
		//System.out.println(Save.rate);
		
		
		Save s1 = new Save("홍길동", 1000, 0.04);
		Save s2 = new Save("김길동", 1500, 0.04);
		Save s3 = new Save("이길동", 34500, 0.04);
		Save s4 = new Save("고길동", 5000, 0.04);
		Save s5 = new Save("박길동", 21000, 0.04);
		
		//Save.setRate(0.08);
		s1.setRate(0.06);	
		
		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
		
		
		//클래스 배열 선언
		/*
		Save [] ss = new Save[5];
		 ss[0] = new Save("홍길동", 1000, 0.04);
		 ss[1] = new Save("김길동", 1500, 0.04);
		 ss[2] = new Save("이길동", 34500, 0.04);
		 ss[3] = new Save("고길동", 5000, 0.04);
		 ss[4] = new Save("박길동", 21000, 0.04);
		*/ 
		 //초기화
		 /*
		 Save[] ss= {
			 new Save("홍길동", 1000, 0.04),
			 new Save("김길동", 1500, 0.04),
			 new Save("이길동", 34500, 0.04),
			 new Save("고길동", 5000, 0.04),
			 new Save("박길동", 21000, 0.04)
		 };
		 for (int i = 0; i < ss.length; i++) {
			ss[i].dispSave();
		} //	for
		*/
		 //[파악] 모든 사람들의 이자율(rate) 동일
		 //모든 인스턴스가 공유할 이자율 기억공간 1개 생성
		 //Save 객체가 생성될 때 마다 rate(8byte) 필드 x
		 //Save 클래스
	}//main
}//class
