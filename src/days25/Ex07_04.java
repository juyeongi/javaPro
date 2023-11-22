package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex07_04 {
	public static void main(String[] args) {
		// 파일 복사
		String pathname = ".\\src\\days25\\Ex01.java";
		String copyPathname = ".\\src\\days25\\Ex01_copy.java";
		
		//>복사 처리 시간(ns) : 37317100(ns)
		//>복사 처리 시간(ns) : 991100(ns)			> buffer사용
		fileCopy_textStream(pathname,copyPathname);
	}//main

						//복사 여부 확인
	private static boolean fileCopy_textStream(String pathname, String copyPathname) {
		long start = System.nanoTime();
		final int BUFFER_SIZE =1024;		
				//읽기
		try (FileReader fr = new FileReader(pathname);
				FileWriter fw = new FileWriter(copyPathname, true);
				//버퍼기능+ 보조스트림 사용해서 파일복사
				BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);
				BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE)){
		
			//buffer크기 상관없이 라인단위로 읽어오기
			/*
			String line =null;
			itn lineNumber =1;
			while ((line = br.readLine())!=null) {
				System.out.printf("%d : %s\n", lineNumber ++ , line);
			}
			*/
			char [] cbuf = new char [BUFFER_SIZE]; //버퍼
			int readcharNumber =0;
			while ((br.read(cbuf))!=-1) { //리턴값이 int == 실제 읽어온 갯수
				bw.write(cbuf, 0 , readcharNumber); // (원래 배열 크기, 0~, 실제 사용한(읽어온) 배열 갯수)
				//bw.write(cbuf); 선언시 전체 배열을 불러와서 가비지 생김
				
				
			}
			
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
