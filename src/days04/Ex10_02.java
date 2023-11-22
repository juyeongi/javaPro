package days04;

public class Ex10_02 {
	public static void main(String[] args) {
		//0.0*3 <= Math.random*3 <= 1.0*3
		//0.0 <= Math.random*3 <= 3.0
		// ㄴ int 강제형변환
		//0 <= (Math.random*3)+1 < 4
		//**임의의 수 발생시키는 클래스, 매서드
		for (int i = 0; i < 100000; i++) {
			
				
			
			System.out.println((int)(Math.random()*3)+1);

		} //for
		
		
	}//main

}//class
