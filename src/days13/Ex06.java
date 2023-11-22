package days13;

public class Ex06 {
	public static void main(String[] args) {
		//좌표점 20개 쓰기, 읽기
		//main함수에서만 사용가능한 main.x,y 지역변수
		int x =10, y=20;
		int x1 =11, y1=21;
		int x2=12, y2=22;
		int x3 =13, y3=23;
		int x4 =14, y4=24;
		int x5 =15, y5=25;
		
		dispXY(x,y); // call by value 기억공간 안의 값을 호출하는것 
 	}//main
	
	// dispXY. x=10,y=20 지역변수 
	private static void dispXY(int x, int y) {
		System.out.printf(">x=%d, y=%d", x,y);
		
	}//disp
	
	//The variable argument type int of the method dispXY must be the last parameter
	// ... 가변인자. 여러개 사용 x
	// last parameter(마지막 인자)로 선언해서 사용했다
	/*
	private static void dispXY(int...x, int...y) {	
	}
	*/
	private static void dispXY(int []x, int []y) {
		
	}
}
