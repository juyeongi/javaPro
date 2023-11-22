package days26;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public class Ex06_02 {
	//[ javaPro 모든 하위폴더, 파일목록 정보조회 ]
	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
		//E:\Class\Workspace\JavaClass\javaPro
//		System.out.println(currentDirectory);
		
		File parent = new File(currentDirectory);
//		System.out.println(parent.isDirectory()); //true
		
		//파일,폴더 유형구분
		//[1]
		/*
		String [] list = parent.list();
		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
			//파일객체생성
			File f = new File(parent,list[i]);
			System.out.printf("%s\t%s\t%d\n", f.isDirectory()?"[폴더]":"파일", f.getName(),f.length());
		} //	for
		*/
		//[2]
		String pattern = "yyyy-MM-dd a hh:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern) ;
		File [] list =parent.listFiles();
		//파일,폴더 수정날짜 반환
		for (int i = 0; i < list.length; i++) {
		//list[i].lastModified();	// 마지막 수정날짜
			Date date = new Date(list[i].lastModified());
			String 수정날짜 = sdf.format(date);
			System.out.printf("%s\t%s\t%d\n", list[i].isDirectory()?"[폴더]":"파일", list[i].getName(),list[i].length());
		} //	for
		
	}//main
}//class
