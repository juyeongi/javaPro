package days23;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Ex10_02 {
	public static void main(String[] args) {
		//	[Properties 컬렉션클래스]
		//파일 읽어오기 
		String fileName = ".\\src\\com\\jdbc.properties";
		Properties p = new Properties();

		
		String comments = "jdbc configuration";
		try(FileReader	 reader	 = new FileReader(fileName)) {
			p.load(reader);

			String className=	p.getProperty("className") ;            
			String url=p.getProperty("url");                  
			String user=p.getProperty("user");                                                                   
			String password=p.getProperty("password");    
			
			System.out.println(className);
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
