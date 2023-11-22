package days09;

public class Ex03_03 {
	//  주민등록번호(rrn)
	// 1. 생년월일
	// 2. 성별, 세기, 내국인/외국인
	// 3. 세는나이, 만나이 
	// 4.
	public static void main(String[] args) {
		String rrn= "930515-2066811";
		boolean checksum= checkRRN(rrn);
		if (checksum) {
			System.out.println("올바른 주민등록번호");
		} else {
			System.out.println("잘못된 주민등록번호");
		}//if
	}//main

	private static boolean checkRRN(String rrn) {
		//매개변수 rrn읽어오기
		//1) char cahrAt() -> int
		//2) String substring(0,1) ->int
		int total =0;
		int ㄱ=rrn.charAt(0)-'0';//'9' ascii코드 0 '48'빼기
		//int ㄴ=Integer.parseInt(rrn.substring(1,2)); //'3'
		int ㄴ=rrn.charAt(1)-'0';
		int ㄷ=rrn.charAt(2)-'0';
		int ㄹ=rrn.charAt(3)-'0';
		int ㅁ=rrn.charAt(4)-'0';
		int ㅂ=rrn.charAt(5)-'0';
		//                       6   '-'
		int ㅅ=rrn.charAt(7)-'0';
		int ㅇ=rrn.charAt(8)-'0';
		int ㅈ=rrn.charAt(9)-'0';
		int ㅊ=rrn.charAt(10)-'0';
		int ㅋ=rrn.charAt(11)-'0';
		int ㅌ=rrn.charAt(12)-'0';
		total+=ㄱ*2+ㄴ*3+ㄷ*4+ㄹ*5+ㅁ*6+ㅂ*7+ㅅ*8+ㅇ*9+ㅈ*2+ㅊ*3+ㅋ*4+ㅌ*5;
		int check = 11-total%11;
		if (check==10) check=0;
		else if(check==11) check=1;
		
		int ㅍ =rrn.charAt(13)-'0';
		return ㅍ==check;
	}//checkRRN
	
	
	
	
	
	/*
	private static boolean checkRRN(String rrn) {
		int sum=0;
		for (int i = 1; i< rrn.length() ; i++) {
			for (int j =2; j <=9; j++) {
				sum= rrn*=j;
				System.out.printf("%d*%d=%d", i, j, i*j);
			} //for
			System.out.printf("%d*%d=%d", i, sum);
		} //for
		
		return false;
	}//checkRRN
	*/

}//class
