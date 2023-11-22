package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex06_07 {
	public static void main(String[] args) {
		//javaPro 폴더 및 모든 하위폴더 안에 있는 모든 파일 찾아서 keyword - "fileName" 검색
		//파일명 라인번호 출력
		String currentDirectory = System.getProperty("user.dir");
		File parent = new File(currentDirectory);
//		System.out.println(currentDirectory);
		
		String keyword ="fileName";
		String pathName = ".\\src";
		File file = new File(pathName);
		File [] list = file.listFiles();
		File f = null;
		String line = null;
		int lineNumber =1;
		
		for (int i = 0; i < list.length; i++) {
			f=list[i];
			String fileName = f.getName();
			System.out.printf("====%s====\n", fileName);
			try(FileReader in = new FileReader(f);
					BufferedReader br = new BufferedReader(in)){
				while ((line = br.readLine())!=null) {
					if (line.contains(keyword)) {
						line.replace(keyword, "["+keyword+"]");
						System.out.printf("%d:%s\n", lineNumber, line);	
					}//if
					lineNumber++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} //	for
		
	}//main
}//class
