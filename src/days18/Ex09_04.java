package days18;

public class Ex09_04 {
	/*
    문제 설명
    길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
    예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

    제한 조건
    n은 길이 10,000이하인 자연수입니다.
    입출력 예
    n   return
    3   "수박수"
    4   "수박수박"
    */
	public static void main(String[] args) {
		String answer = solution(5);
		System.out.println(answer);
	}//main
	
	//[1]
	/*
	public static String solution(int n) {
		//String anwer="";
		//answer+="수"; //"박"
		//return anwer;
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			if (i%2==0) {
				sb.append("수");
			} else {
				sb.append("박");
			}
		} //	for
		return sb.toString(); // 리턴값 stringbuffer x
	}
	*/
	//[2]
	/*
	public static String solution(int n) {
		//String anwer="";
		//answer+="수"; //"박"
		//return anwer;
		
		StringBuffer sb = new StringBuffer();
		boolean sw =true;
		for (int i = 0; i < n; i++) {
			if (sw) {
				sb.append("수");
			} else {
				sb.append("박");
			}
			sw=!sw;
		} //	for
		return sb.toString(); // 리턴값 stringbuffer x
	}
	*/
	//[3]
	public static String solution(int n) {
		//String anwer="";
		//answer+="수"; //"박"
		//return anwer;
		
		StringBuffer sb = new StringBuffer();
			int 몫=n/2;
			for (int i = 0; i < 몫; i++) {
				sb.append("수박");
			} //	for
			int 나머지= n%2;
			if(나머지==1) sb.append("수");
			
		return sb.toString(); // 리턴값 stringbuffer x
	}	
}//class 
