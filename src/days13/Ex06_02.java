package days13;

public class Ex06_02 {
	//좌표점 20개 쓰기, 읽기
	
	/*
	Point클래스 선언
	필드 x,y
	메서드 좌표출력메서드
	*/
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x= 10; p1.y =20;
		Point p2 = new Point();
		p1.x= 11; p2. y =21;
		Point p3 = new Point();
		p1.x= 12; p3.y =22;
		Point p4 = new Point();
		p1.x= 13; p4.y=23;
		Point p5 = new Point();
		p1.x= 14; p5.y =24;

		p1.dispXY();
		p2.dispXY();
		p3.dispXY();
		p4.dispXY();
		p5.dispXY();
	}
}
