package days08;

public class Ex04 {
	public static void main(String[] args) {
		
		int x=10, y=20;
		System.out.printf(">x=%d, y=%d\n",x,y);
		//main함수의 x,y
		
		/*
		int temp= x;
		x=y;
		y=temp;
		*/
		
		//Call By Value : main함수 안의 값을 넘김 swap(10, 20)
		swap(x,y);// swap 함수 호출부분, main 지역변수의 값을 넘김
		System.out.printf(">x=%d, y=%d\n",x,y);
		
	}//main
	
	//swap 함수 선언부분
	private static void swap(int x, int y) {
		//swap 지역변수 x,y = 다른기억공간. 
		System.out.printf(">swap before x=%d, y=%d\n",x,y);
		int temp= x;
		x=y;
		y=temp;
		System.out.printf(">swap after x=%d, y=%d\n",x,y);
		
		//지역변수 개념
		//매개변수를 갖고 함수를 호출할 때
		//Call By Name                          : drawLine();
		//Call By Value                           
		//Call By Reference
		//Call By Point
		
		
		
		
	}//swap
}//class
