package days07;

import java.util.Scanner;

public class Ex04_02 {
	//5회 잘못입력시 프로그램 종료
	//실패 횟수 카운트변수 
	
	public static void main(String[] args) {
		int user;
		String inputData;
		
		Scanner scanner= new Scanner(System.in);
		
		String regex="[1-3]";
		boolean flag = false;//안써도 실행가능
		int failureNumber = 0;//실패횟수 저장변수 선언
		do {
			if (flag) {//잘못 입력하고 다시 돌아왔을 때 if
				failureNumber++;
				System.out.printf(">[알림 (%d)]입력 잘못(1~3)!!!", failureNumber);
				if (failureNumber==5) {
					System.out.println("\t[5회] 실패했기에 프로그램 종료!!!");//main함수 빠져나가기
					//break; //제어문 빠져나감
					//return; //main 빠져나감
					System.exit(-1);//int status :프로세스가 종료할 때 다른 프로세스에 넘겨줄 값 
					                                         //다른 프로세스 없기때문에 정수값 아무거나 넣기
				}//if
			}//if
			System.out.print("> 가위(1), 바위(2), 보(3) 선택?");
			inputData= scanner.next();
			flag =true;
		}while (!inputData.matches(regex));
		
			user = Integer.parseInt(inputData);
			System.out.println(user);
 
	

	}//main

}//class 
