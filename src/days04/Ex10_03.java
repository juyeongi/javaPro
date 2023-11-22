package days04;

import java.util.Scanner;

public class Ex10_03 {
	
	//**컴퓨터, 사용자user 가위바위보 게임
	public static void main(String[] args) {

		int com, user;
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.printf("> 가위(1), 바위(2), 보(3) 선택?");
		
			user = scanner.nextInt();
			com = (int)(Math.random()*3)+1;
			
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
