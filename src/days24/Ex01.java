package days24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;


public class Ex01 {
	
//	 Map 컬렉션 클래스 사용
//    key : 1조, 2조, 3조
//    value :		직위(급)과 이름을 저장하는 클래스를 선언		//MemberVO 
//         	    	그 클래스 객체를 저장하는 컬렉션 클래스 사용   
//         	    	저장하고 출력하는 코딩
	
	public static void main(String[] args) { 
		String fileName = ".\\src\\days24\\1. Java 팀 구성.txt";
		
		ArrayList<MemberVO> teamList = null;
		HashMap<String, ArrayList<MemberVO>> teamMap = new HashMap<>();
		
		String content = ""; //모든 내용
		StringBuffer sb = new StringBuffer();
		String line = null; //한 line
		
		
		try(FileReader reader= new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);
				){
//				ㄴ 보조스트림(다른 스트림의 보조역할. 매개변수에 다른스르림이 인자값으로 들어감)
			while ((line = br.readLine()) !=null ) {
//				System.out.println(line);
//				content +=line;
				sb.append(line+"\r\n");
			}//w
			content = sb.toString();
			System.out.println(content);
			
			
			//형식화클래스 
			String pattern="{0}\r\n{1}\r\n"
					+ "{2}\\r\\n{3}\\r\\n"
					+ "{4}\\r\\n{5}\\r\\n";
			MessageFormat mf = new MessageFormat(pattern);
			Object[] datas =  mf.parse(content);
			
			System.out.println(datas[0]);	//1조
			System.out.println(datas[2]);	//2조
			System.out.println(datas[4]);	//3조
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}//c
		
		
	}
}

