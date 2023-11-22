package days13;

public class Ex09 {
	//클래스 복사, 클래스 복제
	public static void main(String[] args) {
		//클래스 복사(copy)
		
		//글래스 복제(clone)
		/*		ㄴ 얕은복제
		 * 		ㄴ 깊은복제 
		 */
		
		Point p = new Point ();
		//객체명. 필드명 , 객체명. 매서드명
		p.x = 100;
		p.y = 200;
		
		//클래스 복사(동일한 인스턴스) = p2값이 바뀌면 p값에도 적용 
		Point p2 = p;
		p2.x =1;
		
		//클래스 복제( 다른 인스턴스)  = 같은 필드의 값을 가짐
		Point pclone=new  Point ();
		pclone.x = p.x;
		pclone.y = p.y;
	
	}//main
}//class
