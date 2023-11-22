package days04;

import java.util.Scanner;

public class Ex10 {
	
	//**컴퓨터, 사용자user 가위바위보 게임
	public static void main(String[] args) {
		// 가위 (1), 바위(2), 보(3) 정수값
		// 컴퓨터는 1~3 임의의 수를 발생
		// 사용자는 1~3 정수를 scanner 입력
		int com, user; // 컴퓨터와 유저가 낸 값을 저장하는 변수
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.printf("> 가위(1), 바위(2), 보(3) 선택?");
			//입력값에 대한 유효성 검사
			user = scanner.nextInt();
			com = (int)(Math.random()*3)+1;
			/*user -com
			 * 사용자 1  -2
			 * 컴퓨터 2  -1
			 * 그외   0
			 */
			System.out.printf(">컴퓨터: %d , 사용자: %d\n", com, user);
			switch (user - com) {
			case 1: case -2:
				System.out.println("사용자 승리");
				break;
			case 2: case -1:
				System.out.println("컴퓨터 승리");
				break;
			default:
				System.out.println("무승부");
				break;
			}//switch
			






			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main

}//class
