package days19;

import java.io.FileReader;

public class Ex09_02 {
	public static void main(String[] args) {
		//days19.Ex01.java 읽어와서 알파벳 a-z 갯수
		//배열에 저장 ###막대그래프 작성
		
		String path = ".\\src\\days19\\Ex01.java";
		//int []대문자counts =new int [26];
		//int []소문자counts =new int [26];
		//0행 대문자, 1행 소문자
		int [][] counts =new int [2][26];
		
		try(FileReader fr = new FileReader(path)) {
			int code ; 
			char one ;
			while ((code =fr.read())!=-1) {
				System.out.println(code);
				one =(char)code;
				//== 'A'<=one &&one<='Z' 
				if(Character.isUpperCase(one)) { 
					counts[0][one-'A']++;
				}else if(Character.isLowerCase(one)) {//소문자
					counts[1][one-'a']++;
				}
			}//while
			//그래프
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("[%c]문자\n", i==0?'대':'소');
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("%c(%d): %s\n",
							i==0?j+'A': j+'a', counts[i][j], "#".repeat(counts[i][j]));
				} //	for
			} //	for

		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
