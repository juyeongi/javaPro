package days02;

public class Ex15_02 {
	
	//**숫자형 -> 문자형""으로 변환 
	
	public static void main(String[] args) {
	
		int i = 10;
		
		// int -> String
		// 10 -> ''10" 형변환
		//[1]i +""
		
		// 1) String si = i + "" ;
		// 2) String.valueOf(i);
		// 3) Integer.toString(i);
		
		//1010
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toString(i,2));
		//"12"
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toString(i, 8));
		//"a"
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toString(i, 16));
		
		
		
		
	}//main

}//class
