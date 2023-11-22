package days25;

import java.io.File;
import java.io.FileWriter;

public class Ex07_02 {
	public static void main(String[] args) {
		//파일 읽어오기 실행 후
		//1. 저장할 파일명 입력   - hello.txt  + Enter 
		//2. 저장할 문자열(data) 입력	 내용입력 + Enter 
		// 계속진행
		// 문자열(data)입력	내용입력 +Enter
		// 계속진행 n
	
		//<파일 저장>
	
		String pathName = ".\\src\\days25\\Sample.txt";
		File file = new File(pathName);
		file.exists() ; // 파일 존재 유뮤를 t/f 반환
		System.out.println(file.exists());
		
		//file객체 + 문자단위 출력용스트림 생성.
															//boolean append (누적시키다)
		try(FileWriter fw = new FileWriter(file, false)) {
			//선언함수
			//추가 
//			fw.append('a');
//			fw.append("string");
			//쓰기
//			fw.write(98);
//			fw.write("write string");

			fw.write("실행2");	
			//append
			//true 속성  : 파일내용에 계속 추가됨
			//false 속성 : 파일 새로생성  덮어쓰기
			
			
			// 추가, 쓰기 ==> 출력용 스트림에 적용됨 (file객체에 실제 저장된 것x)
			
			fw.flush(); // 출력용스트림에 있는 데이터를 file객체에 저장하는 메서드
			fw.close();	// flush() 하지 않아도 close() 사용시 자동 저장됨
							// try~catch문 사용시 close() 없이도 자동 close
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//m
}//c
