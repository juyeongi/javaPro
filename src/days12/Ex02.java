package days12;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//int[]lotto =new int [6];
		int[][] lottos; //배열 생성x 선언만. 입력받고 선언
		System.out.print(">로또 게임 횟수 ?");
		int gameNumber = scanner.nextInt(); //ex 3게임
		
		//배열생성
		lottos = new int [gameNumber][6];
		
		fillLottos(lottos);
		dispLottos(lottos);
	}

	private static void fillLottos(int[][] lottos) {
		int index,n ;//index 각 게임에 채워넣을 위치값, n 랜덤하게 발생할 로또번호
		for (int i = 0; i < lottos.length; i++) {// 게임 횟수만큼 반복 for문
			// i 게임횟수
			index=0; 
			Random rnd = new Random();
			while (index<=5) {
				n= rnd.nextInt (45)+1;
				//중복되면 true
				if( ! isDuplicateLotto(lottos, i, n, index) ) {	//중복체크 *전체 배열안에서 아닌 한 행 안에서 중복이 되는지 
					lottos[i][index++]=n;
				}//if
			}//while
		
			
		} //for
		
	}

	private static boolean isDuplicateLotto(int[][] lottos, int i, int n, int index) {
		//열만큼 반복   //i 위치값
		for (int j = 0; j < lottos.length; j++) {
			if	(lottos[i][j] ==n) return true;
		} //for
		return false;
	}

	private static void dispLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d번게임] : ",i+1);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.printf("[%02d]", lottos[i][j]);
				
			} //for
			System.out.println();
		} //for
	}

}
