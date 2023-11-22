package days03;

public class Ex06 {
	
	//삼항연산자  ?:

	public static void main(String[] args) {
		
		/*삼항연산자 항1?항2:항3
		 *              항1이 참이면 항2 ( 항1 = 수식)
		 *              항1이 거짓이면 항3             
		 */
		//삼항연산자 안에 삼항연산자가 들어갈 수 있음
		int x = 10;
		int y = ( x > 20 ? 100 : 200 ); //삼항연산자 대입연산자보다 우선순위 높음
		//     = (200)
		System.out.printf(">x=%d, y=%d\n", x, y);
		
		
	

	}

}
