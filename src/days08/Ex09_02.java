package days08;

public class Ex09_02 {
	public static void main(String[] args) {
		//lotto 배열 선언 및 생성
		//배열 초기화하지 않으면 int의 0으로 설정됨.
		int[]lotto = new int [6];
		//lotto배열 출력하는 dispLotto() 함수 선언+호출
		
		fillLotto(lotto);
		dispLotto(lotto);
		
	}//main
	//중복되지 않는 로또번호로 배열을 채우도록 코딩.
	//while 중복되지 않게 6개 배열을 다 채울 때까지
	//index=0
	
	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n",i, lotto[i]);
			
		} //for
		System.out.println();
	}//disp

	public static void fillLotto(int[] lotto) {
		int index =0; //배열에 채워넣을 위치값 total 6개 위치
		int lottoNumber=(int)(Math.random()*45)+1;
		
		lotto[index++]=	lottoNumber; //첫번째 채워짐. 처음엔 중복 제외 필요없음
		boolean flag = false; // 로또번호가 중복되면 true할당
		        //(배열의 요소에 로또번호를 채울 때까지)
		while (index<=5) {
			flag= false; //다시 돌아왔을 때 false값으로 초기화
			lottoNumber=(int)(Math.random()*45)+1;
			
			//중복확인
			for (int i = 0; i < index; i++) {// index : 이미 채워진 곳까지 중복체크
				if (lotto[i]==lottoNumber) {
					flag=true;
					break;
				}//if
			} //for
			if (! flag) 	lotto[index++]=	lottoNumber;	
		}//while
		
	}//fill
	
	/*
	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n",i, lotto[i]);
			
		} //for
		System.out.println();
	}//disp

	public static void fillLotto(int[] lotto) {
		for (int i = 0; i <lotto.length; i++) {
			int lottoNumber=(int)(Math.random()*45)+1;
			lotto[i]=lottoNumber;
		} //for
		
	}//fill
	*/

}//class
