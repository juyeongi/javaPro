package days04;

import java.util.Scanner;

public class Ex10_04 {
	
	//**컴퓨터, 사용자user 가위바위보 게임
	public static void main(String[] args) {

		int com, user;
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.printf("> 가위(1), 바위(2), 보(3) 선택?");
		
			user = scanner.nextInt();
			com = (int)(Math.random()*3)+1;
			
			
			/*
			String[]rockPaperScissors = new String[3];
			// [가위][바위][보]
			// [0]    [1]   [2]
			rockPaperScissors[0] = "가위";
			rockPaperScissors[1] = "바위";
			rockPaperScissors[2] = "보";
			
			System.out.printf(">컴퓨터: %s , 사용자: %s\n"
					,rockPaperScissors[com-1],rockPaperScissors[user-1]);
					*/
			String[]rockPaperScissors = new String[4];
			// [가위][바위][보]
			// [0]    [1]   [2]
			rockPaperScissors[0] = "";
			rockPaperScissors[1] = "가위";
			rockPaperScissors[2] = "바위";
			//ArrayIndexOutOfBoundsException:Index 3 out of bounds for length 3
			//배열의 첨자값이 범위를 벗어남
			//String[]rockPaperScissors = new String[3];
			//==>String[]rockPaperScissors = new String[4];로 변경
			rockPaperScissors[3] = "보";
			
			System.out.printf(">컴퓨터: %s , 사용자: %s\n"
					,rockPaperScissors[com],rockPaperScissors[user]);
			//System.out.printf(">컴퓨터: %s , 사용자: %s\n"
			//		,rockPaperScissors[com-1],rockPaperScissors[user-1]);
			// ㄴ가위부터[0]으로 지정했을 시 표기 -1업애려고 "";행 출력
			
			
			
			
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
		}//catch
		
	}//main

}//class
