package days18;

public class Ex08_06 {
	public static void main(String[] args) {
		String s = "";
		//String > char [] 변환
		char[] sArr= s.toCharArray();
		/*
		for(char c : sArr) {
			System.out.println(c);
		}//foreach
		*/
		
		//char [] > String 변환
		//s= String.valueOf(sArr);
		s= new String(sArr);
		
		//String (s 문자열) > byte[] 변환
		//-128~127 정수
		byte [] bArr = s.getBytes();
		
		// > byte[] >String 변환
		new String (bArr);
		//선긋기------------------------------------------
		System.out.println("-".repeat(40));
		
		String name = "			홍길동				".trim();
		System.out.printf("[%s]",name); // []공백제거 확인 입력
		
	}//main
}//class
