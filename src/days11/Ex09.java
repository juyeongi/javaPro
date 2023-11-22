package days11;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		//days08/Ex09_03. 로또 코딩
		
		Scanner scanner= new Scanner(System.in);
		
		int [][] lottos;
		
		System.out.print(">로또 게임 횟수 입력");
		int gameNumber=scanner.nextInt();
		
		lottos=new int [gameNumber][6];
		
		fillLottos(lottos);
		Lottos(lottos);
	}//main

	private static void Lottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}//disp

	private static void fillLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}//fill
}//class
