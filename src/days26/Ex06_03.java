package days26;

import java.io.File;
import java.io.FilenameFilter;

import com.util.FileUtil;

public class Ex06_03 {
	//days26폴더 안 .java파일만 골라서 조회
	public static void main(String[] args) {
		String pathname = ".\\src\\days26";
		File dir = new File(pathname);
		
		//[3] 람다식
		File[] list =dir.listFiles((d,n) ->n.endsWith(".dat"));
	
		for (File file : list) {
			System.out.println(file.getName());
		}//foreach
		
		
		//[2]
		/*
		//익명클래스FilenameFilter
		File[] list =dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				System.out.println(dir+"***"+name);
				return name.endsWith(".dat");
			}
		});
		for (File file : list) {
			System.out.println(file.getName());
		}//foreach
		*/
		//[1]
		/*
//		String [] dir.list();
		File[] list = dir.listFiles();
		for (int i = 0; i < list.length; i++) {
			if(list[i].isFile()) {
				String fileName = list[i].getName();
				//java
				if(fileName.endsWith("dat"))
				System.out.println(fileName);
			}
//			FileUtil.getExtension(fileName).equqals(".java");
		} //	for
		*/
	}
}
