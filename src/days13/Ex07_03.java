package days13;

public class Ex07_03 {
	//                                  참조형 매개변수 args 
	public static void main(String[] args) {
		// 매개변수 클래스 참조타입 사용.
	//point 좌표객체 생성
	Point p = new Point ();
	p.x = 10;
	p.y = 20;
	
	System.out.printf("x= %d, y=%d\n", p.x , p.y );
		
	swap(p); //객체를 넘김
	
	System.out.printf("x= %d, y=%d\n", p.x , p.y );

	}//main

	//                                     매서드의 매개변수 Point p 객체타입
	//										ㄴ 참조형 매개변수 p
	//										(<-> 기본형 매개변수)
	private static void swap(Point p) {
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
	}
}//class
