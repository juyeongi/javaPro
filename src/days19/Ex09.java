package days19;

import java.io.FileReader;

public class Ex09 {
	public static void main(String[] args) {
		//days19.Ex01.java 읽어와서 알파벳 a-z 갯수 배열에 저장 ###막대그래프 작성
		
		// [상대경로]  파일명 앞 .  ==현재 디렉토리 ~javaPro
		//				  파일명 앞 .. == 상위 디렉토리
		String path = ".\\src\\days19\\Ex01.java";
		int []counts =new int [26];
		//count [0]  'A' 'a'
		//한 문자씩 읽어오기
		try(FileReader fr = new FileReader(path)) {
			int code ; 
			char one ;
			while ((code =fr.read())!=-1) {
				System.out.println(code);
				one =(char)code;
				//== 'A'<=one &&one<='Z' 
				if(Character.isUpperCase(one)) { 
					counts[code-'A']++; // 0,1번쨰 위치값 찾음 //one =소문자, one-'A' 오류
				}
			}//while
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("%c(%d): %s\n", i+'A', counts[i],"#".repeat(counts[i]));
			} //	for
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}//main
}//class
