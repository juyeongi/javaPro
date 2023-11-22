package days26;

import java.io.File;

public class Ex06_05 {
	public static void main(String[] args) {
		//days26 폴더 안 upload폴더 유무 확인 후 없으면 폴더생성
		String pathname = ".\\src\\days26";
		File dir = new File(pathname, "upload");
		System.out.println(dir.exists());//존재 유무 true/false
		// 1. createNewFile() : 파일 새로 생성
		//						이미 생성할 파일이 존재하면 false
		// 2. createTempFile("파일명",".tmp(확장자명)") : 임시파일 생성	-리턴값 File
		//	c:\\windows\\TEMP 에 파일생성
		// 3. delete() : 파일 삭제		-리턴 boolean
		// 3-2. deleteOnExit() : 응용프로그램이 종료할 때 파일 삭제
		//								 (임시파일 삭제시 사용)
		// 4. renameTo() : 파일명 변경	-리턴 boolean
		// 5. mkdir() : makedirectory 폴더생성	-리턴 boolean
		//	   mkdirs() :					폴더들생성		--리턴 boolean
		//										부모폴더 먼저 생성
		//upload 폴더생성
		if (!dir.exists()) {
			System.out.println(dir.mkdir());
		}else {
			dir.delete();
		}
	}//main
}//class
