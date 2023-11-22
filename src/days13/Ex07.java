package days13;

public class Ex07 {
	public static void main(String[] args) {

		// Call By Reference
		// 매개변수 클래스 참조타입 사용.
		int x = 10, y = 20;
		System.out.printf("> x=%d, y=%d\n", x, y);

		swap(x, y); // Call By Value : 주소값이 넘어가지 않음 

		System.out.printf("> x=%d, y=%d\n", x, y);

	} // main

	private static void swap(int x, int y) {
		System.out.printf("> swap x=%d, y=%d\n", x, y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("> swap x=%d, y=%d\n", x, y);
	}

} // class
