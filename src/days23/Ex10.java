package days23;

import java.io.FileWriter;
import java.util.Properties;

public class Ex10 {
	public static void main(String[] args) {
		/*
		 * 	[Properties 컬렉션클래스]
		 * ==Hashtable 컬렉션클래스
		 * -Map
		 * -Hashtable<String,String> == Properties
		 * -key,value : String
		 * -환경설정값들을 Properties 클래스를 사용해서 저장/쓰기/읽기작업
		 * 
		 */
		//오라클 + java연동 (DB연결 설정정보) 
		//파일로 저장
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";     
		
		Properties p = new Properties();
		//p.put(Object key, Object value);
		//p.setProperty(String key, String value)
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		//p.get(Object key)
		//p.getProperty(String key)
		String value = p.getProperty("className");
		System.out.println(value);
		
		//???.properties 확장자로 저장 
		String fileName = ".\\src\\com\\util\\jdbc.properties";
		String comments = "jdbc configuration";
		try(FileWriter writer = new FileWriter(fileName)) {
			p.store(writer, comments); //다형성 p값을 writer에 입력
			System.out.println("Save End.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
