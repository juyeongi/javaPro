package days07;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//가위바위보게임에서
		//다시 게임을 할거냐고 묻고 
		//예(y)라고 하면 다시 실행
int com, user;
		//do~while
char con='y'; //continue
		
		try (Scanner scanner = new Scanner(System.in)){
			
			do {
				System.out.printf("> 가위(1), 바위(2), 보(3) 선택?");
				//123외의 문자열 입력시 오류, 오류날 시 다시 입력 do while
				user = scanner.nextInt();
				com = (int)(Math.random()*3)+1;
				
				String[]rockPaperScissors = new String[4];
				
				rockPaperScissors[0] = "";
				rockPaperScissors[1] = "가위";
				rockPaperScissors[2] = "바위";
				rockPaperScissors[3] = "보";
				
				System.out.printf(">컴퓨터: %s , 사용자: %s\n"
						,rockPaperScissors[com],rockPaperScissors[user]);
			
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
				
				//다시 실행..?
				System.out.print(">게임 계속 하겠습니까?");
				con= (char)System.in.read();
				System.in.skip(System.in.available());
			}	while (Character.isLowerCase('Y'));
				          //(con ='y'||con=='Y')
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		System.out.println("end");
		
		
	}//main

}//class
