package days05;

public class Ex02_02 {
	public static void main(String[] args) {

		/*	
		 * "a". charAt(0) 	
		 * char -> String 변환
		 * 1. 'a' + ""(null)
		 * 2. String.valueOf ('a');
		 * 3. Character.toString ('a');
		 */
		/*
		 * String -> char 
		 *
		 */
		String name = "TOTO";
		//원하는 위치의 한문자를 얻어오는 방법
		// char문자열.charAt(index)
		/*
		System.out.println( name, charAt (0));
		System.out.println( name, charAt (1));
		System.out.println( name, charAt (2));
		System.out.println( name, charAt (3));
		System.out.println( name, charAt (4));
		*/
		//System.out.println(문자열.length);  :문자열 길이만큼
		//System.out.println(name.length);
		
		    int length;
		    for (int i = 0; i < name.length() ; i++) {
				System.out.println( name.charAt(i));
			} //for	
		    
		    /*문자열 다루는 함수
		     * 1. split()
		     * 2. length()
		     * 3. charAt()
		     * 4. valueOf()
		     * 5. toString()
		     * 6. toCharArray()  String > char[]로 반환하는 매서드
		     */
	
  	
	}//main

}// class
