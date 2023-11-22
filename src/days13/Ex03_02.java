package days13;

public class Ex03_02 {

	public static void main(String[] args) {
		//int []m=new int [2];
		//java.lang.NullPointerException  **
		//클래스의 기본값 null
		int[] m = null;
		//java.lang.ArrayIndexOutOfBoundsException:   **
		// index값에서 벗어나는 배열 호출  ㄴ 배열 0,1만 선언. 2 출력불가 
		m[2]=100;
		System.out.println(m[2]);
		

	}//main
}//class
