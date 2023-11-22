package days19;

import java.io.FileReader;

public class Ex09_03 {
	public static void main(String[] args) {
		//days19.Ex01.java 읽어와서 알파벳 a-z 갯수,0-9 숫자갯수 
		//배열에 저장 ###막대그래프 작성
		
		String path = ".\\src\\days19\\Ex01.java";
		//int []대문자counts =new int [26];
		//int []소문자counts =new int [26];
		//int [] numArr = new int [10]; 1)
		
		//0행 대문자, 1행 소문자 "가변배열 선언"
		int [][] counts =new int [3][];
		counts[0] = new int [26];
		counts[1] = new int [26];
		counts[2] = new int [10];
		
		try(FileReader fr = new FileReader(path)) {
			//int num;
			int code ; 
			char one ;
			while ((code =fr.read())!=-1) {
				//System.out.println(code);
				one =(char)code;
				//== 'A'<=one &&one<='Z' 
				if(Character.isUpperCase(one)) { 
					counts[0][one-'A']++;
				}else if(Character.isLowerCase(one)) {//소문자
					counts[1][one-'a']++;
				}else if (Character.isDigit(one)) {
					//num[one-'0']++;  2)
					counts[2][one-'0']++;
				}//if
			}//while
			//그래프
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("[%c]문자\n", i==0?'대': i==1?'소' :'숫');
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("%c(%d): %s\n"
							,i==0?j+'A': i==1? j+'a' : j+'0' 
							, counts[i][j], "#".repeat(counts[i][j]));
				} //	for
			} //	for
			//for문 숫자
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
	}//main
}//class
