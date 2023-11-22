package days25;

import java.io.File;
import java.io.FileReader;

public class Ex07 {
	public static void main(String[] args) {
		String pathname = ".\\src\\days25\\Ex01.java";
			// .\\ 현재 디렉토리 (javaPro) = 상대경로. 기준점을 두고 경로를 찾는 것 
			//	[ File클래스 ]		:파일, 폴더(디렉토리)를 다루는 클래스
			//							ㄴ생성, 이름변경, 삭제, 정보 얻어오기 ...
		/*
		String parent= ".\\src\\days25";
		String child ="Ex01.java";
		File f = new File(parent, child);
		*/
			File file = new File(pathname);
		//객체가 파일인지 폴더인지 확인하는 메서드
		System.out.println(file.isDirectory());  //false
		System.out.println(file.isFile());	//true
		
		//파일크기
//		System.out.println(f.length());	//3273byte
		long fileLength	= file.length();
		System.out.printf("%d(byte)\n",fileLength );
		
		try (FileReader fr = new FileReader(file)){
			/*
			fr.read();
			fr.read(char[],cbuf);
			fr.read()
			*/
			
			// 라인단위로 처리하는 보조스트림 사용 
			// 한 문자 처리 > 라인 처리
			// 라인번호 붙일 때 용이
			int code;
			while ((code = fr.read()) !=-1) {
				System.out.printf("%c", (char)code);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
