package days17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex02_03 {
	//파일 읽어서 출력 + Try with resources
	// try ()로 리소스(자원)반납
	// int fr.read () > 한 문자로 읽음
	// 한 라인으로 읽기   == bufferedReader
	public static void main(String[] args) {
		String fileName = "C:\\Setup.log";
		
		//try (Scanner scanner= new Scanner(System.in)) {
		//} catch (Exception e) {}

		try (FileReader fr= new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);
				){

			String line = null;
			int lineNumber = 1;
			while ((line=br.readLine()) !=null) {
				System.out.printf("%d: %s\n", lineNumber++, line);
			}//while
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}//catch
	}//main
}//class
