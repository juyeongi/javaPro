package days02;

//**음수표현
//**실수의 진법변환
public class Ex13 {
	
	public static void main(String[] args) {
		//정수 10    0000 1010
		//'A'          00000000 01000001
		
		//음수 -10   
		/*음수
		 * [2의 보수법]
		 * 1. 음수의 절대치 구하기 [-10] -> 10 ]
		 * 2. 보수                     0000 1010
		 *                               1111 0101
		 * 3. 1을 더한다                           1
		 *                               1111 0110             
		 */
		/*실수
		 * 실수의 진법변환 (~2진수)
		 * ex) 소수점이 떨어질 때까지 곱하기
		 * 0.265  x  2  = [1].25
		 * 0.25  x  2  = [0].5
		 * 0.5  x2  =  [1].0
		 *   0.625 실수 -> 0.101(2)
		 */
		
	}//main

}//class
