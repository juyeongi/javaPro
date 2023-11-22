package days13;

public class Ex10 {
	
	public static void main(String[] args) {
		/*
		// [리턴자료형 참조타입]
		
		 * Point 클래스 안에 plus point ()매서드 추가 
		 *  ㄴ Point 객체를 매개변수로 받아서
		 *  x,y  좌표로  10씩 증가시킨 후
		 *  증가시킨 좌표를 반환하는 매서드 추가
		 */
		
		Point p1 = new Point ();
		p1.x= 1;
		p1.y= 2;
		
		//객체명 (p1). 매서드명 (plusPoint)
		Point p2 = p1.plusPoint(p1);
		p2.dispXY();
		
		p2=  p1.plusPoint();
		p2.dispXY();
		
	}//main

}//class
