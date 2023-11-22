
package days12;

public class Ex04 {
	public static void main(String[] args) {
		int [][]m =new int [5][5];
		
		//fillM(m);
				/*
		        [01][02][03][04][05]
				[06][07][08][09][10]
				[11][12][13][14][15]
				[16][17][18][19][20]
				[21][22][23][24][25]
				*/
		//fillM02(m);//25부터 내림차순
				/*
				[25][24][23][22][21]
				[20][19][18][17][16]
				[15][14][13][12][11]
				[10][09][08][07][06]
				[05][04][03][02][01]
				*/
		//fillM03(m);
				/*
				[05][10][15][20][25]
				[04][09][14][19][24]
				[03][08][13][18][23]
				[02][07][12][17][22]
				[01][06][11][16][21]
				*/
		//fillM04(m);
				/*
				[01][02][03][04][05]
				[10][09][08][07][06]
				[11][12][13][14][15]
				[20][19][18][17][16]
				[21][22][23][24][25]
				*/
		magicSquare(m);
		dispM(m);
		
	}//main
	
	
	

	//5행 5열(홀수) 마방진
	//1) 첫번째 행의 가운데 열 =1
	//2-1) 출력값이 5의 배수 = 행만 증가
	//2-2) 행 감소, 열 증가 반복처리
	//3)       ㄴ 행 -1행으로 벗어남 (더이상 감소시킬 수 없을 때 )-> 가장 큰 행값 처리 
	//4)       ㄴ 열 5열로 벗어남 ->같은 행가장 작은 열값 처리
	private static void magicSquare(int[][] m) {
		int n =1;
		int row=0 , col=2; //행, 열 변수 (열 분수5/2 =2)
		while(n<=25) {
			m[row][col]=n;
			
			dispM(m);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}//while문 반복될 때 출력 후 1초 (0.5초( 500 )) 쉼
			if(n%5==0) {
				row++;
			}else {
				row--; col++;
				if (col ==5) col=0; //열 벗어낫을 때
				else if (row==-1)row=4;//행 벗어났을 때
			}//if
			n++;
		}//while
			      
	}//magicSquare





	/*
	10   14
	11   14
	*/
	/*
	private static void fillM04(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			//if(i%2==0) m[i][j] =5*i+j+1;
			//else 	m[i][4-j]=5*i+j+1;
			 m[i][i%2==0?j:4-j]=5*i+j+1;
			} //for
		} //for
		
	}
	*/
	/*
	private static void fillM04(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				//if(i%2==0) m[i][j]==5*i+j+1;
				//else m[i][j]=5*(i+1)-j;
				m[i][j]= i%2==0? 5*i+j+1: 5*(i+1)-j;
			} //for
		} //for
	
	}
	*/





	//위치값 찾아서 코딩
	/*
	i 0행0열     4행4
	01            43
	02            42
	03            41
	
	행-행=4 열-열 =4
	4-i           4-j
	*/
	/*
	//2위치값
	private static void fillM02(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j] =5*i+j+1;  
			} //for
		} //for
	}	
	*/
	//2값을 맞춰서 넣은 코딩
	/*
	private static void fillM02(int[][] m) {
		for (int i = 0,n=25; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] =n--; 
			} //for
		} //for
		*/
	/*	
	00 40
	01 30
	02	 20
	03 10
	04 00
	10 41
	11 31
	12 21
	행 4-j, 열 i( i와 출력할때 j 같음)
	*/
	/*
	//3값을 계산
	private static void fillM03(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] =5-i+5*j;  //5-i 맨 앞줄 행, 5*j 열
			} //for
		} //for
	}
	*/
	//3위치값	
	/*	
	private static void fillM03(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-j][i] =5*i+j+1; 
			} //for
		} //for	
	}
	*/	

	
	/*1
	private static void fillM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] =5*i+j+1; 
			} //for
		} //for
	}
	*/	
	
	
	private static void dispM(int[][] m) {
		System.out.println("\n\n\n\n");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]",m[i][j]);
			} //for
			System.out.println();
		} //for
		
	}
}//class
