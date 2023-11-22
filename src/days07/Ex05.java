package days07;

public class Ex05 {
	public static void main(String[] args) {
		//[정규표현식]
		/*
		//1. 주민등록번호 000000-0000000
		String rrn="123456-1234567";
		String regex="[0-9]{6}-\\d{7}";
		//숫자        [0~9]    \d
		//반복횟수   ?(0,1)     +(1,여러)    *(0,여러)
		//               (n)    (n,m) n에서 m까지,   (n, )적어도 n까지 
		if (rrn.matches(regex)) {
			System.out.println("올바른 주민등록번호 형식");
		} else {
			System.out.println("잘못된 주민등록번호 형식");
		}//if
		*/
		
		//2. 우편범호 000-000, 00000
		/*
		String zipcode ="123-456";
		String zipcode2 ="12345";
		String zipcode3 ="123456";
		String zipcode4 ="123-a45";
		String zipcode5 ="123-3456";
		*/
		
		
		String[]zipCodes= {"123-456","12345","123456","123-a45","123-3456"};
		
		String regex = "\\d{3}-\\d{3}|\\d{5}";
		boolean flag= false;
		for (int i = 0; i < zipCodes.length; i++) {
			flag=zipCodes[i].matches(regex);
			System.out.printf("%s-%s 우편번호\n", zipCodes[i], flag ? "올바른" : "잘못된"	);
			
			
		} //for
		

		
	}//main

}//class
