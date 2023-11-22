package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.invoke.StringConcatException;

public class Ex08_05 {
	public static void main(String[] args) {
		//E:\Class\Workspace\JavaClass\javaPro
		String userDir= System.getProperty("user.dir");
		//System.out.println(userDir);
		String path = userDir.concat("\\src\\days18\\SS19.txt");
		//System.out.println(path);
		/*
		try (FileReader fr = new FileReader(path);) {
			int code;
			while ((code=fr.read()) != -1) { //파일 끝을 만났을 때 -1
				System.out.printf("%c", (char)code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		String [] nameArr = new String [20]; //배열 안에 이름넣기
		int index=0;
		try (FileReader fr = new FileReader(path);BufferedReader br = new BufferedReader(fr);) {
			String name; //br.  > 라인단위로 읽기 
			int code;
			while ((name=br.readLine()) != null) { //파일 끝을 만났을 때 -1
				System.out.printf("%s\n", name);
				nameArr[index++]=name;
			}//while
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		//구분자
		//String.join 메서드 (기억해두기)
		String nameTags = "<ol><li>".concat(String.join("</li><li>", nameArr)).concat("</li></ol>");
		System.out.println(nameTags);
	}

}
