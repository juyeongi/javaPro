package days24;

public class Ex08 {
	//제네릭 타입
	//	1. 제네릭클래스
	//	2. 제네릭메서드
	
	public static void main(String[] args) {
		// [제네릭클래스]
		Box box1 = new Box();
//		box1.setItem(100);
//		box1.setItem("홍길동");
//		box1.setItem(3.14);
		
		//Object타입 클래스 선언시 형변환 
//		System.out.println((int)box1.getItem());
//		System.out.println((String)box1.getItem());
//		System.out.println((double)box1.getItem());
		
		//제네릭
//		Box<String> box = new Box<>();
		//		ㄴ 대입된 타입
		
		//제네릭 자동 호환됨
		Box box = new Box();
		box.item="XXXX";
		
		
	}//m
}//c
//**다양한 타입을 사용하기 위해 컴파일시 타입 결정 >> 제네릭
//[제네릭클래스]선언
//<T> == type (어떤 문자열 들어가도 상관없음) 
//	[제네릭] 용어정리
/*
 * 1) Box (클래스명) - 원시타입 (raw type)
 * 2) T 				 - 타입변수, 타입클래스
 * 3) Bpx<T>		 - 제네릭클래스 (==T(의) Box)
 */
class Box<T>{
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}


//---- 타입에 맞는 클래스 선언
/*
class Box{
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
}
*/
/*
class Box{
	double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
	
}
*/
/*
class Box{
	String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
}
*/
/*
class Box{
	int item;

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	
}
*/