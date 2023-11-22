package days08;

public class Ex04_02 {
	public static void main(String[] args) {
		
		//int x=10, y=20;
		//배열 초기화 
		int[]m = {10,20};// m[0]=10, m[1]=20
		System.out.printf(">x=%d, y=%d\n",m[0], m[1]);
		//main함수의 x,y
		
		/*
		int temp= x;
		x=y;
		y=temp;
		*/
		
		//Call By Value : main함수 안의 값만 넘김 swap(10, 20)  xxx
		//Call By Reference. main함수의 x,y참조(x=10, y=20) 주소값을 넘김
		//참조타입 매개변수 사용. = 배열, 클래스 , 인터페이스
		swap(m);//0x100 배열 시작 주소값
		// swap 함수 호출부분, main 지역변수의 값을 넘김
		System.out.printf(">x=%d, y=%d\n",m[0], m[1]);
		
	}//main
	
	//swap 함수 선언부분
	private static void swap(int []m) {
		 
		int temp= m[0];
		m[0]=m[1];
		m[1]=temp;
		
		//지역변수 개념
		//매개변수를 갖고 함수를 호출할 때
		//Call By Name                          : drawLine();
		//Call By Value                          : sum(1,2);
		//Call By Reference                    : 참조타입 매개변수 사용해서 주소값을 넘김 (배열,클래스..) int[]m
		//Call By Point
		
		
		
		
	}//swap
}//class
