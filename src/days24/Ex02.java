package days24;

import java.util.Enumeration;
import java.util.Properties;

public class Ex02 {
	public static void main(String[] args) {
		//[Properties컬렉션클래스]
		//setProperty() , getProperty()
		//key >> " user.dir"
		//value >>  E:\Class\Workspace\JavaClass\javaPro
		
		//		. 현제 디렉토리( javaPro까지)
		//		.. 상위 디렉토리
		//	~~\\javaPro = 기본폴더
		/*
		String userDir =	System.getProperty("user.dir");
		System.out.println(userDir);
		*/
		
		Properties sysProps =  System.getProperties();
		Enumeration<Object> em = sysProps.keys();
		while (em.hasMoreElements()) {
			String key = (String) em.nextElement();
			String value = System.getProperty(key);
			System.out.printf("%s : %s\n", key , value);
		}
	}//m
}//c
