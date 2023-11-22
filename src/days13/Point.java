package days13;
		//Ex10
public class Point {
	
	//필드
	public int x=0;
	public int y=0;
	public Point(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public  Point() {
	}
	//매서드
	public void dispXY() {
		System.out.printf(">x=%d,y=%d\n", x, y);
	}
	
	//매서드 추가
	//리턴자료형이 Point 클래스의 참조타입
	public Point plusPoint(Point p) {
		p.x += 10;
		p.y += 20;
		// 새로운 좌표객체를 생성해서 반환
		Point p2 = new Point ();
		p2.x = p.x +10;
		p2.y = p.y +20;
		
		return p2;
	}
	// 중복함수 (overloading)
	public Point plusPoint( ) {
		//System.out.printf(">x=%d, y=%d\n", x,y );
		// x,y 는 호출한 객체 p1의 값
		Point p2 = new Point ();
		p2.x = x +10;
		p2.y = y +20;
		return p2;
	}
}
