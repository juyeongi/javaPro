package days18;

public class Ex08 {
	
		//문자열 다루는 클래스
		//String : 변경 불가능한 클래스
		//StringBuffer
		//StringBuilder
		//StringTokenizer

	public static void main(String[] args) {
		String name = "홍길동";  // new String ("홍길동"); String은 클래스 "" 주소값이 들어감. 
		name+="님";		// 원래 있던 객체 "홍길동" 은 **사라지고** 새로운 "홍길동님" 인스턴스 생성됨 
		name+=" 안녕!!"; //"홍길동님" -> "홍길동님 안녕!!" 으로 변환  //공백읽힘
		System.out.println(name);
		
		//[1]
		System.out.println(name.length()); // "홍길동님 안녕!!"의 길이 : 9
		//[2]
		for (int i = 0; i < name.length(); i++) {
								//name.length;  ==필드. 메서드랑 다름
			System.out.printf("name[%d]=%c\n",i,name.charAt(i));
			
		} //	for
		//int[] m = {3,5,2,4,1};
		//System.out.println(m.length);
		//[3]
		String rrn = "890223-1700001";
	//	System.out.println(rrn.substring(rrn.length()-1));   //"1" 
		System.out.println(rrn.substring(7));  //"1700001"
		System.out.println(rrn.substring(0, 2));  //"89"  //beginindex (포함) <=,  < endindex (포함x)
		
		//[4] 정규표현식 패턴 일치여부 체크 : String.matches()
		String regex = "\\d{6}-\\d{7}";
		System.out.println(rrn.matches(regex));  //true
		
		//[5] concat()
		String a = "ㅁㅁㅁ"+"ㅠㅠㅠ";
		String b = "ㅁㅁㅁ".concat("ㅠㅠㅠ");
		//String a = "ㅁㅁㅁ"+"ㅠㅠㅠ"+"xxx";
		//String b = "ㅁㅁㅁ".concat("ㅠㅠㅠ").concat("xxx");
		
		//[6] System rrn.chars();
		
		//[7] 문자열 비교  ==compareTo
		//양수 음수에 따라 대소문자 위치 파악 가능
		//System.out.println("kenik".compareTo("kenik")); //int 0  >동일한 문자열이다.
		System.out.println("kEnik".compareTo("kenik")); //int -32  >대소문자 차이 "A" 65  "a"  97    -32
		System.out.println("kenik".compareTo("kEnik")); //int 32  >대소문자 차이  "a" 97  "A"  65    32 
		System.out.println("kenik".compareToIgnoreCase("kEnik")); //대소문자 없이 비교 
		
		//[8]문자열 비교 true, false   ==equals
		System.out.println("kenik".equals("kEnik"));
		System.out.println("kenik".equalsIgnoreCase("kEnik")); //대소문자 없이 비교 
		
		//[9] 문자열 포함여부 true, false   ==contains
		boolean result ="안녕하세요. 홍길동입니다.".contains("홍길동");  //true
		//boolean result ="안녕하세요. 홍길동입니다.".contains("김길동");  //false
		System.out.println(result);
		
		//[10]
		String url ="http://www.naver.com/test.jsp";
		String suffix=".html"; // 접미사
		String preffix ="http://"; //접두사
		System.out.println(url.startsWith(preffix)); 
		System.out.println(url.endsWith(suffix)); 
		
		
	}//main
}//class
