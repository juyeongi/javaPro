package util;

public class Draw2D {
	
	public static void drawLine() {
		
		// 		구분선 100줄
		System.out.println("--------------");
	}
	
	//Duplicate method drawLine() in type Ex08_02
	//  함수중복됨
	
	// 매개변수 자료형이 다르면 	(가능) 매개변수 갯수 타입
	public static void drawLine(int n) {
		// 		구분선 100줄
		for (int i = 0; i <=n; i++) {
			System.out.print("-");
		} //	for
		System.out.println();
	}
	
	public static void drawLine(int n, char style) {
		// 		구분선 100줄
		for (int i = 0; i <=n; i++) {
			System.out.print(style);
		} //	for
		System.out.println();
	}

}


