package days14;
public class Point {
	//필드
	private int x;
	private int y;
	
	//디폴트생성자 
	public Point() {
		this(1);
		System.out.println(">Point 디폴트 생성자 호출됨");
	}

	public Point(int x, int y) {
		System.out.println(">Point2 생성자 호출됨");
		//The assignment to variable x has no effect
		//x변수에 할당해도 영향x
		//x가 매개변수인지, 필드인지 모호함
		//x=x;
		this.x = x;
		this.y=y;
		//this 참조변수. 자신의 주소값 갖고있음. 인스턴스변수에 할당됨
		//멤버를 가리킬 때의 this
	}
	/*
	 * 객체명.메서드명();
	 * 객체명.필드명;
	 * 객체 - 주소값을 갖고있음 = 참조변수
	 */
	
	
	public Point(int i) {
		this(i,i); //Point(x,y); 2개짜리 매개변수 호출
		System.out.println(">Point1 생성자 호출됨");
		
		//this.x=i;
		//this.y=i;
	}

	//호출한 객체 p1
	//p1.printPoint ()
	// 호출한 객체의 필드 x, y
	public void printPoint() {
		System.out.printf(">x=%d, y=%d", this.x,this.y);
	}
	/*
	public void offsetPoint(int n) {
		this.x+=n;
		this.y+=n;
		//return this;
	}
	*/
	//Point 3 = p1.offsetPoint (10); --클래스 복사
	//Point p1.offsetPoint (10)
	//Point this 
	public Point offsetPoint(int n) {
		this.x +=n;
		this.y +=n;
		return this;  //this
	}
	//days15.Ex01
	//두 좌표를 더해서 새로운 좌표 반환하는 메서드 선언
	//Point p3= p1.plusPoint(p2)
	public Point plusPoint (Point p) {//point 참조형 매개변수
		int x=this.x+p.x;  // p 매개변수 (p)
		int y =this.y+p.y;
		return new Point (x,y);
		//return this == p1
	}

}
