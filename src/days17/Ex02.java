package days17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
	//파일 읽어서 출력 + try - catchfinally
	public static void main(String[] args) {
		String fileName = "C:\\Setup.log";
		FileReader fr = null;								
		
		try {
			//FileReader fr = new FileReader(fileName);//FileReader =>checked예외 
			 fr = new FileReader(fileName);//FileReader =>checked예외 
			 /*
			 int one=fr.read();
			 System.out.println(one);
			 one=fr.read();
			 System.out.println(one);		
			 one=fr.read();
			 System.out.println(one);
			 */
			 //int one=fr.read();
			 //System.out.println(one)
			 int one;
			 while ((one =fr.read())!=-1) {
				System.out.printf("%c",(char)one);
			}//while
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//예외유무 상관없이 
			if (fr !=null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}//catch
			}//if
		}//catch
	}//main
}//class
