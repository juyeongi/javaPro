package days14;

public class Ex05 {
		//[this키워드]
		/*
		 * 1. 정의 : 객체 자기 자신의 주소값을 갖는 참조변수
		 * 2. 용도 
		 * 		1)멤버를 가리킬때의 this
		 * 			tins.필드명 (this.name) this. 메서드명
		 * 			Point(int x, int y)
		 * 				this.x=x;
		 * 				this.y=y;
		 * 		2)생성자에서 또다른 생성자를 호출할 때의 this
		 * 			* 반드시 첫라인에 코딩
		 * 		3)단독으로 사용될 때의 this : 리턴값, 매개변수
		 */
	public static void main(String[] args) {
		
		Person p = new Person();
		//p 변수, [[참조변수]], 객체명
		//[name][age][gender][getter] .. -> [0x100]
		//0x100												p
 		
		// The assignment to variable x has no effect
		/*
		Point p1 = new Point (1,2);
		p1.printPoint ();
		
		Point p2 = new Point (100,200);
		p1.printPoint ();
		*/
		
		//The constructor Point(int) is undefined
		//int [] 생성안됨
		/*
		Point p3 = new Point ();
		p3.printPoint();
		*/
		Point p4 = new Point (10,20);
		//p4.offsetPoint(100);
		//p4.printPoint();
		
		p4
		  .offsetPoint(100)
		  .printPoint();
		
		
	}//main
}//class
