package days18;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex02 {
	
	public static void main(String[] args) {
		String fileName ="days17.Ex01.java";
		
		try (FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);
				){
			String line = null;
			int lineNumber = 1;
			while ((line=br.readLine())!=null) {
				System.out.printf("%d: %s\n", lineNumber++, line);
			}//while
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
	}//main
}//class
