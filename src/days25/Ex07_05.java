package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex07_05 {
//		<바이트스트림>
//		FileInputStream
//		FileOutputStream
//		
	public static void main(String[] args) {
		// 실행파일(byte) 복사
		//	ㄴ 문자열 x byteStream 사용
		//E:\Class\Workspace\JavaClass
		String pathname = "E:\\Class\\Workspace\\JavaClass\\days24.zip";
		String copyPathname = "C:\\Users\\user\\Documents\\days24.zip_copy";
		
		//>복사 처리 시간(ns) : 37317100(ns)
		//>복사 처리 시간(ns) : 991100(ns)			> buffer사용
		fileCopy_InputStream(pathname,copyPathname);
		
	}//main

						//복사 여부 확인
	private static boolean fileCopy_InputStream(String pathname, String copyPathname) {
		long start = System.nanoTime();
		
		try (FileInputStream fis = new FileInputStream(pathname);
				FileOutputStream fos = new FileOutputStream(copyPathname, true)){
			int b;
			while ((b = fis.read())!=-1) {
				fos.write(b);
				
			}

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
