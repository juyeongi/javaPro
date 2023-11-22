package days15;
		//클래스들간의 관계
		//1) has-a
		//2) in-a (상속)
public class Ex02 {
	public static void main(String[] args) {
		/*
		 *[상속 (inheritance)]
		 *	기존의 클래스를 재사용하여 새로은 클래스로 작성하는 것(상속기능이 구현된 클래스)
		 *	상속의 장점
		 *		-코드 재사용 > 생산성 향상, 유지보수 용이
		 *	상속 + 클래스 선언 형식 
		 *		접 기 class 새 클래스명 extends 슈퍼클래스(기존클래스){}
		 *	기존클래스=[부모클래스], 상위클래스, [super클래스], 기초클래스
		 *	새로운클래스=[자식클래스], 하위클래스, [sub클래스], 파생클래스
		 *	ex) Point : 좌표를 관리하는 기능이 구현된 클래스
		 *		2차원	x,y좌표
		 */
		
	}//main
}//class

class Point2D{
	int x;
	int y;
	//생성자
	Point2D (){}
	Point2D (int x, int y){
		this.x=x;
		this.y=y;
	}
}
//상속
class Point3D extends Point2D{
	int z;
	//생성자 상속x 새로 구현
	Point3D(){}
	Point3D(int x, int y, int z){
		//this.x=x;
		//this.y=y;
		super(x,y); //Point2D생성자 (부모의 생성자 호출), 첫줄에 호출 (=this)
		//this(x,y); //생성자 호출 this
		this.z=z;
	}
}


/*
class Point3D{
	int x;
	int y;
	int z;
	Point3D(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	
}
*/
