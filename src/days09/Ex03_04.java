package days09;

public class Ex03_04 {
	
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
		int total =0;
		int [] m = {2,3,4,5,6,7,8,9,0,2,3,4,5};
		for (int i = 0; i <=12; i++) {
			total +=(rrn.charAt(i)-'0')*m[i];	
		} //for

		int check =( 11-total%11)%10; //%가 가장 높은 연산자. 먼저 연산
		//check %=10; // 11->1, 10->0
		
		int ㅍ =rrn.charAt(13)-'0';
		return ㅍ==check;
	}//checkRRN
	
	
	

}//class
