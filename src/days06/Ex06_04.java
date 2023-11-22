package days06;

public class Ex06_04 {
	public static void main(String[] args) {
		/*
		for (int k = 1; k <=2 ; k++) {
			//k=1   2
			//k=2   6
			//4*k   8
			for (int i = 4*k-2; i <=4*k+1; i++) {
				System.out.printf("  [%d]단\t", i);		// ** \t : 'tab'key 기능 (라인 맞추기)
			} //for
			System.out.println();

			for (int i =1; i <=9; i++) { //단 결정
				for (int dan = 4*k-2; dan <=4*k+1; dan++) {	
					System.out.printf("%d*%d=%02d\t ", dan, i, dan*i) ; //""마지막 개행대신 공백
				} //for i
				System.out.println(); //단 끝난 후 개행			
			} //for i
		
			System.out.println();
		}//for k	
		
		*/
		
		/*
		for (int i = 6; i <=9; i++) {
			System.out.printf("  [%d]단\t", i);
		} //for
		System.out.println();
		
		for (int i = 1; i <=9; i++) {
			for (int dan = 6; dan <=9; dan++) {
				System.out.printf("%d*%d=%02d\t", dan, i, i*dan);
			} //for
			System.out.println();
			
		} //for
		*/
		//k=1[2]	[3][4]
		//k=2[5]	[6][7]
		//k=3[8]	[9]\
		//3*k-1
		//3번반복
		
		
		for (int k = 1; k <=3 ; k++) {
			//k=1   2
			//k=2   6
			//4*k   8
			for (int dan = 3*k-1; dan <=3*k+1 && dan !=10; dan++) {
				//if(dan !=10) 
				System.out.printf("  [%d]단\t", dan);		// ** \t : 'tab'key 기능 (라인 맞추기)
			} //for
			System.out.println();

			for (int i =1; i <=9; i++) { //단 결정
				for (int dan = 3*k-1; dan <=3*k+1 && dan !=10; dan++) {	
					//if(dan !=10)  :  10단 지우는 if문           ㄴif문에 따로 넣지않고 조건식 추가
					// 4가지 식 가능 : 조건식 추가, if문, contine, break 
					System.out.printf("%d*%d=%02d\t ", dan, i, dan*i) ; //""마지막 개행대신 공백
				} //for i
				System.out.println(); //단 끝난 후 개행			
			} //for i
		
			System.out.println();
		}//for k	
				
	}//main
}//class
