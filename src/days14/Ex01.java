package days14;
// 생성자 선언
//[접근지정자][기타제어자][리턴자료형]메서드명 {
//}
public class Ex01 {
	//필드 선언
	String message=null;
	
	//디폴트생성자
	public Ex01() {
		System.out.println(">Ex01 디폴트 생성자");
		message= "안녕";
	}

	public Ex01(String msg) {
		System.out.println(">Ex01 1생성자");
		message= "안녕";//생성자로 필드 초기화
	}


	public static void main(String[] args) {
		//[객체생성+디폴트생성 호출]
		//Ex01 obj = new Ex01(); //객체생성
		Ex01 obj = new Ex01();
		//obj.message = " 어떤 메세지 ...";

		//[객체생성+ 1개 생성자 호출]
		//Ex01 obj = new Ex01("원하는 메세지");
		System.out.println(obj.message);
		/*
		 * 생성자(counstructor)
		 * 1.일종의 메서드이다. (생성자메서드)
		 * 2.메서드명 ==클래스명
		 * 3.리턴자료형을 사용하지 않는다. (void x / 리턴문 x)
		 * 4.매개변수가 없는 생성자를 디폴트 생성자(default counstructor) 라고 한다.
		 * 5.접근지정자 사용 가능 (public , default, private, protected) , 기타제어자 x
		 * 6.생성자는 임의로(인위적으로) 호출 x 
		 * 		객체명.생성자메서드() xx
		 * 		호출 시기 : 객체 생성시 자동 호출
		 * 		객체생성시 () 는 내부적으로 생성자를 호출한다는 의미
		 * 		Ex01(); -- 생성자 호출
		 * 7.생성자 역할 : 필드를 초기화하는 용도 /객체 생성할 때 - 생성자 호출. 
		 * 8.생성자는 오버로딩 (중복선언) 가능
		 * 9.클래스 선언시 생성자를 한개라도 선언하지 않으면
		 * 	  컴파일러가 자동으로 디폴트 생성자를 추가 후 컴파일한다.
		 * 10.디폴트 생성자를 선언하지 않고 생성자를 오버로딩할 때 주의사항
		 * 11.생성자는 상속x
		 */
	}//main


}
