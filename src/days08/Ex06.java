package days08;


	//재귀함수 (recursive function)
	//순환,되풀이되는
	//함수 안에서 자기 자신을 다시 호출하는 함수 

	//트리구조 검색 다룰 떄 사용

public class Ex06 {
	public static void main(String[] args) {
		disp();//함수 호출
		
	}//main
	
	//재귀함수
	private static void disp() {
		System.out.println(">disp()호출됨...");
		disp();//자기자신을 다시 호출하는것
	}//disp

}//class
