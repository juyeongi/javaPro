package days26;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		// [ File 클래스 ]
		//1. 가장 많이 사용하는 입출력의 대상 - 파일
		//2. 파일+디렉토리(폴더)
		String pathname = ".\\src\\days26\\Ex01.java";
//		String pathname = "E:\\Class\\Workspace\\JavaClass\\javaPro\\.\\src\\days26\\Ex01.java\r\n";
		File file = new File(pathname);
		//OS에서 사용하는 경로 구분자
		System.out.println(File.pathSeparator);	//;으로 구분
		//이름구분자
		System.out.println(File.separator);	// \로 구분
		//파일이름 반환
		String fileName=	file.getName();
		System.out.println(fileName);
		
		//확장자 제외한 파일명
		int pos = fileName.indexOf(".");
		System.out.println(fileName.substring(0,pos));
		System.out.println(fileName.substring(pos));
		
		System.out.println(FileUtil.getExtension(fileName));
		System.out.println(FileUtil.getBaseName(fileName));
		
		System.out.println("-".repeat(50));
		
		//파일 경로반환 (리턴타입 String)
		System.out.println(file.getPath());	//경로
		System.out.println(file.getAbsolutePath());	//절대경로
		System.out.println(file.getCanonicalPath());//표준경로
		
		//파일의 부모디렉토리 반환
		System.out.println(file.getParent()); //.\src\days26 문자열로 반환
		System.out.println(file.getParentFile()); //File 객체로 반환
		
		//com.util.FileUtil.java
	}//main
}//class
