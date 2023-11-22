package days25;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex07_03 {
	public static void main(String[] args) {
		// 파일 복사
		String pathname = ".\\src\\days25\\Ex01.java";
		String copyPathname = ".\\src\\days25\\Ex01_copy.java";
		
		//>복사 처리 시간(ns) : 37317100(ns)
		fileCopy_textStream(pathname,copyPathname);
	}//main

						//복사 여부 확인
	private static boolean fileCopy_textStream(String pathname, String copyPathname) {
		long start = System.nanoTime();
				//읽기
		try (FileReader fr = new FileReader(pathname);
				FileWriter fw = new FileWriter(copyPathname, true)){
			
			int code;
			while ((code = fr.read())!=-1) {
				fw.write(code);
				System.out.println(code);
			}
			fw.flush();	//마지막 짜투리용
			System.out.println("파일 복사 완료");
			
			long end = System.nanoTime();
			System.out.printf(">복사 처리 시간(ns) : %d(ns)\n", (end-start));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}//class
