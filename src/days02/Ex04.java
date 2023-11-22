package days02;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//** 두 기억공간의 값을 바꾸기 **  시험2)
		// 두 정수를 저장할 x, y 변수를 선언하고
		// 각각 10, 20으로 초기화하고
		// 출력형식 : >x=10, y=20 출력
		
		//자료형 변수형
		
		//int x;
		//int y;
		//위처럼 동일한 자료형일경우 콤마 연산자료 사용하여 나열가능 
		int x,y;
		//x =10;, y= 20;
		x= 10;
		y= 20;
		System.out.printf("교환전>x=%d, y=%d\n", x, y);
		//\n : 줄바꿈

	
		//x,y값 교환
		y=x;
		x=y;
		System.out.printf("교환후>x=%d, y=%d" , x, y);
		
		//결과값 : x=20, y=10으로 교환이 되지 않고 y=x; ,x=y; 순서되로 되어 값은 10으로 동일해짐
		
		//프로그램 상에서 두 기억공간의 값을 교환하려면
		//반드시 동일한 자료형의 임시기억공간이 필요하다. temp = 임시기억공간
		{
				int temp; // 1
				temp = x; // 2
				x = y; //3
				y = temp; //4
				
		}
	

		

		
		
		
	}//main

}//class
